/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.DAO;

import com.facultad.trabajopersistencia.models.Profesor;
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
public class ProfesorDao {
    
    public List<Profesor> GetAll(){
        Session session = null;
        Transaction transaction = null;
        List<Profesor> profesores = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            profesores = session.createQuery("FROM Profesor").list();

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
        
        return profesores;
    }

    public List<Profesor> GetAllByAntiguedad(){
        Session session = null;
        Transaction transaction = null;
        List<Profesor> profesores = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            profesores = session.createQuery("FROM Profesor p ORDER BY p.antiguedad").list();

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
        
        return profesores;
    }
    
    public Profesor GetById(Integer id){
        Session session = null;
        Transaction transaction = null;
        Profesor profesor = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            profesor = (Profesor)session.get(Profesor.class, id);

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
        
        return profesor;
    }
    
    public void Save(Profesor profesor){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.save(profesor);

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
    
    public void Update(Profesor profesor){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.update(profesor);

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

            Profesor profesor = GetById(id);
            
            if (profesor == null) {
                throw new Exception("No existe una Profesor con ese ID");
            }
            
            session.delete(profesor);

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
