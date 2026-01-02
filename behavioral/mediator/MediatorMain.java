package behavioral.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        PedestrianLights pedestrianLights = new PedestrianLights();


//        trafficLight.turnRed(pedestrianLights);
//        trafficLight.turnGreen(pedestrianLights);

        //simpler and lose coupled mediator
        System.out.println("::USING MEDIATOR CLASS TO TRAFFIC RED::");
        var mediator = new Mediator(trafficLight, pedestrianLights);
        mediator.trafficRed();
        System.out.println("::USING MEDIATOR CLASS TO TRAFFIC GREEN::");
        mediator.trafficGreen();
    }
}
