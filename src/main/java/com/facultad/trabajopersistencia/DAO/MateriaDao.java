/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.DAO;

import com.facultad.trabajopersistencia.models.Materia;
import com.facultad.trabajopersistencia.utils.HibernateUtil;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author David
 */
public class MateriaDao {
    
    public List<Materia> GetAll(){
        Session session = null;
        Transaction transaction = null;
        List<Materia> materias = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            materias = session.createQuery("FROM Materia").list();

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
        
        return materias;
    }
    
    public List<Materia> GetAllByNivel(Integer nivel){
        Session session = null;
        Transaction transaction = null;
        List<Materia> materias = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            Query query = session.createQuery("FROM Materia m where m.nivel = :nivel");
            query.setParameter("nivel", nivel);
            materias = query.list();

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
        
        return materias;
    }
    
    public Materia GetById(Integer id){
        Session session = null;
        Transaction transaction = null;
        Materia materia = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            materia = (Materia)session.get(Materia.class, id);
            //Hibernate.initialize(materia.getAlumnos());

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
        
        return materia;
    }
    
    public void Save(Materia materia){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.save(materia);

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
    
    public void Update(Materia materia){
        Session session = null;
        Transaction transaction = null;
        
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory == null) {
                throw new HibernateException("SessionFactory es null");
            }
            
            session = sessionFactory.openSession();

            transaction = session.beginTransaction();

            session.update(materia);

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

            Materia materia = GetById(id);
            
            if (materia == null) {
                throw new Exception("No existe una Materia con ese ID");
            }
            
            session.delete(materia);

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
