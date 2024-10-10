/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author David
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSession();

    private static SessionFactory buildSession() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            System.err.println("Error al crear la SessionFactory: " + ex);
            return null;
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
