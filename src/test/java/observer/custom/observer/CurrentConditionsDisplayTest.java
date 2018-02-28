package observer.custom.observer;

import observer.custom.observable.WeatherData;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrentConditionsDisplayTest {

    @Test
    public void testDisplay() {
        // observable
        WeatherData data = new WeatherData();

        // observer
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(data);

        // change state and notify observer
        data.setMeasurements(80,65,30.4f);
        data.setMeasurements(82,70,29.2f);
        data.setMeasurements(78,90,29.2f);
    }

}