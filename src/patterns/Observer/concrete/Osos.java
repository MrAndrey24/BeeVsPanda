package patterns.Observer.concrete;

import patterns.Observer.interfaces.Observador;
import patterns.Observer.interfaces.Sujeto;

import java.util.ArrayList;
import java.util.List;

public class Osos implements Sujeto {
    private List<Observador> observers = new ArrayList<Observador>();
    private int value;

    public int getValue() {
        return value;
    }

    public boolean setState(int value) {
        this.value = value;
        return notifyObservers();
    }

    @Override
    public void addObserver(Observador o) {
        this.observers.add(o);
    }

    @Override
    public boolean notifyObservers() {
        for (Observador ob : observers) {
            return ob.verificarCantidad(getValue());
        }
        return false;
    }
}
