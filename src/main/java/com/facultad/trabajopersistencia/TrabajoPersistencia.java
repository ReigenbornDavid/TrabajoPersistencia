/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.facultad.trabajopersistencia;

import com.facultad.trabajopersistencia.utils.HibernateUtil;
import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author David
 */
public class TrabajoPersistencia {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        try {
            // Obtener una sesión de Hibernate
            Session session;
            var sf = HibernateUtil.getSessionFactory();
            if (sf != null) {
                session = sf.openSession();
                
                Transaction transaction = null;
                // Iniciar la transacción
                session.beginTransaction();

                // Crear un nuevo usuario
                Ciudad ciudad1 = new Ciudad();
                ciudad1.setCiudadId(3);
                ciudad1.setNombre("Resistencia");
                
                Facultad facultad = new Facultad();
                facultad.setNombre("UCCESS");
                facultad.setCiudad(ciudad1);
                
                

                 // Supongamos que ya tienes una Ciudad en la base de datos
                Ciudad ciudad = (Ciudad)session.get(Ciudad.class, 1);

                Alumno alumno = new Alumno();
                alumno.setApellido("Pérez");
                alumno.setNombre("Ana");
                alumno.setDni(87654321L);
                alumno.setFechaNacimiento(LocalDate.of(1999, 5, 20));
                alumno.setCiudad(ciudad);
                alumno.setNumeroLegajo(12345);
                alumno.setAñoIngreso(2023);

                session.save(alumno);

                // Confirmar la transacción
                session.getTransaction().commit();
                System.out.println("Ciudad guardada exitosamente!");
                session.close();
            }
            else {
                System.out.println("Error de conexion!");
            }
                    
            

        } catch (Exception e){
            
            e.printStackTrace();
        }
    }
}
