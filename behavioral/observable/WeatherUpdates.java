package behavioral.observable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class WeatherUpdates implements PropertyChangeListener {

    private final List<String> weatherEvents = new ArrayList<String>();

    public void getWeatherUpdates() {
        weatherEvents.forEach(System.out::println);
    }


    //observer
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        weatherEvents.add(evt.getNewValue().toString());//adds the new change to the list
    }
}
