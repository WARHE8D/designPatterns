package behavioral.template;

public class IsekaiNonbiriNouka extends Isekai {

    //unique event overridden to fits its story
    @Override
    protected void receiveSkill() {
        System.out.println("MC receives a farming tool and builds a nation");
    }
}
