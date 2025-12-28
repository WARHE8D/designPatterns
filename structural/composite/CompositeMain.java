package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {
        List<ToDoItem> items = new ArrayList<ToDoItem>();

        ToDoList toDoList = new ToDoList();
        ToDoItem i = new ToDoItem("Do pushups");
        toDoList.addItem(i);
        toDoList.addItem(new ToDoItem("Do pullups"));
        toDoList.addItem(new ToDoItem("Eat healthy"));
        i.markComplete();
        toDoList.isComplete();
    }
}
