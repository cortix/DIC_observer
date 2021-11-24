package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hasancelik on 14.11.2021
 */
public class WeatherData implements Subject{

    List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData(ArrayList list) {
        this.observerList = list;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
