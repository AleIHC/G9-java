import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticaArrayList {

    public static void main(String[] args) {
        System.out.println("Se está ejecutando");

        // Sintaxis para crear un ArrayList en Java
        // ArrayList permite crear lista dinámica, del mismo tipo de dato, que permite duplicados

        // Declaramos una nueva lista de enteros y la inicializamos vacía
        List<Integer> numeros = new ArrayList<>();

        // Imprimir ArrayList
        System.out.println("*****************************");
        System.out.println(numeros);

        // Agregamos elementos a la lista mediante el método .add()
        numeros.add(5);
        numeros.add(10);
        numeros.add(56);
        numeros.add(15);
        numeros.add(20);
        // Agregar indicando el índice y luego el elemento
        numeros.add(3, 72);
        System.out.println(numeros);

        // Remover elementos, que funciona indicando el índice
        numeros.remove(3);
        System.out.println(numeros);

        // Longitud del ArrayList
        System.out.println("La longitud es " + numeros.size());

        // Modificar un elemento
        numeros.set(3, 72);
        System.out.println("La lista modificada quedó así " + numeros);

        // Obtener valor en un índice
        System.out.println("El elemento en la posición es " + numeros.get(2));

        // Evaluar si existe un elemento
        System.out.println("El ArrayList contiene el elemento? " + numeros.contains(5));

        // Remover por valor en ArrayList de enteros
        numeros.remove(Integer.valueOf(72));
        System.out.println("El ArrayList de números después de la eliminación " + numeros);

        // El número más bajo y más alto
        System.out.println("El número más alto es: " + Collections.max(numeros));
        System.out.println("El número más bajo es: " + Collections.min(numeros));

        // Ordenar los elementos de manera de ascendente
        Collections.sort(numeros);
        System.out.println("La lista ordenada queda así: " + numeros);

        // Ordenar de manera descendente
        Collections.reverse(numeros);

        // Remover todos los elementos
        numeros.clear();
        System.out.println(numeros);

        System.out.println("*****************************");

        /******************* ARRAYLIST DE NOMBRES *******************/

        List<String> nombres = new ArrayList<>();
        nombres.add("Adolfo");
        nombres.add("Benjamin");
        nombres.add("Camila");
        nombres.add("Adolfo");
        System.out.println(nombres);
        // Si removemos el duplicado, sólo es removido el primer índice que sea igual
        nombres.remove("Adolfo");
        System.out.println(nombres);

        // Longitud
        System.out.println("Longitud del ArrayList es " + nombres.size());

        // Modificación
        nombres.set(0, "Javiera");
        System.out.println("La lista de nombres modificada quedó así: " + nombres);

        // Obtener elemento
        System.out.println("El nombre en la posición es " + nombres.get(1));

        // Evaluación
        if (!(nombres.contains("Barbara"))) {
            nombres.add("Barbara");
        }

        System.out.println(nombres);

        // Ordenar ascendentemente
        Collections.sort(nombres);
        System.out.println("La lista de nombres después de ordenarse queda así: " + nombres);

        // Revertir orden
        Collections.reverse(nombres);
        System.out.println("Después de revertir la lista, queda así: " + nombres);
    }

}
