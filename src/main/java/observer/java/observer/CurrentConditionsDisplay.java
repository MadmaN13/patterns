package observer.java.observer;

import lombok.extern.slf4j.Slf4j;
import observer.custom.common.DisplayElement;
import observer.java.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        LOGGER.info("\r\nCurrent conditions: \r\nTemperature = " + temperature + "\r\nHumidity = " + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;
            temperature = data.getTemperature();
            humidity = data.getHumidity();
            display();
        }
    }
}
