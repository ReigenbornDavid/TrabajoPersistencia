/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.DAO;

import com.facultad.trabajopersistencia.models.Carrera;
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
public class CarreraDao {
    
    public List<Carrera> GetAll(){
        Session session = null;
        Transaction transaction = null;
        List<Carrera> carreras = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            carreras = session.createQuery("FROM Carrera").list();

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
        
        return carreras;
    }
    
    public Carrera GetById(Integer id){
        Session session = null;
        Transaction transaction = null;
        Carrera carrera = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            carrera = (Carrera)session.get(Carrera.class, id);

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
        
        return carrera;
    }
    
    public void Save(Carrera carrera){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.save(carrera);

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
    
    public void Update(Carrera carrera){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.update(carrera);

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

            Carrera carrera = GetById(id);
            
            if (carrera == null) {
                throw new Exception("No existe una Carrera con ese ID");
            }
            
            session.delete(carrera);

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
