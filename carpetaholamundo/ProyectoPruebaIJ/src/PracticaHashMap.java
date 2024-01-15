import java.util.HashMap;
import java.util.Map;

public class PracticaHashMap {

    public static void main(String[] args) {
        // HashMap es una estructura de datos que almacena en pares clave-valor

        // Declaramos, indicando los dos tipos de dato el de la clave y el del valor, e inicializamos nuestro Map
        Map<String, String> entrenadorPokemon = new HashMap<String, String>();

        // Agregar
        entrenadorPokemon.put("Eduardo", "Charizard");
        entrenadorPokemon.put("Paola", "Cyndaquil");
        entrenadorPokemon.put("Sebastián", "Hitmonlee");
        entrenadorPokemon.put("Zafírea", "Chikorita");
        entrenadorPokemon.put("Allan", "Cinderace");
        entrenadorPokemon.put("Juan Pablo", "Metapod");
        entrenadorPokemon.put("Francisco", "Psyduck");
        entrenadorPokemon.put("Camila", "Sylveon");

        // Imprimir
        System.out.println(entrenadorPokemon);

        // Obtener elemento en una clave
        String pokemonDeZafi = entrenadorPokemon.get("Zafírea");
        System.out.println("Zafi eligió a " + pokemonDeZafi);

        // Remover elemento por clave
        entrenadorPokemon.remove("Juan Pablo");
        System.out.println(entrenadorPokemon);

        // Verificar si existe una clave
        System.out.println("Existe este entrenador? " + entrenadorPokemon.containsKey("Allan"));

        // Imprimir longitud
        System.out.println(entrenadorPokemon.size());

        /*
        // Recorrer con EntrySet
        for (Map.Entry<String, String> entrada :  entrenadorPokemon.entrySet()) {
            // El método getKey va a obtener la clave
            String clave = entrada.getKey();
            String pokemon = entrada.getValue();
            System.out.println("El entrenador de esta ronda es " + clave + " y su pokemon elegido es " + pokemon);
        }*/

        for ( String clave : entrenadorPokemon.keySet()) {
            System.out.println("El entrenador de esta ronda es " + clave + " y el pokemon elegido es " + entrenadorPokemon.get(clave));
        }





    }
}
