/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.ejemplos;

import com.facultad.trabajopersistencia.DAO.CarreraDao;
import com.facultad.trabajopersistencia.DAO.CiudadDao;
import com.facultad.trabajopersistencia.DAO.FacultadDao;
import com.facultad.trabajopersistencia.DAO.MateriaDao;
import com.facultad.trabajopersistencia.models.Carrera;
import com.facultad.trabajopersistencia.models.Ciudad;
import com.facultad.trabajopersistencia.models.Facultad;
import com.facultad.trabajopersistencia.models.Materia;
import java.util.List;

/**
 *
 * @author David
 */
public class EjemploCarrera {
    public static void Ejemplo(){
        System.out.println("Ejemplo Carrera");
        CarreraDao carreraDao = new CarreraDao();
        
        System.out.println("Crear Carrera Tecnicatura Universitaria en Tecnologias de la Informacion");
        Carrera carrera = new Carrera();
        carrera.setNombre("Tecnicatura Universitaria en Tecnologias de la Informacion");
        Facultad factultad = new FacultadDao().GetById(1);
        carrera.setFacultad(factultad);
        List<Materia> materias = new MateriaDao().GetAll();
        carrera.setMaterias(materias);
        carreraDao.Save(carrera);
        
        
        System.out.println("Mostrar Carreras");
        List<Carrera> carreras = carreraDao.GetAll();
        for (Carrera c : carreras) {
            System.out.println(c.toString());
        }
        System.out.println("-----");
    }
}
