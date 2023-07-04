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
        // Crear Programas Academicos
        ProgramaAcademico programaAcademico1 = new ProgramaAcademico();

        // Crear Estudiantes
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Jacinto");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Juan");
        estudiante2.setDomicilio("Av Rivadavia 4");

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Pedro");
        estudiante3.setDomicilio("Av Rivadavia 43");

        // Crear Profesores
        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Jose Ramon");
        profesor1.setApellido("Nuñez");
        profesor1.setDni(28963258);
        profesor1.setHorario(800);
        profesor1.setNumeroEmpleado(10);
        profesor1.setProgramaAcademico(programaAcademico1);

        Profesor profesor2 = new Profesor();
        profesor2.setNombre("Matias");
        profesor2.setApellido("Martinez");
        profesor2.setDni(87963258);
        profesor2.setHorario(800);
        profesor2.setNumeroEmpleado(11);
        profesor2.setProgramaAcademico(programaAcademico1);

        // Crear Cursos
        Curso curso1 = new Curso();
        curso1.setNombre("Programacion");
        curso1.setEstudiantes(new Estudiante[]{estudiante1});

        //asignar profesor al curso1
        curso1.setProfesor(profesor1);

        Curso curso2 = new Curso();
        curso2.setNombre("Programacion");
        curso2.setProfesor(profesor2);
        curso2.setEstudiantes(new Estudiante[]{estudiante2});

        // Registrar estudiante en curso2
        curso2.agregarEstudiante(estudiante3);

        // añadir informacion a Programa academico
        programaAcademico1.setNombre("Programacion con Java");
        programaAcademico1.setCodigo(001);
        programaAcademico1.setCantidadDeSemestres(1);
        programaAcademico1.setCursos(new Curso[]{curso1, curso2});

        // Mostrar informacion del estudiante
        estudiante1.mostrarInformacion();

        // Mostrar informacion del profesor
        
        profesor1.mostrarInformacion();
    }
}
