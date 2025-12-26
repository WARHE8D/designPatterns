import creational.factory.AssignLanesFactory;
import creational.factory.CharacterLanes;

public class FactoryMain {
    public static void main(String[] args) {
        System.out.println("Running Factory Method Pattern code");
        //same use but improved has better scalability and can use cool methods like runnable and supplier and ofc the hashmap
        AssignLanesFactory.assignLanes(CharacterLanes.MID);
        AssignLanesFactory.assignLanes(CharacterLanes.BOT);
        AssignLanesFactory.assignLanesImproved(CharacterLanes.TOP);
        AssignLanesFactory.assignLanesImproved(CharacterLanes.JGL);
        AssignLanesFactory.assignLanesImproved(CharacterLanes.SUP);
    }

}