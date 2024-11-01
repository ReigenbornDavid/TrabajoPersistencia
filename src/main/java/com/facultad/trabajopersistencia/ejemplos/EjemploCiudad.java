/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.ejemplos;

import com.facultad.trabajopersistencia.DAO.CiudadDao;
import com.facultad.trabajopersistencia.models.Ciudad;
import java.util.List;

/**
 *
 * @author David
 */
public class EjemploCiudad {
    public static void Ejemplo(){
        System.out.println("Ejemplo Ciudad");
        CiudadDao ciudadDao = new CiudadDao();
        
        System.out.println("Crear Ciudad Juan Jose Castelli");
        Ciudad ciudad = new Ciudad();
        ciudad.setNombre("Juan Jose Castelli");
        ciudadDao.Save(ciudad);
        
        System.out.println("Crear Saenz Peña");
        ciudad = new Ciudad();
        ciudad.setNombre("Saenz Peña");
        ciudadDao.Save(ciudad);
        
        System.out.println("Crear Ciudad Resistencia");
        ciudad = new Ciudad();
        ciudad.setNombre("Resistenci");
        ciudadDao.Save(ciudad);
        
        System.out.println("Corregir Nombre Resistencia");
        ciudad = new Ciudad();
        ciudad.setCiudadId(3);
        ciudad.setNombre("Resistencia");
        ciudadDao.Update(ciudad);
        
        System.out.println("Eliminar Ciudad Saenz Peña");
        ciudadDao.Delete(2);
        
        System.out.println("Mostrar Ciudades");
        List<Ciudad> ciudades = ciudadDao.GetAll();
        for (Ciudad c : ciudades) {
            System.out.println(c.toString());
        }
        System.out.println("-----");
    }
}
