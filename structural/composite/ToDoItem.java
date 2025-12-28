package structural.composite;

public class ToDoItem implements IsComplete {

    private final String item;
    boolean complete;

    ToDoItem(String item) {
        this.item = item;
    }

    void markComplete() {
        complete = true;
    }

    @Override
    public void isComplete() {
        System.out.println("Item " + item + " is " + complete);
    }
}
