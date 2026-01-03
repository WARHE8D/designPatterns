package behavioral.template;

public class IsekaiSlime extends Isekai {

    //unique event overridden to fits its story
    @Override
    protected void receiveSkill() {
        System.out.println("MC receives a unique skill and becomes a slime");
    }


}
