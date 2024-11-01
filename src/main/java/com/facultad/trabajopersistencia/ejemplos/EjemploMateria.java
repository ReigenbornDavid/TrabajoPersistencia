/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.ejemplos;

import com.facultad.trabajopersistencia.DAO.AlumnoDao;
import com.facultad.trabajopersistencia.DAO.MateriaDao;
import com.facultad.trabajopersistencia.DAO.ProfesorDao;
import com.facultad.trabajopersistencia.models.Alumno;
import com.facultad.trabajopersistencia.models.Materia;
import com.facultad.trabajopersistencia.models.Profesor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class EjemploMateria {
    public static void Ejemplo(){
        System.out.println("Ejemplo Materia");
        MateriaDao materiaDao = new MateriaDao();
        
        System.out.println("Crear Materia Matematica Elemental");
        Materia materia = new Materia();
        materia.setNombre("Matematica Elemental");
        materia.setNivel(1);
        Profesor profesor = new ProfesorDao().GetById(1);
        materia.setProfesor(profesor);
        List<Alumno> alumnos = new AlumnoDao().GetAll();
        materia.setAlumnos(alumnos);
        materiaDao.Save(materia);
        
        System.out.println("Crear Materia Modelos, Sistemas y Organizaciones");
        materia = new Materia();
        materia.setNombre("Modelos, Sistemas y Organizaciones");
        materia.setNivel(2);
        profesor = new ProfesorDao().GetById(2);
        materia.setProfesor(profesor);
        materia.setAlumnos(alumnos);
        materiaDao.Save(materia);
        
        System.out.println("Crear Materia Sistemas de Automatización de Oficinas");
        materia = new Materia();
        materia.setNombre("Sistemas de Automatización de Oficinas");
        materia.setNivel(2);
        profesor = new ProfesorDao().GetById(2);
        materia.setProfesor(profesor);
        materia.setAlumnos(alumnos);
        materiaDao.Save(materia);
        
        System.out.println("Mostrar Materias");
        List<Materia> materias = materiaDao.GetAll();
        for (Materia m : materias) {
            System.out.println(m.toString());
        }
        System.out.println("-----");
    }
}