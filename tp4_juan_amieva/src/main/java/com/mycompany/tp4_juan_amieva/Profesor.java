/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4_juan_amieva;

/**
 *
 * @author juan_
 */
public class Profesor extends Persona {

    private int numeroEmpleado;
    private String asignaturas;
    private ProgramaAcademico programaAcademico;

    public Profesor(int dni, String nombre, String apellido, String domicilio, int horario) {
        super(dni, nombre, apellido, domicilio, horario);
    }

    public Profesor(int numeroEmpleado, String asignaturas, ProgramaAcademico programaAcademico, int dni, String nombre, String apellido, String domicilio, int horario) {
        super(dni, nombre, apellido, domicilio, horario);
        this.numeroEmpleado = numeroEmpleado;
        this.asignaturas = asignaturas;
        this.programaAcademico = programaAcademico;
    }

    // Getters y Setters
    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String asignaturas) {
        this.asignaturas = asignaturas;
    }

    public ProgramaAcademico getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(ProgramaAcademico programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Número de Empleado: " + numeroEmpleado);
        System.out.println("Asignaturas: " + asignaturas);
        System.out.println("Programa Académico: " + programaAcademico.getNombre());
    }

}
