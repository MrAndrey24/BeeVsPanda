package patterns.decorator.principal;

import patterns.decorator.component.Abeja;
import patterns.decorator.concrete_component.Poder_Abeja;
import patterns.decorator.decorador_concreto.Velocidad_Alta;
import patterns.decorator.decorador_concreto.Velocidad_Baja;
import patterns.decorator.decorador_concreto.Vida;

public class Gestor_Decorador {

    public String tipoFruta(String tipo) {
        Abeja miAbeja = null;
        switch(tipo) {
            case "Banano":
                miAbeja = new Poder_Abeja("Vida");
                new Vida(miAbeja);
                break;

            case "Manzana":
                miAbeja = new Poder_Abeja("Alta");
                new Velocidad_Alta(miAbeja);
                break;

            case "Uva":
                miAbeja = new Poder_Abeja("Baja");
                new Velocidad_Baja(miAbeja);
                break;
        }
        return miAbeja.getFruta();
    }
}
