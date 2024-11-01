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
import java.util.List;

/**
 *
 * @author David
 */
public class EjemploConsultasHQL {
    public static void Ejemplo(){
        System.out.println("Ejemplo Obtener todos los alumnos ordenados por Apellido");
        AlumnoDao alumnoDao = new AlumnoDao();
        List<Alumno> alumnos = alumnoDao.GetAllByApellido();
        for (Alumno a : alumnos) {
            System.out.println(a.toString());
        }
        System.out.println("-----");
        
        System.out.println("Ejemplo Obtener todos los profesores ordenados por Antigüedad");
        ProfesorDao profesorDao = new ProfesorDao();
        List<Profesor> profesores = profesorDao.GetAllByAntiguedad();
        for (Profesor p : profesores) {
            System.out.println(p.toString());
        }
        System.out.println("-----");
        
        System.out.println("Ejemplo Obtener todas las materias de un Nivel pasado como parámetro");
        MateriaDao materiaDao = new MateriaDao();
        System.out.println("Nivel 1");
        List<Materia> materias = materiaDao.GetAllByNivel(1);
        for (Materia m : materias) {
            System.out.println(m.toString());
        }
        System.out.println("Nivel 2");
        materias = materiaDao.GetAllByNivel(2);
        for (Materia m : materias) {
            System.out.println(m.toString());
        }
        System.out.println("-----");
    }
}
