import java.util.Arrays;
import java.util.Scanner;

public class PracticaArreglosEstáticos {

    public static void main(String[] args) {
        // Verificamos que lo podemos ejecutar
        // System.out.println("Está funcionando");

        // Array estático con los números del 1 al 10
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        // Imprimimos el array
        System.out.println("El espacio en memoria que ocpua este array es " + numeros);

        // Para imprimir el contenido podemos llamar a la clase Arrays
        System.out.println(Arrays.toString(numeros)); // No se imprime a través de un método de Arrays estáticos, si no, de la clase Arrays

        /** Programa para llenar Array con datos introducidos por el usuario
        System.out.println("***********PROGRAMA ARRAY*************");
        Scanner sc = new Scanner(System.in);

        //Solicitamos al usuario ingresar la longitud  y la guardamos en una variable
        System.out.println("Introduce el número máximo de elementos a almacenar");
        int cantidadElementos = sc.nextInt();

        // Indicamos que la longitud máxima del array será la recibida por el usuario
        int[] numerosEjercicio = new int[cantidadElementos];

        for (int i = 0; i < numerosEjercicio.length; i++ ) {
            System.out.println("Ingresa el numero que vas a guardar en la posición " + i);
            numerosEjercicio[i] = sc.nextInt();
        }

        System.out.println("El contenido del Array es: " + Arrays.toString(numerosEjercicio));
        **/

        // Programa para buscar el número más alto en un Array con datos introducidos por el usuario
         System.out.println("***********PROGRAMA ARRAY*************");

         // Declaramos el nuevo array
        int[] nuevoArray = {423,123,312,423,665,32,12,854};

        // Creamos una nueva variable que almacene el valor de la primera posición
        System.out.println(nuevoArray[0]);
        int numeroMayor =  nuevoArray[0];


        for (int i = 1; i < nuevoArray.length; i++) {
            if (nuevoArray[i] > numeroMayor) {
                numeroMayor = nuevoArray[i];
            }
        }

        System.out.println("El número más alto del Array es: " + numeroMayor);


    }
}
