/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4_juan_amieva;

/**
 *
 * @author juan_
 */
public class ProgramaAcademico {

    private String nombre;
    private int duracion;
    private String nivel;

    public ProgramaAcademico() {
    }

    public ProgramaAcademico(String nombre, int duracion, String nivel) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
