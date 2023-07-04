/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

import java.util.Arrays;

/**
 *
 * @author juan_
 */
public class Curso {

    private String nombre;
    private Profesor profesor;
    private Estudiante[] estudiantes;

    public Curso() {
    }

    public Curso(String nombre, Profesor profesor, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Agregar estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        // Comprobamos si el estudiante ya está registrado en el curso
        if (buscarEstudiante(estudiante) != -1) {
            System.out.println("El estudiante ya está registrado en el curso.");
            return;
        }

        // Creamos un nuevo arreglo de estudiantes con una capacidad mayor
        Estudiante[] nuevosEstudiantes = new Estudiante[estudiantes.length + 1];

        // Copiamos los estudiantes existentes al nuevo arreglo
        for (int i = 0; i < estudiantes.length; i++) {
            nuevosEstudiantes[i] = estudiantes[i];
        }

        // Agregamos el nuevo estudiante al final del nuevo arreglo
        nuevosEstudiantes[estudiantes.length] = estudiante;

        // Asignamos el nuevo arreglo de estudiantes al arreglo de estudiantes del curso
        estudiantes = nuevosEstudiantes;

        System.out.println("El estudiante se ha registrado exitosamente en el curso.");
    }

    //Buscar estudiante
    private int buscarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].equals(estudiante)) {
                return i;
            }
        }
        return -1;
    }
    
        public void setProfesorAsignado(Profesor profesor) {
        this.profesor = profesor;
    }
    
    

    @Override
    public String toString() {
        return "Curso{" + '\n'
                + "nombre = " + nombre + '\n'
                + "profesor = " + profesor + '\n'   
                + "estudiantes matriculados en el curso = " + Arrays.toString(estudiantes) + '}'+ '\n';
    }

}
