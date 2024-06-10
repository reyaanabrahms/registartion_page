/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Reyaan Abrahams
 */

public class CredentialStorage {
    public static String username;
    public static String name;
    public static String password;
    public static String lastname;
    
    public static boolean loggedIn;
    public static String logged_username;
    
    // Task related fields and methods
    public static ArrayList<Task> tasks = new ArrayList<>();
    static int last_id = 1;

    public static void add_new_task(String name, String description, int duration, String progressStatus) {
        String dev_username = logged_username;
        add_new_task(name, dev_username, description, duration, progressStatus);
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
        for (Task t : tasks) {
            total += t.getDuration();
        }
        return total;
    }

    public static void displayDoneTasks() {
        tasks.stream()
            .filter(task -> "Done".equalsIgnoreCase(task.getProgressStatus()))
            .forEach(task -> System.out.printf("Developer: %s, Task Name: %s, Duration: %d%n",
                task.getDevUsername(), task.getName(), task.getDuration()));
    }

    public static void displayLongestTask() {
        Optional<Task> longestTask = tasks.stream().max((t1, t2) -> Integer.compare(t1.getDuration(), t2.getDuration()));
        if (longestTask.isPresent()) {
            Task task = longestTask.get();
            System.out.printf("Developer: %s, Duration: %d%n", task.getDevUsername(), task.getDuration());
        } else {
            System.out.println("No tasks found.");
        }
    }

    public static void searchTaskByName(String name) {
        tasks.stream()
            .filter(task -> task.getName().equalsIgnoreCase(name))
            .forEach(task -> System.out.printf("Task Name: %s, Developer: %s, Status: %s%n",
                task.getName(), task.getDevUsername(), task.getProgressStatus()));
    }

    public static void searchTasksByDeveloper(String devUsername) {
        tasks.stream()
            .filter(task -> task.getDevUsername().equalsIgnoreCase(devUsername))
            .forEach(task -> System.out.printf("Task Name: %s, Status: %s%n",
                task.getName(), task.getProgressStatus()));
    }

    public static void deleteTaskByName(String name) {
        tasks.removeIf(task -> task.getName().equalsIgnoreCase(name));
    }

    public static void displayAllTasksReport() {
        tasks.forEach(CredentialStorage::displayTaskDetails);
    }

    private static void displayTaskDetails(Task task) {
        System.out.printf("Developer: %s, Task Name: %s, Description: %s, Task ID: %d, Duration: %d, Status: %s%n",
            task.getDevUsername(), task.getName(), task.getDescription(), task.toString(), task.getDuration(), task.getProgressStatus());
    }
}
