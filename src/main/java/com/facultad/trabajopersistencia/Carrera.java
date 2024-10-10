/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia;

import java.util.List;

/**
 *
 * @author David
 */
public class Carrera {
    private Integer carreraId;
    private String nombre;
    private Facultad facultad;
    private List<Materia> materias;

    public Carrera() {}

    public Carrera(Integer carreraId, String nombre, Facultad facultad, List<Materia> materias) {
        this.carreraId = carreraId;
        this.nombre = nombre;
        this.facultad = facultad;
        this.materias = materias;
    }

    public Integer getCarreraId() {
        return carreraId;
    }

    public void setCarreraId(Integer carreraId) {
        this.carreraId = carreraId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Carrera{" + "carreraId=" + carreraId + ", nombre=" + nombre + ", facultad=" + facultad + ", materias=" + materias + '}';
    }
}
