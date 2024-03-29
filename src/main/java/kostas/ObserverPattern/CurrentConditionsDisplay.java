package kostas.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements  Observer,DisplayElement{

    Observable observable;

    private float temperature;
    private float humidity;

    // Reference to the Subject class 'WeatherData' so we can the observer can register and unregister itself.

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions:  " + temperature
        + "F and " + humidity + " %humidity");
    }
}
