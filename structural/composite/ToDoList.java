package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ToDoList implements IsComplete {

    List<ToDoItem> items = new ArrayList<>();

    public void addItem(ToDoItem item) {
        items.add(item);
    }

    @Override
    public void isComplete() {
        items.forEach(ToDoItem::isComplete);
    }
}
