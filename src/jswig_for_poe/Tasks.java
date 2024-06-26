package jswig_for_poe;

import java.util.ArrayList;
import java.util.Optional;

public class Tasks {
    public static ArrayList<Task> tasks = new ArrayList<>();
    static int last_id = 1;

    public static void add_new_task(String name, String description, int duration, String progressStatus) {
        String dev_username = CredentialStorage.logged_username;
        Tasks.add_new_task(name, dev_username, description, duration, progressStatus);
    }

    public static void add_new_task(String name, String dev_username, String description, int duration, String progressStatus) {
        int number = last_id;
        last_id++;

        Task task = new Task(dev_username, name, description, number, duration, progressStatus);

        tasks.add(task);
    }

    public static void clearTasks() {
        tasks.clear();
        last_id = 1;
    }

    public static int returnTotalHours() {
        int total = 0;
        for (Task t : Tasks.tasks) {
            total += t.getDuration();
        }
        return total;
    }

    public static Array<Task> getDoneTasks() {
        Array<Task> tasks = tasks.stream()
            .filter(task -> "Done".equalsIgnoreCase(task.getProgressStatus()));
        return tasks;
    }

    public static void displayDoneTasks() {
        Array<Task> tasks = getDoneTasks();
        for (Task task: tasks) {
            displayTaskDetails(task);
        }
    }

    public static Optional<Task> getLongestTask(){
        Optional<Task> longestTask = tasks.stream().max((t1, t2) -> Integer.compare(t1.getDuration(), t2.getDuration()));
        return longestTask;
    }
    
    public static void displayLongestTask() {
        Optional<Task> longestTask = getLongestTask();
        if (longestTask.isPresent()) {
            Task task = longestTask.get();
            displayTaskDetails(task);
        } else {
            System.out.errprintln("No tasks found.");
        }
    }

    public static Array<Task> searchTaskByName(String name) {
        Array<Task> tasks = tasks.stream().filter(task -> task.getName().equalsIgnoreCase(name));
        return tasks;
    }

    public static void displayTasksByName(String name) {
        Array<Task> tasks = searchTaskByName(name);
        for (Task t: tasks) {
           displayTaskDetails(t); 
        }
    }
    
    public static Array<Task> searchTasksByDeveloper(String devUsername) {
        Array<Task> tasks = tasks.stream().filter(task -> task.getDevUsername().equalsIgnoreCase(devUsername));
        return tasks;
    }

    public static void displayTasksByDeveloper(String devUsername) {
        Array<Task> tasks = searchTasksByDeveloper(devUsername);
        for (Task t: tasks) {
           displayTaskDetails(t); 
        }
    }

    public static void deleteTaskByName(String name) {
        tasks.removeIf(task -> task.getName().equalsIgnoreCase(name));
    }

    public static void displayAllTasksReport() {
        tasks.forEach(Tasks::displayTaskDetails);
    }

    private static void displayTaskDetails(Task task) {
        System.out.printf("Developer: %s, Task Name: %s, Description: %s, Task ID: %s, Duration: %d, Status: %s%n",
            task.getDevUsername(), task.getName(), task.getDescription(), task.createTaskID(), task.getDuration(), task.getProgressStatus());
    }
}
