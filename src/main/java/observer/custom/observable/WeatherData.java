package observer.custom.observable;

import observer.custom.common.Observer;
import observer.custom.common.Observable;

import java.util.ArrayList;
import java.util.Collection;

public class WeatherData implements Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    private Collection<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        // here can be added additional behavior
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
