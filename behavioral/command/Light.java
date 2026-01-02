package behavioral.command;

public class Light {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void isOn() {
        System.out.println("Light is turned " + (isOn ? "on" : "off"));
    }
}
