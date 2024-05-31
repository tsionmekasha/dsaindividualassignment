package ToDoListApplication;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        
        toDoList.addToDo(new Task("Task 1", "I'm going to attend a seminar"));
        toDoList.addToDo(new Task("Task 2", "I'm going to my hospital checkup"));
        toDoList.addToDo(new Task("Task 3", "I'm going to call my mom"));
 
        toDoList.viewToDoList();
      
        toDoList.markToDoAsCompleted("Task 1");

        toDoList.viewToDoList();
    }
}
