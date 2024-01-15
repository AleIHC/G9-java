import models.Curso;
import models.Estudiante;

public class LibretaDeNotas {

    public static void main(String[] args) {
        // Libreta de notas
        // Instancias de estudiante

        Estudiante estudiante1 = new Estudiante("Matías", "Pérez", 10000, 7, 4);
        Estudiante estudiante2 = new Estudiante("Paola", "Viloria", 10000, 7, 4);
        Estudiante estudiante3 = new Estudiante("Camila", "Reyes", 10000, 7, 4);

        Curso curso1 = new Curso("Matemáticas", "Mariana", 4);

        curso1.inscribirEstudiante(estudiante1);
        curso1.inscribirEstudiante(estudiante2);
        curso1.inscribirEstudiante(estudiante3);

        System.out.println(curso1);

        // System.out.println(estudiante1);
        // estudiante1.nombreCompleto();
    }
}
