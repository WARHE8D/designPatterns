package behavioral.observable;

import java.beans.PropertyChangeSupport;

public class Location {

    private String weatherEvents;
    //observable
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void setWeatherUpdate(String weatherEvents) {

        //public void firePropertyChange(
        //    String propertyName,
        //    Object oldValue,
        //    Object newValue
        //)
        propertyChangeSupport.firePropertyChange("weatherEvents", this.weatherEvents, weatherEvents);
        this.weatherEvents = weatherEvents;
    }

    public void addPropertyChangeListener(WeatherUpdates weatherUpdatesListener) {
        propertyChangeSupport.addPropertyChangeListener(weatherUpdatesListener);
    }
}
