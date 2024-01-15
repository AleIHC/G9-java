import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaDeLaSemana {

    // Programa para determinar qué dia de la semana es
    public static void main(String[] args) {
        System.out.println("Estamos dentro del programa");
        Scanner sc = new Scanner(System.in);

        //Solicitamos al usuario un ingreso y lo guardamos en una variable
        System.out.println("Ingresa un número del 1 al 7");
        int numeroDia = sc.nextInt();


        // El bloquee try se usa para ejecutar el códig donde es posible que exista un error de ingreso y así poder enviar un mensaje de error
        try {
            // Le pasamos la condición donde es posible que se introduzca un número no válido
            if (numeroDia > 7 || numeroDia < 1) {
                System.out.println("Ingrese un número del 1 al 7");
            }
        } catch (InputMismatchException e) { // Con el catch normalmente
            System.out.println("Ingrese un número dentro del rango");
        }


        /*
        if (numeroDia == 1) {
            System.out.println("El día es Lunes");
        } else if (numeroDia == 2) {
            System.out.println("El día es Martes");
        } else if (numeroDia == 3) {
            System.out.println("El día es Miercoles");
        } else if (numeroDia == 4) {
            System.out.println("El día es Jueves");
        } else if (numeroDia == 5) {
            System.out.println("El día es Viernes");
        } else if (numeroDia == 6) {
            System.out.println("El día es Sábado");
        } else if (numeroDia == 7) {
            System.out.println("El día es Domingo");
        } else {
            System.out.println("Introdujiste un número inválido");
        }
        */

        switch (numeroDia) {
            // El case se sigue del posible valor de la variable a evaluar
            case 1:
                System.out.println("El día es Lunes");
                break;
            case 2:
                System.out.println("El día es Martes");
                break;
            case 3:
                System.out.println("El día es Miercoles");
                break;
            case 4:
                System.out.println("El día es Jueves");
                break;
            case 5:
                System.out.println("El día es Viernes");
                break;
            case 6:
                System.out.println("El día es Sabado");
                break;
            case 7:
                System.out.println("El día es Domingo");
                break;
            default:
                System.out.println("El número es inválido");
                break;
        }

        // OPERADOR TERNARIO
        /*String mensajeAMostrar = numeroDia < 1 ? "Introdujiste un número muy bajo" : "El número está correcto";
        System.out.println(mensajeAMostrar);
        */

    }
}
