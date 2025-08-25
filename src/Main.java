public class Main {

    TaskList list = new TaskList();

    public void runner() {
        list.createTask();
    }
    public static void main(String[] args) {
        Main program = new Main();
        program.runner();
    }
}