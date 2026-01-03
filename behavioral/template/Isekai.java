package behavioral.template;

public abstract class Isekai {
    //instead of creating new similar scenarios we can create a new template for similar events and reuse it in each show
    // template method
    public final void startStory() {
        realWorldScenario();
        truckEvent();
        reincarnation();
        receiveSkill();
    }

    protected void realWorldScenario() {
        System.out.println("MC has a random job or is a school student who is fed up with his life");
    }

    protected void truckEvent() {
        System.out.println("MC gets hit by a truck");
    }

    protected void reincarnation() {
        System.out.println("MC has a reincarnation to a new world");
    }

    // unique storyline begins
    protected abstract void receiveSkill();
}
