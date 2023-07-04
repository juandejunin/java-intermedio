/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

/**
 *
 * @author juan_
 */
public class Curso {

    private String nombre;
    private double notaPracticos;
    private double notaEvaluacion;
    private double notaDefensa;

    public Curso(String nombre, double notaPracticos, double notaEvaluacion, double notaDefensa) {
        this.nombre = nombre;
        this.notaPracticos = notaPracticos;
        this.notaEvaluacion = notaEvaluacion;
        this.notaDefensa = notaDefensa;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaPracticos() {
        return notaPracticos;
    }

    public void setNotaPracticos(double notaPracticos) {
        this.notaPracticos = notaPracticos;
    }

    public double getNotaEvaluacion() {
        return notaEvaluacion;
    }

    public void setNotaEvaluacion(double notaEvaluacion) {
        this.notaEvaluacion = notaEvaluacion;
    }

    public double getNotaDefensa() {
        return notaDefensa;
    }

    // Getters y Setters
    public void setNotaDefensa(double notaDefensa) {    
        this.notaDefensa = notaDefensa;
    }

    // ...
    // Otros métodos
    public double calcularPromedioNotas() {
        return (notaPracticos + notaEvaluacion + notaDefensa) / 3;
    }
    
    
}
