/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

/**
 *
 * @author Reyaan
 */

import java.awt.event.ActionEvent;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.junit.Test;

//this is  atry catch for when a error is thrown it will parse it and continue with the program
public class TasksTest {
    Object getField(Object object, String name) {
        try {
            Field tasksField = object.getClass().getDeclaredField(name);
            tasksField.setAccessible(true);
            return tasksField.get(object);
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException ex) {
            Logger.getLogger(TasksTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

//These are the test or when the unit tests are done with the given names and task requirements
    void enterTestData(){
        Tasks.clearTasks();
        Tasks.add_new_task("Login feature", "Robyn Harrison", "Create Login to authenticate users", 8, "To Do");
        Tasks.add_new_task("Add Task Feature", "Mike Smith", "Create Add Task feature to add task  users", 10, "Doing");
    }
    
    //From here this is the tasks will be tested with the spefic values given with the assigment
    //This tests how much tasks will be made
    @Test
    public void testAddNewTask() {
        enterTestData();
        
        assert(Tasks.tasks.size() == 2);
    }
    
    //This is will test the description length that will be captured
    @Test
    public void testDescriptionLength() {
        Task short_enough = new Task("", "", "Task successfully captured", 0, 0, "");
        assert(short_enough.checkTaskDescription());
            
        Task too_long = new Task("", "", "Please enter a task description of less than 50 characters", 0, 0, "");
        assert(!too_long.checkTaskDescription());
    }
    
    //This is testing the ID generation
    @Test
    public void testIDGeneration() {
        enterTestData();
        
        String[] expected = {
            "LO:1:SON",
            "AD:2:ITH"
        };
        
        for(int i = 0; i < Tasks.tasks.size(); i++){
            Task t = Tasks.tasks.get(i);
            String exp = expected[i];
            System.out.println(t.createTaskID()+" == " + exp);
            assert(t.createTaskID().equals(exp));
        }
    }
    
    //Testing the total hours of all the tasks made
    @Test
    public void testTotalHours() {
        enterTestData();
        assert(Tasks.returnTotalHours() == 18);
        
        Tasks.clearTasks();
        
        Tasks.add_new_task("", "", "", 10, "");
        Tasks.add_new_task("", "", "", 12, "");
        Tasks.add_new_task("", "", "", 55, "");
        Tasks.add_new_task("", "", "", 11, "");
        Tasks.add_new_task("", "", "", 1, "");
        
        assert(Tasks.returnTotalHours() == 89);
    }
}
