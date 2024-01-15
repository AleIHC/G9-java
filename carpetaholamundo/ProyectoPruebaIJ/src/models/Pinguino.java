package models;

public class Pinguino extends Animal implements Carnivoro, Oviparo  {

    private Double longitudAletas;
    private String colorPlumaje;

    // Constructores
    public Pinguino() {
    }

    public Pinguino(double tamanio, String especie, char genero, int numeroPatas, boolean puedeVolar, Double longitudAletas, String colorPlumaje) {
        super(tamanio, especie, genero, numeroPatas, puedeVolar);
        this.longitudAletas = longitudAletas;
        this.colorPlumaje = colorPlumaje;
    }

    // Getter & setter
    public Double getLongitudAletas() {
        return longitudAletas;
    }

    public void setLongitudAletas(Double longitudAletas) {
        this.longitudAletas = longitudAletas;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public void regalaPiedritas() {
        System.out.println("Le trae una piedrita a su amor");
    }

    public void regurgitarComida() {
        System.out.println("El pinguino le regurgita la comida a su cría");
    }

    @Override
    public void caminar() {
        System.out.println("Nada con sus aletas");
    }

    @Override
    public void comerCarne() {
        System.out.println("Comió pescado");
    }

    @Override
    public void formaReproduccion() {
        System.out.println("Pone un huevo al año");
    }
}
