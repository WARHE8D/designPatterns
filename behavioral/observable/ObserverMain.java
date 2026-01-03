package behavioral.observable;

public class ObserverMain {
    public static void main(String[] args) {
        Location l = new Location();
        Location l2 = new Location();
        WeatherUpdates weatherUpdates = new WeatherUpdates();

        l.addPropertyChangeListener(weatherUpdates);
        l2.addPropertyChangeListener(weatherUpdates);

        l.setWeatherUpdate("Heavy Rain");
        l2.setWeatherUpdate("Thunderstorm");

        weatherUpdates.getWeatherUpdates();
    }
}
