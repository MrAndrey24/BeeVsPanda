package patterns.Observer.interfaces;

public interface Subject {
    void addObserver(Observer o);
    boolean notifyObservers();
}
