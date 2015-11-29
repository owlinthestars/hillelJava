package patterns.observer;

import java.util.Random;

/**
 * Created by OsadchiyO on 09.11.2015.
 */
    public class WeatherForecast implements  WeatherObserver {
    int temperature;
    int humidity;
    int pressure;

    public void updateWeather(WeatherStation weatherStation) {
        this.temperature = generate(weatherStation.getTemperature());
        this.humidity = generate(weatherStation.getHumidity());
        this.pressure = generate(weatherStation.getPressure());
    }

    private int generate(int value) {
        Random random = new Random();
        double seed = random.nextDouble();
            seed = seed - 0.5;
            seed = seed/5;

        return (int) (value* (1+ seed));
    }

    public void display() {
        System.out.println("forecast: temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}
