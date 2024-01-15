package models;

public class Estudiante {

    //Atributos del estudiante
    String nombre;
    String apellido;
    Integer matricula;
    Integer calificacion;
    Integer anio;

    //Constructores
    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, Integer matricula, Integer calificacion, Integer anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.anio = anio;
    }


    // Métodos
    public void nombreCompleto() {
        System.out.println("El nombre del estudiante es: " + nombre + " " + apellido);
    }

    // Método toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matricula=" + matricula +
                ", calificacion=" + calificacion +
                ", anio=" + anio +
                '}';
    }


}
