package com.weatherORama;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temp;
    private float humidity;
    private float pressure;

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData(){

    }

    /*
     * call this method whenever the weather measurements are updated
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        measurementsChanged();
    }
}
