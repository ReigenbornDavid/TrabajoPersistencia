/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facultad.trabajopersistencia;

/**
 *
 * @author David
 */
public class Ciudad {
    private int ciudadId;
    private String nombre;

    public Ciudad(int ciudadId, String nombre) {
        this.ciudadId = ciudadId;
        this.nombre = nombre;
    }

    public Ciudad() {
    }

    public int getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(int ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "ciudadId=" + ciudadId + ", nombre=" + nombre + '}';
    }
    
}
