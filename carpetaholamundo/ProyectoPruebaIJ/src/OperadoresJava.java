public class OperadoresJava {
    // Distintos tipos de operadores
    public static void main(String[] args) {
        System.out.println("Acá tenemos los operadores aritméticos");

        // Creamos 2 variables numéricas
        int a = 10;
        int b = 5;
        int c = 10;

        // Suma
        int suma = a + b;
        System.out.println("El resultado de la suma es: " + suma);

        // Resta
        int resta = a - b;
        System.out.println("El resultado es: " + resta);

        // Multiplicación
        int multiplicacion = a * b;
        System.out.println("El resultado es: " + multiplicacion);

        // División
        int division = a / b;
        System.out.println("El resultado es: " + division);

        // Módulo (El resto de la división)
        int modulo = a % b;
        System.out.println("El resultado es: " + modulo);

        /***********************/
        //Operadores relacionales o de comparación dan como resultado un boolean

        // Igualdad
        boolean esIgual = a == b;
        System.out.println("El resultado de la comparación es: " + esIgual);

        // Es distinto de
        boolean esDistinto = a != b;
        System.out.println("El resultado de la comparación es: " + esDistinto);

        // Menor que
        boolean esMenor = a < b;
        System.out.println("El resultado de la comparación es: " + esMenor);

        // Mayor que
        boolean esMayor = a > b;
        System.out.println("El resultado de la comparación es: " + esMayor);

        // Menor o igual que
        boolean esMenorOIgual = b <= c;
        System.out.println("El resultado de la comparación es: " + esMenorOIgual);

        // Mayor o igual que
        boolean esMayorOIgual = b >= c;
        System.out.println("El resultado de la comparación es: " + esMayorOIgual);

        /***************************/
        // Operadores de asignación
        // = asignación
        // +=, -=, *=, /=, %= permiten realizar operación  y asignar valor

        int nuevoNum = 10;
        System.out.println("El resultado de la operación es: " + (nuevoNum += 5));

        /***************************/
        // Operadores de incremento y decremento

        // Incremento
        // Preincremento y postdecremento

        /*
        nuevoNum = a++;
        nuevoNum = ++a;
        System.out.println("El resultado del preincremento es: " + nuevoNum);
        */

        /**************************/
        //Operadores lógicos
        int resultadoPrecedencia = (3 + 5) * 10;
        System.out.println("El resultado de la precedencia es: " + resultadoPrecedencia);

        // "Y" &&
        int num1 = 7;
        int num2 = 10;
        int num3 = 7;
        boolean condicion = false;
        boolean condicion2 = false;

        // Evalúa si ambas expresiones son verdaderas
        boolean evaluacionY = (num1 + num2) == (num2 + num3) && !condicion;
        System.out.println("El resultado de la comparación es: " + evaluacionY);

        // "O" ||
        // Evalúa que alguna de las expresiones sea true o verdadera
        boolean evaluacionO = !condicion || !condicion2;
        System.out.println("El resultado de la comparación es: " + evaluacionO);



        //Condicionales
        //if "si"
        //else "si no"

        // Si la condición se cumple, ejecuta el siguiente código
        if (num1 == num2) {
            System.out.println("Cohorte 9 Guardianes del código");
        } else { // Si no, ejecuta el siguiente
            System.out.println("Ahora no joven");
            System.out.println("**************");
        }

        // Strings
        String cohorte = "C9";

        // Métodos para los String
        System.out.println("Longitud es: " + cohorte.length());

        // Comparaciones con String,se realizan con el .equals()

        boolean elStringEsIgual = cohorte.equals("c9");
        System.out.println(elStringEsIgual);

        //Comparamos lo que está en la variable cohorte a un string que indicamos como argumento
        if (cohorte.equals("c9")) {
            System.out.println("Sí, son iguales");
        } else {
            System.out.println("No, no son iguales");
        }

        // Comparamos lo que está en la variable cohorte a un string sin tomar en cuenta las mayúsculas
        if (cohorte.equalsIgnoreCase("c9")) {
            System.out.println("Sí, son iguales");
        }

        // Manipulamos el contenido en la variable cohorte y luego comparamos
        if (cohorte.toLowerCase().equals("c9")) {
            System.out.println("Sí, son iguales");
        }

        // Manipulamos el contenido de la string a comparar
        if (cohorte.equals("c9".toUpperCase())) {
            System.out.println("Sí, son iguales");
        }

        /*
        * AGREGAR más funciones a nuestra calculadora
        * Buscar qué metodos tiene el paquete Math
        * Agregar nuevos métodos a la calculadora
        *
        * */

    }



}
