public class TiposDeDatos {
    /********************/
    //Variables de tipos de dato
    //Datos primitivos
    byte numeroMuyChiquito = 127;
    short numeroChiquito = 32767;
    int numeroEntero = 2147483647;

    //Hacemos un casteo o conversión a long
    long numeroMasGrande = 328231233271l;

    float decimal = 3.14f;

    double decimalMasPreciso = 3.1416;

    char caracterIndividual = 'g';

    boolean condicional = true;

    /**********************/

    //Datos de referencia u tipo objeto
    //Wrapper
    Integer nuevoEntero = 123456; //Wrapper de int

    Long numeroLargo = 1231355222L;

    // Cadenas de caractéres
    static String cadenaDeCaracteres = "Cohorte 9";
    static String nombre = "Alejandro";
    static String apellido = "Heredia";


    public static void main(String[] args) {

        System.out.println("Mi nombre es: " + nombre + " " + apellido);
        System.out.println("La longitud de este String es de " + cadenaDeCaracteres.length());

    }


}
