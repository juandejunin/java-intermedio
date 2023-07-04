/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author juan_
 */
public class Profesor extends Persona {

    private int numeroEmpleado;
    private String asignaturas;
    private ProgramaAcademico programaAcademico;

    public Profesor() {
    }

    public Profesor(int numeroEmpleado, String asignaturas, ProgramaAcademico programaAcademico, String nombre, String apellido, String domicilio, int horario, int dni) {
        super(nombre, apellido, domicilio, horario, dni);
        this.numeroEmpleado = numeroEmpleado;
        this.asignaturas = asignaturas;
        this.programaAcademico = programaAcademico;
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

    // Método para mostrar información del profesor 
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de empleado: " + numeroEmpleado);
        System.out.println("Asignaturas que imparte:" + asignaturas);

    }

    @Override
    public String toString() {
        return "Profesor{" + '\n'
                + "Nombre = " + getNombre() + '\n'
                + "Apellido = " + getApellido() + '\n'
                + "Domicilio = " + getDomicilio() + '\n'
                + "Horario = " + getHorario() + '\n'
                + "DNI = " + getDni() + '\n'
                + "numerode Empleado =" + numeroEmpleado + '\n'
                + "asignaturas =" + asignaturas + '\n'
                + "programa Academico =" + programaAcademico + '\n'
                + '}' +'\n';
    }


}
