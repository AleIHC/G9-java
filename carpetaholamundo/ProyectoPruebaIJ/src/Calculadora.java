public class Calculadora {

    //Scope
    //Definimos una variable

    // Métodos de retorno y sin retorno
    public static void main(String[] args) {
        /**************USANDO FUNCIONES ESTÁTICAS******************/
        /*
        int resultadoSuma = suma(5,6);
        double resutadoSumaDecimal = suma(1.00, 4.43,6.23);

        System.out.println("El resultado de la suma es: " + resutadoSumaDecimal );
        */

        informacionCalculadora("Casio", "Gris", true);

    }

    // Método con retorno
    public int suma(int num1, int num2) {
        // Guardamos el resultado de la suma de ambos argumentos en una variable
        int resultado = num1 + num2;
        // Retornamos el resultado que corresponde con el mismo tipo de dato de retorno
        return resultado;
    }

    public double suma(double num3, double num4, double num5) {
        return  num3 + num4 + num5;
    }

    public int division(int num1, int num2) {
        return num1/num2;
    }

    // Método sin retorno (void)
    public static void informacionCalculadora(String marca, String color, Boolean esCientifica) {
        System.out.println("Esta calculadora es marca " + marca );
        System.out.println("Es de color " + color);
        if (esCientifica) {
            System.out.println("Puedes realizar operaciones matemáticas complejas");
        } else {
            System.out.println("Sólo puedes sumar y restar");
        }
    }


}
