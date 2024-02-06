package kostas.ObserverPattern;

//Checkout these implementations for javas util implementation:
import java.util.Observer;
import java.util.Observable;

public class WeatherStation {
    public static void main(String[] args){
        //Creating an instance of the subject class
        WeatherData weatherData = new WeatherData();

        //Creating observers and passing them the subject class so they can register themselves
        //via their constructor method
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //HeatIndex currentHeatIndex = new HeatIndex(weatherData);
        //StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        //Updating the measurements of the subject class so we can see if the implementation is working correctly
        weatherData.setMeasurements(80, 65,  30.4f);
        weatherData.setMeasurements(82, 70,  29.2f);
        weatherData.setMeasurements(78, 90,  29.2f);
    }
}
