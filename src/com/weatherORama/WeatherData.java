package com.weatherORama;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for(Object observer : observers){
            ((Observer) observer).update(temp, humidity, pressure);
        }
    }

    /*
     * call this method whenever the weather measurements are updated
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
