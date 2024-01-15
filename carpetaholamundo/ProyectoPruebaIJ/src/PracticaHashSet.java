import java.util.HashSet;
import java.util.Set;

public class PracticaHashSet {

    public static void main(String[] args) {
        // Declaramos e inicializamos nuestro HashSet
        //HashSet no permite ingresar duplicados ni tiene un orden específico
        Set<String> peliculasFavoritas = new HashSet<>();

        // Agregar elementos
        peliculasFavoritas.add("Legalmente Rubia");
        peliculasFavoritas.add("El planeta del tesoro");
        peliculasFavoritas.add("Taken");
        peliculasFavoritas.add("Scarface");
        peliculasFavoritas.add("El Señor de los Anillos");
        peliculasFavoritas.add("OldBoy");
        peliculasFavoritas.add("Django Unchained");

        // Imprimir
        System.out.println(peliculasFavoritas);

        // Remover
        // peliculasFavoritas.remove("Legalmente Rubia");
        // System.out.println(peliculasFavoritas);

        // Longitud
        System.out.println("La longitud del set es de: " + peliculasFavoritas.size());

        // Verificar si hay un elemento
        System.out.println("La película está en la lista? " + peliculasFavoritas.contains("Taken"));

        // Iteramos sobre el set con un for each
        for ( String pelicula : peliculasFavoritas) {
            System.out.println(pelicula);
        }

    }
}
