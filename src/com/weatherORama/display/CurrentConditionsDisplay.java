package com.weatherORama.display;

import com.weatherORama.Observer;
import com.weatherORama.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
    private Subject WeatherData;
    private float temp;
    private float humidity;

    public CurrentConditionsDisplay(Subject WeatherData){
        this.WeatherData = WeatherData;
        WeatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current weather condition is "+ temp +" degree ferenhit and "+ humidity +"% humidity");
    }
}
