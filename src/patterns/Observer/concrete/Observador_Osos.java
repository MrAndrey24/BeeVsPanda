package patterns.Observer.concrete;

import patterns.Observer.interfaces.Observador;

public class Observador_Osos implements Observador {
    @Override
    public boolean verificarCantidad(int value) {
        if(value>=150)//Check the number of bears eliminated
            return true;
        return false;
    }
}
