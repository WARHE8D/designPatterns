package behavioral.mediator;

public class TrafficLight {

    private TrafficLightColors trafficLightColors;

    public TrafficLight() {
        this.trafficLightColors = TrafficLightColors.RED;
    }

    public void setTrafficLightColors(TrafficLightColors trafficLightColors) {
        this.trafficLightColors = trafficLightColors;
    }

    public void turnRed() {//no need to param PedestrianLights pedestrianLights
        this.trafficLightColors = TrafficLightColors.RED;
        System.out.println("Traffic light turned red");
//        pedestrianLights.turnGreen(); no longer to call this as its handled by mediator
    }

    public void turnGreen() {//no need to param PedestrianLights pedestrianLights
//        pedestrianLights.turnRed(); no longer to call this as its handled by mediator
        this.trafficLightColors = TrafficLightColors.GREEN;
        System.out.println("Traffic light turned green");
    }
}
