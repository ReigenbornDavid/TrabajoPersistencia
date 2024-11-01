/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.DAO;

import com.facultad.trabajopersistencia.models.Alumno;
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
public class AlumnoDao {
    
    public List<Alumno> GetAll(){
        Session session = null;
        Transaction transaction = null;
        List<Alumno> alumnos = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            alumnos = session.createQuery("FROM Alumno").list();

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
        
        return alumnos;
    }
    
    public List<Alumno> GetAllByApellido(){
        Session session = null;
        Transaction transaction = null;
        List<Alumno> alumnos = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            alumnos = session.createQuery("FROM Alumno a ORDER BY a.apellido").list();

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
        
        return alumnos;
    }
    
    public Alumno GetById(Integer id){
        Session session = null;
        Transaction transaction = null;
        Alumno alumno = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            alumno = (Alumno)session.get(Alumno.class, id);

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
        
        return alumno;
    }
    
    public void Save(Alumno alumno){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.save(alumno);

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
    
    public void Update(Alumno alumno){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.update(alumno);

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

            Alumno alumno = GetById(id);
            
            if (alumno == null) {
                throw new Exception("No existe una Alumno con ese ID");
            }
            
            session.delete(alumno);

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
