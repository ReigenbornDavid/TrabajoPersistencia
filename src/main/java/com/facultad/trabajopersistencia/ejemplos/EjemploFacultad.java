/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.ejemplos;

import com.facultad.trabajopersistencia.DAO.CiudadDao;
import com.facultad.trabajopersistencia.DAO.FacultadDao;
import com.facultad.trabajopersistencia.models.Ciudad;
import com.facultad.trabajopersistencia.models.Facultad;
import java.util.List;

/**
 *
 * @author David
 */
public class EjemploFacultad {
    public static void Ejemplo(){
        System.out.println("Ejemplo Facultad");
        FacultadDao facultadDao = new FacultadDao();
        
        System.out.println("Crear Facultad UTN");
        Facultad facultad = new Facultad();
        Ciudad ciudad = new CiudadDao().GetById(1);
        facultad.setCiudad(ciudad);
        facultad.setNombre("UTN");
        facultadDao.Save(facultad);
        
        System.out.println("Mostrar Facultades");
        List<Facultad> facultades = facultadDao.GetAll();
        for (Facultad f : facultades) {
            System.out.println(f.toString());
        }
        System.out.println("-----");
    }
}