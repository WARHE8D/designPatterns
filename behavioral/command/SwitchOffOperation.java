package behavioral.command;

public class SwitchOffOperation implements LightOperations {

    private final Light light;

    public SwitchOffOperation(Light light) {
        this.light = light;
    }

    @Override
    public void switchLight() {
        light.turnOff();
    }
}
