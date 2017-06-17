import xyz.tritin.observer.CurrentConditionsDisplay;
import xyz.tritin.observer.HeatIndexDisplay;
import xyz.tritin.observer.StatisticDisplay;
import xyz.tritin.observer.WeatherData;

/**
 * @author Simon
 * @since 16.06.17
 */
public class WeatherStation {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        HeatIndexDisplay indexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
