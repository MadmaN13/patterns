package observer.java.observable;

import lombok.Getter;
import observer.custom.common.Observable;
import observer.custom.common.Observer;

import java.util.ArrayList;
import java.util.Collection;

public class WeatherData extends java.util.Observable {
    @Getter private float temperature;
    @Getter private float humidity;
    @Getter private float pressure;

    public void measurementsChanged() {
        // here can be added additional behavior
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
