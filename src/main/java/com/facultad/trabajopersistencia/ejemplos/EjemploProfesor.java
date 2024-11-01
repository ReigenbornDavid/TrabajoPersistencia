/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.ejemplos;

import com.facultad.trabajopersistencia.DAO.CiudadDao;
import com.facultad.trabajopersistencia.DAO.ProfesorDao;
import com.facultad.trabajopersistencia.models.Ciudad;
import com.facultad.trabajopersistencia.models.Profesor;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 *
 * @author David
 */
public class EjemploProfesor {
    public static void Ejemplo(){
        System.out.println("Ejemplo Profesor");
        ProfesorDao profesorDao = new ProfesorDao();
        
        System.out.println("Crear Profesor Laura ");
        Profesor profesor = new Profesor();
        profesor.setNombre("Laura");
        profesor.setApellido("Fernandez");
        Ciudad ciudad = new CiudadDao().GetById(1);
        profesor.setCiudad(ciudad);
        profesor.setDni(36745896l);
        profesor.setFechaNacimiento(LocalDate.of(1987, Month.FEBRUARY, 3));
        profesor.setAntiguedad(15);
        profesorDao.Save(profesor);
        
        System.out.println("Crear Profesor Carlos");
        profesor = new Profesor();
        profesor.setNombre("Carlos");
        profesor.setApellido("Martinez");
        ciudad = new CiudadDao().GetById(1);
        profesor.setCiudad(ciudad);
        profesor.setDni(30528974l);
        profesor.setFechaNacimiento(LocalDate.of(1989, Month.SEPTEMBER, 17));
        profesor.setAntiguedad(10);
        profesorDao.Save(profesor);
        
        System.out.println("Mostrar Profesores");
        List<Profesor> profesores = profesorDao.GetAll();
        for (Profesor p : profesores) {
            System.out.println(p.toString());
        }
        System.out.println("-----");
    }
}