/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

/**
 * The SearchbarTest class tests the functionalities of the Tasks class, ensuring proper task management operations.
 * 
 * Author: Reyaan
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SearchbarTest {
    
    // Set up the test environment by clearing and adding initial tasks
    @Before
    public void setUp() {
        Tasks.clearTasks();
        Tasks.add_new_task("Create Login", "Mike Smith", "Login functionality", 5, "To Do");
        Tasks.add_new_task("Create Add Features", "Edward Harrison", "Add new features", 8, "Doing");
        Tasks.add_new_task("Create Reports", "Samantha Paulson", "Reports generation", 2, "Done");
        Tasks.add_new_task("Add Arrays", "Glenda Oberholzer", "Array functionality", 11, "To Do");
    }

    // Test displaying tasks that are done
    @Test
    public void testDisplayDoneTasks() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.displayDoneTasks();
        
        String expectedOutput = "Developer: Samantha Paulson, Task Name: Create Reports, Duration: 2\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test displaying the task with the longest duration
    @Test
    public void testDisplayLongestTask() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.displayLongestTask();
        
        String expectedOutput = "Developer: Glenda Oberholzer, Duration: 11\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test searching for a task by name
    @Test
    public void testSearchTaskByName() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.searchTaskByName("Create Login");
        
        String expectedOutput = "Task Name: Create Login, Developer: Mike Smith, Status: To Do\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test searching for tasks by developer username
    @Test
    public void testSearchTasksByDeveloper() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.searchTasksByDeveloper("Edward Harrison");
        
        String expectedOutput = "Task Name: Create Add Features, Status: Doing\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test deleting a task by name
    @Test
    public void testDeleteTaskByName() {
        Tasks.deleteTaskByName("Create Login");
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.displayAllTasksReport();
        
        String expectedOutput = """
                                Developer: Edward Harrison, Task Name: Create Add Features, Description: Add new features, Task ID: 2, Duration: 8, Status: Doing
                                Developer: Samantha Paulson, Task Name: Create Reports, Description: Reports generation, Task ID: 3, Duration: 2, Status: Done
                                Developer: Glenda Oberholzer, Task Name: Add Arrays, Description: Array functionality, Task ID: 4, Duration: 11, Status: To Do
                                """;
        assertEquals(expectedOutput, outContent.toString());
    }

    // Test displaying a report of all tasks
    @Test
    public void testDisplayAllTasksReport() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.displayAllTasksReport();
        
        String expectedOutput = """
                                Developer: Mike Smith, Task Name: Create Login, Description: Login functionality, Task ID: 1, Duration: 5, Status: To Do
                                Developer: Edward Harrison, Task Name: Create Add Features, Description: Add new features, Task ID: 2, Duration: 8, Status: Doing
                                Developer: Samantha Paulson, Task Name: Create Reports, Description: Reports generation, Task ID: 3, Duration: 2, Status: Done
                                Developer: Glenda Oberholzer, Task Name: Add Arrays, Description: Array functionality, Task ID: 4, Duration: 11, Status: To Do
                                """;
        assertEquals(expectedOutput, outContent.toString());
    }
}
