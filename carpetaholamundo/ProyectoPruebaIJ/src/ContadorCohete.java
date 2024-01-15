public class ContadorCohete {

    public static void main(String[] args) {

        // Bucle while se ejecuta indefinidamente siempre que la condición sea verdadera
        int contador = 10;

        // While significa mientras que la condición sea verdadera
        while (contador >= 0) { // Bloque de código
            // break y continue sirven para manejar la salida del bucle o la omisión de una iteración en base a una condición
            /*
            if (contador == 5) {
                contador--;
                continue;
            }*/
            System.out.println(contador);
            contador--; // Usamos el decremento para disminuir con cada iteración
        }
        System.out.println("Despegue!");
    }
}
