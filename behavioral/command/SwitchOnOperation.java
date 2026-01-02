package behavioral.command;

public class SwitchOnOperation implements LightOperations {

    private final Light light;

    public SwitchOnOperation(Light light) {
        this.light = light;
    }

    @Override
    public void switchLight() {
        light.turnOn();
    }
}
