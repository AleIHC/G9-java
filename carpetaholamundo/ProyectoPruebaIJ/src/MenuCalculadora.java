import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {
        mostrarMenu(0);
        Calculadora miCalculadora = new Calculadora();


        System.out.println("El resultado de la operación es " + miCalculadora.suma(4,5));

        /*
        while (opcion < 0 || opcion > 4) {
            System.out.println("Hola estamos dentro del bucle");
        }
        */
    }

    // Sintaxis de la función -> Métodos
    // (<modificador de acceso> <static> <tipo de retorno o void> <nombre del método> (parámetros) {
    // <Bloque de código>
    //}
    public static void mostrarMenu(int opcion) {

        // Menú inicial para las opciones de la calculadora
        Scanner sc = new Scanner(System.in);

        do { // Con el do podemos imprimir las opciones y cambiar la opción por lo menos una vez
            System.out.println("0 - Salir \n 1 - Sumar \n 2 - Restar \n 3 - Multiplicar \n 4 - Dividir");
            System.out.println("Ingresa una opción");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 4); // F + F = F :Aunque sea falso se ejecuta por lo menos una vez

    }
}
