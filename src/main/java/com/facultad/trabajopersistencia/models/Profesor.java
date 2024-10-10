/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.models;

import java.time.LocalDate;

/**
 *
 * @author David
 */
public class Profesor extends Persona{
    private Integer antiguedad;

    public Profesor() {
    }

    public Profesor(Integer antiguedad, Integer personaId, String apellido, String nombre, Long dni, LocalDate fechaNacimiento, Ciudad ciudad) {
        super(personaId, apellido, nombre, dni, fechaNacimiento, ciudad);
        this.antiguedad = antiguedad;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + ", antiguedad=" + antiguedad + '}';
    }
}
