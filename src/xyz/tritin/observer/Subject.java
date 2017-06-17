package xyz.tritin.observer;

/**
 * @author Simon
 * @since 16.06.17
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
