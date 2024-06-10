/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

/**
 *
 * @author Reyaan
 */
public class Task {
    String dev_username;
    String name;
    String description;
    int number;
    int duration;
    String progressStatus;

    //this is for the transfer of data so that the other classes will be able to find it aswell
    Task(String dev_username, String name, String description, int number, int duration, String progressStatus) {
        this.dev_username = dev_username;
        this.name = name;
        this.description = description;
        this.number = number;
        this.duration = duration;
        this.progressStatus = progressStatus;
    }
    
    public String getTaskDetails(){
        return "Task id: " + this.createTaskID() + ", name: " + this.name + ", description: " + this.description + ", number: " + this.number + ", duration: " + this.duration + ", status: " + this.progressStatus;
    }
    
    @Override
    public String toString(){
        return this.getTaskDetails();
    }
    
    public boolean checkTaskDescription() {
        return this.description.length() <= 50;
    }
    
    public String createTaskID(){
        return this.name.toUpperCase().substring(0, 2) + ":" + this.number + ":" + this.dev_username.toUpperCase().substring(this.dev_username.length() - 3);
    }
    
    public String getDevUsername() {
        return dev_username;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public String getProgressStatus() {
        return progressStatus;
    }
    
}
