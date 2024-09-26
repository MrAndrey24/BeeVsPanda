package patterns.Observer.concrete;

import patterns.Observer.interfaces.Observer;
import patterns.Observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Bear implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int value;

    public int getValue() {
        return value;
    }

    public boolean setState(int value) {
        this.value = value;
        return notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public boolean notifyObservers() {
        for (Observer ob : observers) {
            return ob.verifyQuantity(getValue());
        }
        return false;
    }
}
