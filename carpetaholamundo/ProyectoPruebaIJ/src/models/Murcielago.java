package models;

public class Murcielago extends Volador implements Herbivoro {

    // Con el Override estamos sobrescribiendo el método abstracto declarado en la superclase abstracta Volador
    @Override // Override es una anotación, es decir va a antes de una declaración
    public void volar() {
        System.out.println("Vuela con sus alas en forma de membranas");
    }

    // Con el Override estamos sobrescribiendo el comportamiendo del método cuando fue declarado en la Interfaz
    @Override
    public void comerPlantas() {
        System.out.println("Comió frutas");
    }

}
