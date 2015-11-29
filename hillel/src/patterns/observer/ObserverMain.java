package patterns.observer;

/**
 * Created by OsadchiyO on 09.11.2015.
 */
public class ObserverMain {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
     WeatherDisplay current = new WeatherDisplay();
        WeatherDisplay display = new WeatherDisplay();
        WeatherStatistic statistic = new WeatherStatistic();
        WeatherForecast forecast = new WeatherForecast();

        station.register(display);
        station.register(statistic);
        station.register(forecast);

        station.setPressure(20);
        station.setHumidity(50);
        station.setTemperature(10);

        station.measurementChanged();

        station.removeObserver(current);

        current.display();
        statistic.display();
        forecast.display();

        station.setPressure(15);
        station.setHumidity(45);
        station.setTemperature(25);

        station.measurementChanged();

        current.display();
        statistic.display();
        forecast.display();
    }

}
