package behavioral.mediator;

public class Mediator {
    private final TrafficLight trafficLight;
    private final PedestrianLights pedestrianLights;

    public Mediator(TrafficLight trafficLight, PedestrianLights pedestrianLights) {
        this.trafficLight = trafficLight;
        this.pedestrianLights = pedestrianLights;
    }

    public void trafficRed() {
        trafficLight.turnRed();
        pedestrianLights.turnGreen();
    }

    public void trafficGreen() {
        pedestrianLights.turnRed();
        trafficLight.turnGreen();
    }
}
