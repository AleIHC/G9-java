package tests;
import models.Perro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private CalculadoraParaTest calculadoraParaTest;


    // Anotaciones que van controlar el flujo y determinar cuáles son las pruebas
    // @BeforeAll
    @BeforeEach
    void setup() {
        calculadoraParaTest = new CalculadoraParaTest();

    }

    @Test
    void testParaSuma() {
       // Las afirmaciones pertenecen a la clase Assertions, resultan en un boolean
        //Una de ellas es assertEquals que verifica si el resultado es igual a lo que se está afirmando
        Assertions.assertEquals(4, calculadoraParaTest.suma(2,2));
    }

    @Test
    void testParaResta() {
        Assertions.assertEquals(1, calculadoraParaTest.resta(5,4));
    }

    @Test
    void testParaVerificarComparacion() {
        Assertions.assertTrue(10 < 20, () -> "La comparación es errónea");
    }





}
