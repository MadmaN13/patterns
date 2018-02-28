package observer.custom.common;

public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
