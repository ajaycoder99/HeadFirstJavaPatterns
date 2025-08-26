package com.patterns.chp_02_observer;

public class ForecastDisplay implements
        Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    public void display() {
        if (currentPressure < lastPressure) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (currentPressure > lastPressure) {
            System.out.println("Forecast: Worsening weather on the way!");
        } else {
            System.out.println("Forecast: Weather is stagnant!");
        }
    }
}
