package behavioral.mediator;

public class PedestrianLights {
    private TrafficLightColors trafficLightColors;

    public PedestrianLights() {
        this.trafficLightColors = TrafficLightColors.RED;
    }

    public void turnGreen() {
        this.trafficLightColors = TrafficLightColors.GREEN;
        System.out.println("Pedestrian lights turned green");
    }

    public void turnRed() {
        this.trafficLightColors = TrafficLightColors.RED;
        System.out.println("Pedestrian lights turned red");
    }
}
