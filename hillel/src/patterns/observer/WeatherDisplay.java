package patterns.observer;

/**
 * Created by OsadchiyO on 09.11.2015.
 */
public class WeatherDisplay implements  WeatherObserver{

    int temperature;
    int humidity;
    int pressure;

    public void updateWeather(WeatherStation weatherStation) {

    }

    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }

}
