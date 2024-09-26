package patterns.Observer.principal;

import patterns.Observer.concrete.Bear_Observer;
import patterns.Observer.concrete.Bear;

public class Observer_Manager {
    Bear_Observer observerOsoa = new Bear_Observer();
    Bear bear = new Bear();

    public Observer_Manager() {
        bear.addObserver(observerOsoa);
    }

    public boolean verifier(int valor) {
        return bear.setState(valor);
    }
}
