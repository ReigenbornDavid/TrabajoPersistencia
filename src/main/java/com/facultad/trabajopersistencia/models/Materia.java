/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia.models;

import com.facultad.trabajopersistencia.models.Profesor;
import com.facultad.trabajopersistencia.models.Alumno;
import java.util.List;

/**
 *
 * @author David
 */
public class Materia {
    private Integer materiaId;
    private String nombre;
    private Integer nivel;
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Materia() {}

    public Materia(Integer materiaId, String nombre, Integer nivel, Profesor profesor, List<Alumno> alumnos) {
        this.materiaId = materiaId;
        this.nombre = nombre;
        this.nivel = nivel;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public Integer getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(Integer materiaId) {
        this.materiaId = materiaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Materia{" + "materiaId=" + materiaId + ", nombre=" + nombre + ", nivel=" + nivel + ", profesor=" + profesor + ", alumnos=" + alumnos + '}';
    }
}
