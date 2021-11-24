package observer;

/**
 * @author hasancelik on 14.11.2021
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
