import java.util.Calendar;
import java.util.Scanner;

public class Task {
    private String taskName;
    private Calendar taskDate;
    private String taskDescription;
    private boolean taskStatus;

    Scanner input = new Scanner(System.in);

    public Task(String taskName, Calendar taskDate, String taskDescription, boolean taskStatus) {
        this.taskName           = taskName;
        this.taskDate           = taskDate;
        this.taskDescription    = taskDescription;
        this.taskStatus         = taskStatus;
    }

    public void setTaskName() {
        System.out.print("Task Name: ");
        taskName = input.nextLine();
    }

    public void setTaskDate(int Year, int Month, int Day) {
        taskDate = Calendar.getInstance();
        System.out.println("Enter the date it is due (number format):");

        System.out.print("Day: ");
        Day = input.nextInt();

        System.out.print("Month: ");
        Month = input.nextInt();

        System.out.print("Year: ");
        Year = input.nextInt();

        taskDate.set(Year, Month, Day);
    }

    public void setTaskDescription() {
        System.out.print("Task Description: ");
        taskDescription = input.nextLine();
    }

    public void setTaskStatus() {
        System.out.print("Task Completed (Yes/No): ");
        String status = input.next().toLowerCase();

        while (true) {
            switch (status) {
            case "yes":
                taskStatus = true;
                break;
            case "no":
                taskStatus = false;
                break;
            default:
                System.out.print("Invalid Input.");
            }
        }
    }

    public String getTaskName() {
        return taskName;
    }

    public Calendar getTaskDate() {
        return taskDate;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean getTaskStatus() {
        return taskStatus;
    }

}
