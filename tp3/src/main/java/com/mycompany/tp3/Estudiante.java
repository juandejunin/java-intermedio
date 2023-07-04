/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author juan_
 */
public class Estudiante extends Persona {
    private String grado;
    private String comicion;
    private int numeroDeMatricula;
    private ProgramaAcademico programaAcademico;

    public Estudiante() {
    }


    public Estudiante(String grado, String comicion, int numeroDeMatricula, ProgramaAcademico programaAcademico, String nombre, String apellido, String domicilio, int horario, int dni) {
        super(nombre, apellido, domicilio, horario, dni);
        this.grado = grado;
        this.comicion = comicion;
        this.numeroDeMatricula = numeroDeMatricula;
        this.programaAcademico = programaAcademico;
    }


     
    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(int numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getComicion() {
        return comicion;
    }

    public void setComicion(String comicion) {
        this.comicion = comicion;
    }

    public ProgramaAcademico getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(ProgramaAcademico programaAcademico) {
        this.programaAcademico = programaAcademico;
    }  

        // Método para mostrar información del estudiante (sobrescribe el método de la clase Persona)
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de matrícula: " + numeroDeMatricula);
        System.out.println("Programa académico: " + programaAcademico);
    }
    
    @Override
    public String toString() {
        return "Estudiante{" + '\n' +
                "Nombre = " + getNombre()+ '\n' +
                "Apellido = " + getApellido()+ '\n' +
                "Domicilio = " + getDomicilio()+ '\n' +
                "Horario = " + getHorario() + '\n' + 
                "DNI = " + getDni() + '\n' +
                "Grado = " + grado + '\n' +             
                "comicion = " + comicion + '\n' +
                "Numero de Matricula = " + numeroDeMatricula + '\n' +
                "programaAcademico =" + programaAcademico + '}';
    }
    
}
