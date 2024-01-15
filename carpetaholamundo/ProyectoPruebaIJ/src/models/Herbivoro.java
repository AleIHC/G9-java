package models;


//Las interfaces sólo definen métodos
public interface Herbivoro {

    //Todos los métodos que se definen en interfaces son abstractos
    //Este método es abstracto es decir que sólo indicamos que existe y cada una de las clases que lo implementen
    //Le pueden dar su propio comportamiento
    void comerPlantas();
}
