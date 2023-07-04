/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp4;

/**
 *
 * @author juan_
 */
public class Tp4 {

    public static void main(String[] args) {

        // Crear un objeto de la clase Curso
        Curso curso = new Curso("Base de datos", 8.5, 7.9, 9.2);
        
        // curso.calcularPromedioNotas();

        // Crear un objeto de la clase Alumno
        Alumno alumno = new Alumno(12345678, "Juan", "Perz", "Calle 123", 8,
                6, "A", 987654, curso);

        // Mostrar los datos del alumno
        alumno.mostrarInformacion();

        // Crear un objeto de la clase ProgramaAcademico
        ProgramaAcademico programa = new ProgramaAcademico("Ingeniería de Software", 5, "Licenciatura");

        // Crear un objeto de la clase Profesor
        // (int numeroEmpleado, String asignaturas, ProgramaAcademico programaAcademico,
        // int dni, String nombre, String apellido, String domicilio, int horario
        Profesor profesor2 = new Profesor(87654321, "SQL", programa,curso, 65432154, "Alberto", "Olmedo", "Calle Corrientes 1000", 800);

        // Mostrar los datos del profesor
        profesor2.mostrarInformacion();
    }
}
