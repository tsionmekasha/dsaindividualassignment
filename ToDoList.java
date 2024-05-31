package ToDoListApplication;

class ToDoList {
    private Node head;

    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted();
                System.out.println("Task '" + title + "' marked as completed.");
                return;
            }
            current = current.getNext();
        }
        System.out.println("Task '" + title + "' not found in the to-do list.");
    }

    public void viewToDoList() {
        Node current = head;
        if (current == null) {
            System.out.println("To-do list is empty.");
        } else {
            System.out.println("To-Do List:");
            while (current != null) {
                Task task = current.getTask();
                String status = task.isCompleted() ? "[Completed]" : "[Not Completed]";
                System.out.println(task.getTitle() + " - " + task.getDescription() + " " + status);
                current = current.getNext();
            }
        }
    }
}

