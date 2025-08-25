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

    

}
