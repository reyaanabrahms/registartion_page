/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

/**
 *
 * @author life
 */
public class Task {
    String id;
    String name;
    String description;
    int number;
    int duration;
    String progressStatus;

    Task(String id, String name, String description, int number, int duration, String progressStatus) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.number = number;
        this.duration = duration;
        this.progressStatus = progressStatus;
    }

    public String get_id() {
        return this.id;
    }

    public String get_name() {
        return this.name;
    }

    public String get_description() {
        return this.description;
    }

    public int get_number() {
        return this.number;
    }

    public int get_duration() {
        return this.duration;
    }
    
    public String get_progressStatus() {
        return this.progressStatus;
    }
    
    @Override
    public String toString(){
        return "Task id: " + this.get_id() + ", name: " + this.get_name() + ", description: " + this.get_description() + ", number: " + this.get_number() + ", duration: " + this.get_duration() + ", status: " + this.get_progressStatus();
    }
}
