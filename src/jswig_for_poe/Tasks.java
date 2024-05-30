/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

import java.util.ArrayList;

/**
 *
 * @author life
 */
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
    
    public static void clearTasks(){
        tasks.clear();
        last_id = 1;
    }
    
    public static int returnTotalHours(){
        int total = 0;
        for (Task t: Tasks.tasks) {
            total += t.duration;
        }
        return total;
    }
}
