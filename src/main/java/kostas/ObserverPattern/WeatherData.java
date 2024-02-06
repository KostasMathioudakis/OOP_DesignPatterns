package kostas.ObserverPattern;

import java.util.ArrayList;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
    private float temperature;
    private  float humidity;
    private float pressure;

    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        /*
          We aren't sending a data object with the notifyObservers() call. That means
           we are using the PULL model.
         */
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // Since we are using the PULL model we need to create these getters so the observers can pull data.

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    // Other WeatherData methods here
}
