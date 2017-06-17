package xyz.tritin.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Simon
 * @since 16.06.17
 */
public class StatisticDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 0.0f;
    private float tempSum = 0.0f;
    private int numReadings;
    private Observable observable;

    public StatisticDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            tempSum += temp;

            display();
        }
    }
}
