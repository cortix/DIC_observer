package observer;

import java.util.ArrayList;

/**
 * @author hasancelik on 22.11.2021
 */
@Config
public class Configuration {

    @Beaned
    public WeatherData weatherData() {
        WeatherData weatherData = new WeatherData(new ArrayList());
        return weatherData;
    }

    @Beaned
    public CurrentConditionsDisplay currentConditionsDisplay() {
        CurrentConditionsDisplay c = new CurrentConditionsDisplay(weatherData());
        return c;
    }

}
