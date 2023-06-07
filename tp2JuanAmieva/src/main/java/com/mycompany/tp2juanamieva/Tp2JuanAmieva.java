/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tp2juanamieva;

/**
 *
 * @author juan_
 */
public class Tp2JuanAmieva {

    public static void main(String[] args) {
        // Creación de un objeto Alumno
        Alumno alumno = new Alumno("Juan Pérez", "Calle Principal 123", "Mañana", 5, "A");

        // Visualización de los atributos del objeto
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Domicilio: " + alumno.getDomicilio());
        System.out.println("Horario: " + alumno.getHorario());
        System.out.println("Grado: " + alumno.getGrado());
        System.out.println("Comisión: " + alumno.getComision());
    }
}
