package creational.factory;

import java.util.HashMap;

public class AssignLanesFactory {


    //simple factory method, assigned by given argument;
    //problem: when new lanes are added it gets too lengthy
    //so we use our beloved hashmap!
    public static void assignLanes(CharacterLanes lanes) {
        switch (lanes) {
            case TOP:
                assignTop();
                break;
            case JGL:
                assignJGL();
                break;
            case SUP:
                assignSup();
                break;
            case MID:
                assignMid();
                break;
            case BOT:
                assignBot();
                break;
            default:
                throw new IllegalArgumentException("Unknown Lane");
        }
    }

    //Runnable when you only need to run an action without any return
    //Supplier when theres a return type
    private static final HashMap<String, Runnable> mapLanes = new HashMap<>();

    //runs only once when class is initialized
    static {
        mapLanes.put("TOP", AssignLanesFactory::assignTop);
        mapLanes.put("JGL", AssignLanesFactory::assignJGL);
        mapLanes.put("SUP", AssignLanesFactory::assignSup);
        mapLanes.put("MID", AssignLanesFactory::assignMid);
        mapLanes.put("BOT", AssignLanesFactory::assignBot);
    }

    public static void assignLanesImproved(CharacterLanes lanes) {
        if (mapLanes.containsKey(lanes.name())) {
            mapLanes.get(lanes.name()).run();
        } else {
            throw new IllegalArgumentException("Lane " + lanes.name() + " not found");
        }
    }


    private static void assignMid() {
        System.out.println("Assigning Mid");
    }

    private static void assignTop() {
        System.out.println("Assigning Top");
    }

    private static void assignJGL() {
        System.out.println("Assigning JGL");
    }

    private static void assignSup() {
        System.out.println("Assigning Sup");
    }

    private static void assignBot() {
        System.out.println("Assigning Bot");
    }
}
