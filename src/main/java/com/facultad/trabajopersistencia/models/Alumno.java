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
public class Alumno extends Persona{
    private Integer numeroLegajo;
    private Integer añoIngreso;

    public Alumno() {
    }

    public Alumno(Integer numeroLegajo, Integer añoIngreso, Integer personaId, String apellido, String nombre, Long dni, LocalDate fechaNacimiento, Ciudad ciudad) {
        super(personaId, apellido, nombre, dni, fechaNacimiento, ciudad);
        this.numeroLegajo = numeroLegajo;
        this.añoIngreso = añoIngreso;
    }

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public Integer getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(Integer añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    @Override
    public String toString() {
        return "Alumno{" + super.toString() + ", numeroLegajo=" + numeroLegajo + ", añoIngreso=" + añoIngreso + '}';
    }
}
