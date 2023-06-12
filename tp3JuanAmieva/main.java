import java.util.ArrayList;
import java.util.List;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class Estudiante extends Persona {
    private String numeroMatricula;
    private String programaAcademico;

    public Estudiante(String nombre, int edad, String numeroMatricula, String programaAcademico) {
        super(nombre, edad);
        this.numeroMatricula = numeroMatricula;
        this.programaAcademico = programaAcademico;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }
}

class Profesor extends Persona {
    private String numeroEmpleado;
    private List<String> asignaturas;

    public Profesor(String nombre, int edad, String numeroEmpleado, List<String> asignaturas) {
        super(nombre, edad);
        this.numeroEmpleado = numeroEmpleado;
        this.asignaturas = asignaturas;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }
}

class Curso {
    private String nombre;
    private Profesor profesor;

    public Curso(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}

class ProgramaAcademico {
    private String nombre;
    private List<Curso> cursos;

    public ProgramaAcademico(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void eliminarCurso(Curso curso) {
        cursos.remove(curso);
    }
}

public class Main {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Juan", 35, "123", new ArrayList<>());
        Curso curso = new Curso("Matemáticas", profesor);
        ProgramaAcademico programa = new ProgramaAcademico("Licenciatura en Matemáticas");
        programa.agregarCurso(curso);

        System.out.println("Información del curso:");
        System.out.println("Nombre: " + curso.getNombre());
        System.out.println("Profesor: " + curso.getProfesor().getNombre());
        System.out.println("Programa académico: " + programa.getNombre());
        System.out.println("Cursos del programa académico:");
        for (Curso c : programa.getCursos()) {
            System.out.println("- " + c.getNombre());
        }
    }
}
