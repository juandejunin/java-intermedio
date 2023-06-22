/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp3;

/**
 *
 * @author juan_
 */
public class Tp3 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pringles 683", 800, 32321321);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getDomicilio());
        System.out.println(persona1.getHorario());
        System.out.println(persona1.getDni());

        ProgramaAcademico programaAcademico = new ProgramaAcademico("Programacion", 123123, 9, 40);
        
        Alumno alumno1 = new Alumno();
                alumno1.setNombre("Juan");
                alumno1.setDomicilio("pringles 683");
                alumno1.setDni(23654987);
                alumno1.setProgramaAcademico(programaAcademico);
        
        
        
        
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.getDomicilio());
        System.out.println(alumno1.getDni());
        System.out.println(alumno1.getProgramaAcademico());
    }
}
