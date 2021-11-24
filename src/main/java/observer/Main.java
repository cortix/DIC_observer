package observer;

/**
 * @author hasancelik on 14.11.2021
 */
public class Main {
    @Wired
    static WeatherData subject;

    @Wired
    static CurrentConditionsDisplay observer1;

    public static void main(String[] args) {

        subject.setMeasurements(80, 65, 30f);
        observer1.display();
        subject.setMeasurements(800, 650, 300f);
        observer1.display();

    }
}
