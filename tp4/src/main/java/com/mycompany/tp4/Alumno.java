/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp4;

/**
 *
 * @author juan_
 */
public class Alumno extends Persona {

    private int grado;
    private String comision;
    private int numeroMatricula;
    private Curso curso;

    public Alumno() {
    }

    public Alumno(int dni, String nombre, String apellido, String domicilio, int horario, int grado, String comision, int numeroMatricula, Curso curso) {
        super(dni, nombre, apellido, domicilio, horario);
        this.grado = grado;
        this.comision = comision;
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
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

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "grado=" + grado + ", comision=" + comision + ", numeroMatricula=" + numeroMatricula + ", curso=" + curso + '}';
    }

    public double calcularCalificacionFinal() {
        return curso.calcularPromedioNotas();
    }
    
    

    public void mostrarInformacion() {
        System.out.println("**********************************************");
        System.out.println("*                  Alumno                    *");
        System.out.println("**********************************************");
        System.out.println("Nombre y Apellido: " + getNombre() + " " + getApellido());
        System.out.println("Grado: " + grado);
        System.out.println("Comisión: " + comision);
        System.out.println("DNI: " + getDni());
        System.out.println("Direccion: " + getDomicilio());
        System.out.println("Horario: " + getHorario());
        System.out.println("Número de Matrícula: " + numeroMatricula);
        System.out.println("Curso: " + curso);
        System.out.println("");
    }
}
