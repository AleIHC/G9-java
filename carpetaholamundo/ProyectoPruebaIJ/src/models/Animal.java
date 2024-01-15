package models;

public class Animal {

    // Atributos o "Estado" (Aquello que lo describe)
    // Encapsulamos la información que es importante para la clase a través del modificador de acceso private
    private double tamanio;
    private String especie;
    private char genero;
    private int numeroPatas;
    private boolean puedeVolar;


    // Constructores permiten crear la instancia del objeto con sus atributos

    // Constructor vacío
    public Animal() {
    }

    // Constructor lleno
    public Animal(double tamanio, String especie, char genero, int numeroPatas, boolean puedeVolar) {
        this.tamanio = tamanio;
        this.especie = especie;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.puedeVolar = puedeVolar;
    }

    // Los accesadores y mutadores son métodos que permiten obtener el valor de un atributo y cambiarlo
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    // Métodos o "Comportamiento" (Aquello que hace)

    public void caminar() {
        System.out.println("Avanza 2 pasos");
    }

    public  void dormir() {

    }


    // Sobrecarga de métodos
    public void comunicar(String palabra) {
        System.out.println("Hola te quería decir " + palabra);
    }

    // Sobrecarga al método al otorgarle otros parámetros
    public void comunicar(String palabra1, String palabra2) {
        System.out.println("Hola, ahora te quiero decir " + palabra1 + " " + palabra2);
    }

    // Sobrescritura
    // Método para imprimir
    @Override
    public String toString() {
        return  especie + "{" +
                "mide: " + tamanio +
                '\'' +
                ", genero: " + genero +
                ", tiene " + numeroPatas + " patas" +
                ", puedeVolar=" + puedeVolar +
                '}';
    }
}
