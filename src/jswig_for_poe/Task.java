/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

/**
 * The Task class represents a task with a developer username, task name, description,
 * task number, duration, and progress status. It provides methods to get task details,
 * check the task description length, and create a unique task ID.
 * 
 * Author: Reyaan
 */
public class Task {
    String dev_username; // Developer username associated with the task
    String name; // Task name
    String description; // Task description
    int number; // Task number (ID)
    int duration; // Duration of the task in hours
    String progressStatus; // Progress status of the task (e.g., "To Do", "Doing", "Done")

    // Constructor to initialize the task object
    Task(String dev_username, String name, String description, int number, int duration, String progressStatus) {
        this.dev_username = dev_username;
        this.name = name;
        this.description = description;
        this.number = number;
        this.duration = duration;
        this.progressStatus = progressStatus;
    }
    
    // Method to get the task details as a formatted string
    public String getTaskDetails() {
        return "Task id: " + this.createTaskID() + ", name: " + this.name + ", description: " + this.description + ", number: " + this.number + ", duration: " + this.duration + ", status: " + this.progressStatus;
    }
    
    // Override the toString method to return task details
    @Override
    public String toString() {
        return this.getTaskDetails();
    }
    
    // Method to check if the task description length is within the limit (50 characters)
    public boolean checkTaskDescription() {
        return this.description.length() <= 50;
    }
    
    // Method to create a unique task ID based on task name, number, and developer username
    public String createTaskID() {
        return this.name.toUpperCase().substring(0, 2) + ":" + this.number + ":" + this.dev_username.toUpperCase().substring(this.dev_username.length() - 3);
    }
    
    // Getter method for developer username
    public String getDevUsername() {
        return dev_username;
    }

    // Getter method for task name
    public String getName() {
        return name;
    }

    // Getter method for task description
    public String getDescription() {
        return description;
    }

    // Getter method for task duration
    public int getDuration() {
        return duration;
    }

    // Getter method for task progress status
    public String getProgressStatus() {
        return progressStatus;
    }
    
}//end of class
