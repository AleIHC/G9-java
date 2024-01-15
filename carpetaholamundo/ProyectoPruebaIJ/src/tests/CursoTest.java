package tests;

import models.Curso;
import models.Estudiante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CursoTest {

    private Curso curso;

    @BeforeEach
    void setup() {
        curso = new Curso("Curso Prueba", "Profesor Prueba", 1);
    }

    @Test
    void creacionCurso() {
        Assertions.assertTrue(curso.getAnio() == 1);

        Estudiante estudiantePrueba1 = new Estudiante("Homero", "Simpson", 10000, 7, 1);
        Estudiante estudiantePrueba2 = new Estudiante("Marge", "Simpson", 10000, 9, 1);
        Estudiante estudiantePrueba3 = new Estudiante("Bart", "Simpson", 10000, 5, 1);

        curso.inscribirEstudiante(estudiantePrueba1);
        curso.inscribirEstudiante(estudiantePrueba2);
        curso.inscribirEstudiante(estudiantePrueba3);

        Assertions.assertTrue(curso.getEstudiantesInscritos().contains(estudiantePrueba1));
        Assertions.assertTrue(curso.getEstudiantesInscritos().contains(estudiantePrueba2));

    }


}
