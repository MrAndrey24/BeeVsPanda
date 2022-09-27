package patterns.Observer.principal;

import patterns.Observer.concrete.Observador_Osos;
import patterns.Observer.concrete.Osos;

public class Gestor_Observador {
    Observador_Osos observadorOsoa = new Observador_Osos();
    Osos osos = new Osos();

    public Gestor_Observador() {
        osos.addObserver(observadorOsoa);
    }

    public boolean verificador(int valor) {
        return osos.setState(valor);
    }
}
