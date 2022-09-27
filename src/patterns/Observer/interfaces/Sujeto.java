package patterns.Observer.interfaces;

public interface Sujeto {
    void addObserver(Observador o);
    boolean notifyObservers();
}
