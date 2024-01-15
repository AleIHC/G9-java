public class ArreglosEstaticos {

    public static void main(String[] args) {

        // Los arreglos o arrays son estructuras de datos
        // Los estáticos no permiten que incrementemos el número de datos que vamos a almacenar

        // Los arrays estáticos cuando se inicializan con los elementos, estos van en llaves
        int[] arrayDeEnteros = {5,7,8,2};

        // Puedo inicializar un array estático vacío e indicar la longitud máxima
        int[] arrayVacio = new int[4];

        // Los arreglos no tienen métodos asociados sino propiedades
        System.out.println("La longitud del segundo array es " + arrayVacio.length);

        // Para acceder a cada índice lo hacemos con [] En Java los arrays también son de índice 0
        System.out.println("El elemento el la posición 1 del segundo array es: " + arrayVacio[1]);

        /*
        // Aplicar for para recorrer un array estático
        for (int i = 0; i < arrayVacio.length; i++) {
            //Modificamos el valor de un elemento en un array estático
            arrayVacio[i] = i + 5;
            System.out.println("El elemento en la posición " + i + " es " + arrayVacio[i]);
        }
        */

        // ForEach itera sobre cada elemento de un array
        // Indicamos la variable que vamos a utilizar para cada elemento : nombre del array
        for (int numero : arrayDeEnteros) {
            System.out.println("El elemento tiene este valor " + numero);
        }

    }
}
