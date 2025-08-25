import java.util.LinkedList;

public class TaskList {
    Task task = new Task(null, null, null, false);
    LinkedList<Task> tasks = new LinkedList<Task>();

    public void createTask() {
        task.setTaskName();
        task.setTaskDate();
        task.setTaskDescription();
        task.setTaskStatus();

        tasks.add(task);
        System.out.println("Task " + task.getTaskName() + " has been added!");
    }
}