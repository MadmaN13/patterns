package observer.custom.observer;

import lombok.extern.slf4j.Slf4j;
import observer.custom.common.DisplayElement;
import observer.custom.common.Observable;
import observer.custom.common.Observer;

@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        LOGGER.info("\r\nCurrent conditions: \r\nTemperature = " + temperature + "\r\nHumidity = " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperature = temp;
        this.humidity = humidity;
        display();
    }
}
