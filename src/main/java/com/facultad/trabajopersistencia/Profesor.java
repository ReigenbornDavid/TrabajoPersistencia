/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia;

import java.time.LocalDate;

/**
 *
 * @author David
 */
public class Profesor extends Persona{
    private Integer profesorId;
    private Integer antiguedad;

    public Profesor() {
    }

    public Profesor(Integer profesorId, Integer antiguedad, Integer personaId, String apellido, String nombre, Long dni, LocalDate fechaNacimiento, Ciudad ciudad) {
        super(personaId, apellido, nombre, dni, fechaNacimiento, ciudad);
        this.profesorId = profesorId;
        this.antiguedad = antiguedad;
    }

    public Integer getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(Integer profesorId) {
        this.profesorId = profesorId;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "profesorId=" + profesorId + ", antiguedad=" + antiguedad + '}';
    }
}
