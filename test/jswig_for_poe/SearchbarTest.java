/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

/**
 *
 * @author Reyaan
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import jswig_for_poe.Tasks;

public class SearchbarTest {
    
    @Before
    public void setUp() {
        Tasks.clearTasks();
        Tasks.add_new_task("Create Login", "Mike Smith", "Login functionality", 5, "To Do");
        Tasks.add_new_task("Create Add Features", "Edward Harrison", "Add new features", 8, "Doing");
        Tasks.add_new_task("Create Reports", "Samantha Paulson", "Reports generation", 2, "Done");
        Tasks.add_new_task("Add Arrays", "Glenda Oberholzer", "Array functionality", 11, "To Do");
    }

    @Test
    public void testDisplayDoneTasks() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.displayDoneTasks();
        
        String expectedOutput = "Developer: Samantha Paulson, Task Name: Create Reports, Duration: 2\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testDisplayLongestTask() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.displayLongestTask();
        
        String expectedOutput = "Developer: Glenda Oberholzer, Duration: 11\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testSearchTaskByName() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.searchTaskByName("Create Login");
        
        String expectedOutput = "Task Name: Create Login, Developer: Mike Smith, Status: To Do\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testSearchTasksByDeveloper() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.searchTasksByDeveloper("Edward Harrison");
        
        String expectedOutput = "Task Name: Create Add Features, Status: Doing\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testDeleteTaskByName() {
        Tasks.deleteTaskByName("Create Login");
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.displayAllTasksReport();
        
        String expectedOutput = "Developer: Edward Harrison, Task Name: Create Add Features, Description: Add new features, Task ID: 2, Duration: 8, Status: Doing\n" +
                                "Developer: Samantha Paulson, Task Name: Create Reports, Description: Reports generation, Task ID: 3, Duration: 2, Status: Done\n" +
                                "Developer: Glenda Oberholzer, Task Name: Add Arrays, Description: Array functionality, Task ID: 4, Duration: 11, Status: To Do\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testDisplayAllTasksReport() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        Tasks.displayAllTasksReport();
        
        String expectedOutput = "Developer: Mike Smith, Task Name: Create Login, Description: Login functionality, Task ID: 1, Duration: 5, Status: To Do\n" +
                                "Developer: Edward Harrison, Task Name: Create Add Features, Description: Add new features, Task ID: 2, Duration: 8, Status: Doing\n" +
                                "Developer: Samantha Paulson, Task Name: Create Reports, Description: Reports generation, Task ID: 3, Duration: 2, Status: Done\n" +
                                "Developer: Glenda Oberholzer, Task Name: Add Arrays, Description: Array functionality, Task ID: 4, Duration: 11, Status: To Do\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
