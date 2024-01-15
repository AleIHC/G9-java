package models;

//La palabra extends indica que Perro hereda de Animal
public class Perro extends Animal implements Carnivoro, Viviparo  {

    // Atributos propios o específicos de la clase Perro
    private String raza;
    private Double largoCola;

    // Constructores
    public Perro() {
    }

    public Perro(double tamanio, String especie, char genero, int numeroPatas, boolean puedeVolar, String raza, Double largoCola) {
        super(tamanio, especie, genero, numeroPatas, puedeVolar);
        this.raza = raza;
        this.largoCola = largoCola;
    }


    //Getter & Setter
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Double getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(Double largoCola) {
        this.largoCola = largoCola;
    }

    // Métodos propios o específicos de la clase
    public void aullar() {
        System.out.println("El perro hace Auuuuuu");
    }

    public void marcarTerritorio() {
        System.out.println("El perro ha marcado su territorio");
    }

    // La sobreescritura le otorga un comportamiento específico a cada clase
    @Override
    public void caminar() {
        System.out.println("Corre con sus 4 patas");
    }


    @Override
    public void comerCarne() {
        System.out.println("Comió carnde cruda");
    }

    @Override
    public void formaReproduccion() {
        System.out.println("Nacen cachorritos");
    }
}
