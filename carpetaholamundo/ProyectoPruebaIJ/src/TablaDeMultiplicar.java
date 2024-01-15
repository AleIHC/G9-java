import java.util.Scanner;

public class TablaDeMultiplicar {

    public static void main(String[] args) {
        // Tabla de multiplicar con bucle for

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para conocer la tabala de multiplicación");
        int numeroEscogido = sc.nextInt();

        // En el bucle for manejamos la variable de control;
        // la condición a evaluarse;
        // y la acción a realizar con cada iteración dentro de la sintaxis
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroEscogido + " x " + i + " = " + (numeroEscogido*i));
        }
    }
}
