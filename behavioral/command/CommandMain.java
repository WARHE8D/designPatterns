package behavioral.command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CommandMain {
    public static void main(String[] args) {
        var light = new Light();
        light.turnOn();
        light.isOn();
        light.turnOff();
        light.isOn();
        //this is simple but exposes the internal Light methods.
        //I can abstract it by making on and off operations which can later be used to provide more
        // functionality and flexibility without changing the main Light class
        System.out.println("Command Pattern::");
        var light1 = new Light();

        var lightOpExe = new LightOperationExecutor();

        lightOpExe.execute(new SwitchOnOperation(light1));
        light1.isOn();

        lightOpExe.execute(new SwitchOffOperation(light1));
        light1.isOn();

        Collection<String> c = new ArrayList<String>();
        Iterator<String> it = c.iterator();
    }
}
