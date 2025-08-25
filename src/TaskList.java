import java.util.LinkedList;

public class TaskList {
    LinkedList<Task> tasks = new LinkedList<Task>();

    public void createTask() {
        Task task = new Task(null, null, null, false);
        task.setTaskName();
        task.setTaskDate();
        task.setTaskDescription();

        tasks.add(task);
        System.out.println("Task " + task.getTaskName() + " has been added!");
    }

    public void getList() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }
    }
}