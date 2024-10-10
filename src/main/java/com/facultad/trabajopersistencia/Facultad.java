/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia;

/**
 *
 * @author David
 */
public class Facultad {
    private Integer facultadId;
    private String nombre;
    private Ciudad ciudad;
    
    public Facultad(){}

    public Facultad(Integer facultadId, String nombre, Ciudad ciudad) {
        this.facultadId = facultadId;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Integer getFacultadId() {
        return facultadId;
    }

    public void setFacultadId(Integer facultadId) {
        this.facultadId = facultadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Facultad{" + "facultadId=" + facultadId + ", nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
}
