package models;

import java.util.ArrayList;

public class Curso {

    // Atributos
    private String nombreCurso;
    private String nombreProfesor;
    private Integer anio;
    private ArrayList<Estudiante> estudiantesInscritos = new ArrayList<>();

    // Constructores
    public Curso() {
    }

    public Curso(String nombreCurso, String nombreProfesor, Integer anio, ArrayList<Estudiante> estudiantesInscritos) {
        this.nombreCurso = nombreCurso;
        this.nombreProfesor = nombreProfesor;
        this.anio = anio;
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public Curso(String nombreCurso, String nombreProfesor, Integer anio) {
        this.nombreCurso = nombreCurso;
        this.nombreProfesor = nombreProfesor;
        this.anio = anio;
    }

    // Getter & Setter
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    // Métodos
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
        System.out.println("El estudiante " + estudiante.nombre + " " + estudiante.apellido + " ha sido inscrito");
    }

    // Método toString
    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", nombreProfesor='" + nombreProfesor + '\'' +
                ", anio=" + anio +
                ", estudiantesInscritos=" + estudiantesInscritos +
                '}';
    }
}
