/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.facultad.trabajopersistencia;

import com.facultad.trabajopersistencia.DAO.CiudadDao;
import com.facultad.trabajopersistencia.ejemplos.EjemploAlumno;
import com.facultad.trabajopersistencia.ejemplos.EjemploCarrera;
import com.facultad.trabajopersistencia.ejemplos.EjemploCiudad;
import com.facultad.trabajopersistencia.ejemplos.EjemploConsultasHQL;
import com.facultad.trabajopersistencia.ejemplos.EjemploFacultad;
import com.facultad.trabajopersistencia.ejemplos.EjemploMateria;
import com.facultad.trabajopersistencia.ejemplos.EjemploProfesor;
import com.facultad.trabajopersistencia.models.Ciudad;
import java.util.List;

/**
 *
 * @author David
 */
public class TrabajoPersistencia {

    public static void main(String[] args) {
        System.out.println("Trabajo Persistencia");
        
        EjemploCiudad.Ejemplo();
        EjemploProfesor.Ejemplo();
        EjemploAlumno.Ejemplo();
        EjemploMateria.Ejemplo();
        EjemploFacultad.Ejemplo();
        EjemploCarrera.Ejemplo();
        EjemploConsultasHQL.Ejemplo();
        
        System.exit(0);
    }
}
