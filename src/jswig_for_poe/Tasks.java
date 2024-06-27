package jswig_for_poe;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

//creation of the tasks array list
public class Tasks {
    public static ArrayList<Task> tasks = new ArrayList<>();
    static int last_id = 1;

    //this pulls the credentials for the new task from credential page
    public static void add_new_task(String name, String description, int duration, String progressStatus) {
        String dev_username = CredentialStorage.logged_username;
        Tasks.add_new_task(name, dev_username, description, duration, progressStatus);
    }

    //this add a task to the view and with the proper description of the task that needs to be displayed
    public static void add_new_task(String name, String dev_username, String description, int duration, String progressStatus) {
        int number = last_id;
        last_id++;

        Task task = new Task(dev_username, name, description, number, duration, progressStatus);

        tasks.add(task);
    }

    //clears the tasks 
    public static void clearTasks() {
        tasks.clear();
        last_id = 1;
    }

    //returns the total hours 
    public static int returnTotalHours() {
        int total = 0;
        for (Task t : Tasks.tasks) {
            total += t.getDuration();
        }
        return total;
    }

    //this returns all the tasks that are done
    public static ArrayList<Task> getDoneTasks() {
        return tasks.stream()
            .filter(task -> "Done".equalsIgnoreCase(task.getProgressStatus()))
            .collect(Collectors.toCollection(ArrayList::new));
    }

    //this shows the tasks that are done
    public static void displayDoneTasks() {
        ArrayList<Task> doneTasks = getDoneTasks();
        for (Task task: doneTasks) {
            displayTaskDetails(task);
        }
    }
 
    //this gets the longest code to return
    public static Optional<Task> getLongestTask(){
        return tasks.stream().max((t1, t2) -> Integer.compare(t1.getDuration(), t2.getDuration()));
    }
    
    //this will display the longest task 
    public static void displayLongestTask() {
        Optional<Task> longestTask = getLongestTask();
        if (longestTask.isPresent()) {
            Task task = longestTask.get();
            displayTaskDetails(task);
        } else {
            System.err.println("No tasks found.");
        }
    }
//this function is here to search the tasks by name
    public static ArrayList<Task> searchTaskByName(String name) {
        return tasks.stream()
            .filter(task -> task.getName().equalsIgnoreCase(name))
            .collect(Collectors.toCollection(ArrayList::new));
    }

    //This is here in order to display the task that was searched
    public static void displayTasksByName(String name) {
        ArrayList<Task> tasksByName = searchTaskByName(name);
        for (Task t: tasksByName) {
           displayTaskDetails(t); 
        }
    }
    
    //this function is here for when the developer is searched
    public static ArrayList<Task> searchTasksByDeveloper(String devUsername) {
        return tasks.stream()
            .filter(task -> task.getDevUsername().equalsIgnoreCase(devUsername))
            .collect(Collectors.toCollection(ArrayList::new));
    }

    //this function is here to dislpay the developer that was searched
    public static void displayTasksByDeveloper(String devUsername) {
        ArrayList<Task> tasksByDeveloper = searchTasksByDeveloper(devUsername);
        for (Task t: tasksByDeveloper) {
           displayTaskDetails(t); 
        }
    }

    //this will delete a task when called
    public static void deleteTaskByName(String name) {
        tasks.removeIf(task -> task.getName().equalsIgnoreCase(name));
    }

    //this will display a report once the buton is clicked
    public static void displayAllTasksReport() {
        tasks.forEach(Tasks::displayTaskDetails);
    }

    //This will show the details of the task
    private static void displayTaskDetails(Task task) {
        System.out.printf("Developer: %s, Task Name: %s, Description: %s, Task ID: %s, Duration: %d, Status: %s%n",
            task.getDevUsername(), task.getName(), task.getDescription(), task.createTaskID(), task.getDuration(), task.getProgressStatus());
    }
}