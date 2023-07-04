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
public class ProgramaAcademico {

    private String nombre;
    private int codigo;
    private int cantidadDeSemestres;
    private Curso[] cursos;

    public ProgramaAcademico(String nombre) {
        this.nombre = nombre;
        this.cursos = new Curso[0];
    }

    //CONSTRUCTORES
    public ProgramaAcademico() {
    }

    public ProgramaAcademico(String nombre, int codigo, int cantidadDeSemestres, Curso[] cursos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadDeSemestres = cantidadDeSemestres;
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadDeSemestres() {
        return cantidadDeSemestres;
    }

    public void setCantidadDeSemestres(int cantidadDeSemestres) {
        this.cantidadDeSemestres = cantidadDeSemestres;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "ProgramaAcademico{" + '\n'
                + "nombre='" + nombre + '\n'
                + ", codigo=" + codigo + '\n'
                + ", cantidadDeSemestres=" + cantidadDeSemestres + '\n'
                + ", cursos=" + Arrays.toString(cursos) + '\n'
                + '}' + '\n';
    }

}
