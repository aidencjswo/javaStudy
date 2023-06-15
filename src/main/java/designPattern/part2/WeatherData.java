package designPattern.part2;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged(){
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();

        currentConditionsDisplay.update();

    }
    static class CurrentConditionsDisplay{
        public void update(){

        }
    }
    static class statisticsDisplay{
        public void update(){

        }
    }
    static class forecastDisplay{
        public void update(){

        }
    }
}

