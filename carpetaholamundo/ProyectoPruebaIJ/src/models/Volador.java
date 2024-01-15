package models;

// Palabra reservada abstract se usa para declarar clases abstractas
public abstract class Volador {

    // Los métodos abstractos sólo se declaran
    public void puedeVolar() {
        System.out.println("Sí, puedo volar");
    }

    public abstract void volar();

}
