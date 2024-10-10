/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.DAO;

import com.facultad.trabajopersistencia.models.Ciudad;
import com.facultad.trabajopersistencia.utils.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author David
 */
public class CiudadDao {
    
    public List<Ciudad> GetAll(){
        Session session = null;
        Transaction transaction = null;
        List<Ciudad> ciudades = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            ciudades = session.createQuery("FROM Ciudad").list();

            transaction.commit();
        } catch (Exception e){
            
            if (transaction != null){
                transaction.rollback();
            }
            
            e.printStackTrace();
        }
        finally {
           if (session != null) {
                session.close();
            }
        }
        
        return ciudades;
    }
    
    public Ciudad GetById(Integer id){
        Session session = null;
        Transaction transaction = null;
        Ciudad ciudad = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            ciudad = (Ciudad)session.get(Ciudad.class, id);

            transaction.commit();
        } catch (Exception e){
            
            if (transaction != null){
                transaction.rollback();
            }
            
            e.printStackTrace();
        }
        finally {
           if (session != null) {
                session.close();
            }
        }
        
        return ciudad;
    }
    
    public void Save(Ciudad ciudad){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.save(ciudad);

            transaction.commit();
        } catch (Exception e){
            
            if (transaction != null){
                transaction.rollback();
            }
            
            e.printStackTrace();
        }
        finally {
           if (session != null) {
                session.close();
            }
        }
    }
    
    public void Update(Ciudad ciudad){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.update(ciudad);

            transaction.commit();
        } catch (Exception e){
            
            if (transaction != null){
                transaction.rollback();
            }
            
            e.printStackTrace();
        }
        finally {
           if (session != null) {
                session.close();
            }
        }
    }
    
    public void Delete(Integer id){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            Ciudad ciudad = GetById(id);
            
            if (ciudad == null) {
                throw new Exception("No existe una Ciudad con ese ID");
            }
            
            session.delete(ciudad);

            transaction.commit();
        } catch (Exception e){
            
            if (transaction != null){
                transaction.rollback();
            }
            
            e.printStackTrace();
        }
        finally {
           if (session != null) {
                session.close();
            }
        }
    }
    
}
