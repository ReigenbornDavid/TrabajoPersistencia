/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.ejemplos;

import com.facultad.trabajopersistencia.DAO.AlumnoDao;
import com.facultad.trabajopersistencia.DAO.CiudadDao;
import com.facultad.trabajopersistencia.models.Alumno;
import com.facultad.trabajopersistencia.models.Ciudad;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 *
 * @author David
 */
public class EjemploAlumno {
    public static void Ejemplo(){
        System.out.println("Ejemplo Alumno");
        AlumnoDao alumnoDao = new AlumnoDao();
        Ciudad ciudad = new CiudadDao().GetById(1);
        Ciudad ciudad3 = new CiudadDao().GetById(3);
        
        System.out.println("Crear Alumno Sofia");
        Alumno alumno = new Alumno();
        alumno.setNombre("Sofia");
        alumno.setApellido("Lopez");
        alumno.setCiudad(ciudad);
        alumno.setDni(45741852l);
        alumno.setFechaNacimiento(LocalDate.of(2001, Month.AUGUST, 18));
        alumno.setAñoIngreso(3);
        alumno.setNumeroLegajo(20596);
        alumnoDao.Save(alumno);
        
        System.out.println("Crear Andres");
        alumno = new Alumno();
        alumno.setNombre("Andres");
        alumno.setApellido("Ramirez");
        alumno.setCiudad(ciudad3);
        alumno.setDni(42859657l);
        alumno.setFechaNacimiento(LocalDate.of(1995, Month.APRIL, 15));
        alumno.setAñoIngreso(3);
        alumno.setNumeroLegajo(21859);
        alumnoDao.Save(alumno);
        
        System.out.println("Crear Alumno Valentina");
        alumno = new Alumno();
        alumno.setNombre("Valentina");
        alumno.setApellido("Garcia");
        alumno.setCiudad(ciudad);
        alumno.setDni(40632856l);
        alumno.setFechaNacimiento(LocalDate.of(1990, Month.JANUARY, 2));
        alumno.setAñoIngreso(3);
        alumno.setNumeroLegajo(23748);
        alumnoDao.Save(alumno);
        
        System.out.println("Mostrar Alumnos");
        List<Alumno> alumnos = alumnoDao.GetAll();
        for (Alumno a : alumnos) {
            System.out.println(a.toString());
        }
        System.out.println("-----");
    }
}