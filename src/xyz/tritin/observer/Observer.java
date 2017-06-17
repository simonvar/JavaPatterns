package xyz.tritin.observer;

/**
 * @author Simon
 * @since 16.06.17
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
