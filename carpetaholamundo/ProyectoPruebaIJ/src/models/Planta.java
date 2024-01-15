package models;

public class Planta {

    // Atributos
    String especie;
    String color;
    float anchoTallo;
    double altura;
    boolean generaFlores;

    // Constructor vacío
    public Planta() {
    }

    // Constructor lleno
    public Planta(String color, float anchoTallo, double altura, boolean generaFlores) {
        this.color = color;
        this.anchoTallo = anchoTallo;
        this.altura = altura;
        this.generaFlores = generaFlores;
    }

    public Planta(String especie, String color, float anchoTallo, double altura, boolean generaFlores) {
        this.especie = especie;
        this.color = color;
        this.anchoTallo = anchoTallo;
        this.altura = altura;
        this.generaFlores = generaFlores;
    }

    // Getter & Setter
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getAnchoTallo() {
        return anchoTallo;
    }

    public void setAnchoTallo(float anchoTallo) {
        this.anchoTallo = anchoTallo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isGeneraFlores() {
        return generaFlores;
    }

    public void setGeneraFlores(boolean generaFlores) {
        this.generaFlores = generaFlores;
    }

    // Métodos propios de la clase
    public void alimetarse() {

    }

    public void fotosintesis() {
        System.out.println("Comsumo co2, libero O");
    }

    public void emiteOlor() {
        System.out.println("Huelo a " + especie);
    }


    @Override
    public String toString() {
        return "Esta planta es parte de la especie " + especie + " Tiene flores? " + generaFlores;
    }
}
