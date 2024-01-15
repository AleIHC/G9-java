import java.util.Scanner;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        // Juego para adivinar un número al azar del 1 al 10
        Scanner sc = new Scanner(System.in);

        // Usamos Math.random para generar un número del 0 al 1 y multiplicamos por 10
        double numeroDelCeroAlUno = Math.random() * 10;
        // Casteamos para convertirlo en un entero
        int numeroMisterioso = (int) numeroDelCeroAlUno;

        int numeroEscogido;
        int cantidadIntentos = 0;

        do { // El bloque dentro de do se va a ejecutar por lo menos una vez
            System.out.println("Introduce un número del 1 al 10");
            numeroEscogido = sc.nextInt();
            cantidadIntentos++;

            if (numeroEscogido > numeroMisterioso) {
                System.out.println("Muy alto");
            } else if ( numeroEscogido < numeroMisterioso) {
                System.out.println("Muy bajo");
            } else {
                System.out.println("Felicidades, has ganado");
            }

            // Mostramos la cantidad de intentos
            System.out.println("Llevas " + cantidadIntentos + " intentos");

        } while (numeroEscogido != numeroMisterioso);

        sc.close();
    }
}
