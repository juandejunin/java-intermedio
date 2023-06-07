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
        Alumno alumno1 = new Alumno("Juan Amieva", "Avenida San Martin 123", "Noche", 1, "A", 21654789);

        // Visualización de los atributos del objeto
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Domicilio: " + alumno1.getDomicilio());
        System.out.println("Horario: " + alumno1.getHorario());
        System.out.println("Grado: " + alumno1.getGrado());
        System.out.println("Comisión: " + alumno1.getComision());
        System.out.println("Dni: " + alumno1.getDni());
    }
}
