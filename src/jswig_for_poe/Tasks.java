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
    public static ArrayList<Task> tasks;
    static int last_id = 0;
    
    public static void add_new_task(String name, String description, int duration, String progressStatus) {
        int number = last_id;
        last_id++;
        
        String dev_username = CredentialStorage.logged_username;
        String id = name.substring(0, 2) + ":" + number + ":" + dev_username.substring(dev_username.length() - 3);
        
        Task task = new Task(id, name, description, number, duration, progressStatus);
        
        tasks.add(task);
    }
}
