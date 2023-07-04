/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

/**
 *
 * @author juan_
 */
public class Profesor extends Persona {

    private int numeroEmpleado;
    private String asignaturas;
    private ProgramaAcademico programaAcademico;
    private Curso curso;

    public Profesor() {
    }

    public Profesor(int numeroEmpleado, String asignaturas, ProgramaAcademico programaAcademico,Curso curso, int dni, String nombre, String apellido, String domicilio, int horario) {
        super(dni, nombre, apellido, domicilio, horario);
        this.numeroEmpleado = numeroEmpleado;
        this.asignaturas = asignaturas;
        this.programaAcademico = programaAcademico;
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    
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

    // metodo mostrar
    public void mostrarInformacion() {
        System.out.println("********************************");
        System.out.println("*            Profesor          *");
        System.out.println("********************************");
        System.out.println("Número de Empleado: " + numeroEmpleado);
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido());

        System.out.println("Asignaturas: " + asignaturas);
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Programa Académico: " + programaAcademico.getNombre());
        System.out.println("");
    }

}
