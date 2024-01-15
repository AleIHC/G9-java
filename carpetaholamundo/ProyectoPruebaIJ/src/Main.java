import models.*;

public class Main {

    //Este es un comentario de línea

    //Este es un comentario de bloque


    //Modificador de acceso + palabra reservada static + void
    public static void main(String[] args) {

        /******
        // Método para imprimir en consola
        System.out.println("Hola mundo!");
        System.out.println("Esto es una impresión en consola");

        // Instancia de la clase Scanner
        String nombre;
        Scanner sc = new Scanner(System.in);
        // Almacena el input del usuario en una variable
        String nombreUsuario = sc.nextLine();
        System.out.println("Tu nombre es: " + nombreUsuario);

        //Declarar la variable, siempre indicar el tipo de dato
        int numero;
        //Declarar e inicializar
        int numeroSuerte = 7;

        //Datos de tipo primitivo no tienen métodos asociados
        TiposDeDatos datos = new TiposDeDatos();
        System.out.println(datos.numeroChiquito);

        //Datos de referencia tienen varios métodos asociados
        String numeroNuevo = datos.nuevoEntero.toString();
        System.out.println(numeroNuevo);
        ***********/

        /***************JAVA BÁSICO***********/

        /***************OBJETOS***************/
        /*Creamos instancias de la clase animal, humano, perro, elefante, ballena con sus atributos(tamaño, especie, etc)
        Animal serHumano = new Animal(1.80, "Homo Sapiens", 'I', 2, false);
        // Accedemos a los métodos de instancia(no estáticos)
        serHumano.comer();

        Animal perro = new Animal(80, "Canis Lupus Familiaris", 'I', 4, false);
        perro.dormir();

        Animal pinguino = new Animal(1.00, "Spheniscidae", 'I', 2, false);

        // Obtenemos el valor de los distintos atributos mediante los getter
        System.out.println(serHumano.getEspecie());
        System.out.println(perro.getNumeroPatas());
        System.out.println(pinguino.isPuedeVolar());

        // Cambiamos el valor de los disntitos atributos mediante los setter
        // El setter es un método que acepta como argumento, el valor que vamos modificar
        pinguino.setPuedeVolar(true);
        System.out.println(pinguino.isPuedeVolar());
        perro.setNumeroPatas(3);
        System.out.println(perro.getNumeroPatas());
        serHumano.setEspecie("Homo Erectus");
        System.out.println(serHumano.getEspecie());
         */



        Perro perroJorge = new Perro(1.00, "Canis Lupus Familiaris", 'F', 4, false, "Labrador", 30.00);
        System.out.println("La especie del perro es: " + perroJorge.getEspecie() + "  y la raza del perro es: " + perroJorge.getRaza());
        perroJorge.comerCarne();

        perroJorge.comunicar("Guau");
        perroJorge.caminar();

        perroJorge.formaReproduccion();

        Pinguino mumble = new Pinguino(1.50, "Spheniscidae", 'M', 2, false, 50.00, "Blanco y negro");
        System.out.println("La especie del pinguino es: " + mumble.getEspecie() + "  y su plumaje es de color: " + mumble.getColorPlumaje());
        mumble.comerCarne();
        //Método comunicar está sobrecargado para funcionar con uno o más argumentos
        mumble.comunicar("Pio", "Pio");
        mumble.caminar();

        mumble.formaReproduccion();



        Abeja nuevaAbeja = new Abeja();
        nuevaAbeja.volar();
        nuevaAbeja.puedeVolar();

        Murcielago batman = new Murcielago();
        batman.volar();
        batman.puedeVolar();





        /*************************************/
        /*/Creamos nuevas instancias de la clase planta
        Planta ruda = new Planta("Rutaceae Graveolens", "Verde", 0.10f, 0.30, false );
        System.out.println("La especie de la ruda es: " + ruda.getEspecie());

        Planta helecho = new Planta("verde", 0.1f, 0.40, false);
        System.out.println("La especie del helecho es: " + helecho.getEspecie());

        /*************************************/

    }
}