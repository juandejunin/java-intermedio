package com.mycompany.tp2juanamieva;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juan_
 */
public class Alumno {
    private String nombre;
    private String domicilio;
    private String horario;
    private int grado;
    private String comision;
    private int dni;
    
     // Constructor de la clase Alumno

    public Alumno(String nombre, String domicilio, String horario, int grado, String comision,int  dni) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;
        this.grado = grado;
        this.comision = comision;
        this.dni = dni;
    }
    
     // Métodos getters y setters para acceder a los atributos privados

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
}
