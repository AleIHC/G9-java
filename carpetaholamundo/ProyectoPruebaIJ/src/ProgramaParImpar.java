import java.util.Scanner;

public class ProgramaParImpar {

    //Este programa determina si un número es par o impar
    public static void main(String[] args) {
        System.out.println("Estás dentro del programa");
        //Recibir un número del usuario por consola
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número para conocer si es par o impar");
        //Al guardar, llamo a mi instancia de Scanner que se llama sc. accedo a sus métodos
        int numeroIngresado = sc.nextInt();

        // Evaluamos en la condición, si verdadero se ejecuta el código del bloque y si no, se ejecuta el código del bloque else
        if (numeroIngresado % 2 == 0) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }

    }
}
