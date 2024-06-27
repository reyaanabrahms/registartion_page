/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

/**
 * The Search bar class is a JFrame that provides a GUI for searching and managing tasks.
 * It includes buttons for viewing done tasks, the longest task, searching tasks by name or developer,
 * deleting tasks by name, and viewing all tasks in a report.
 * 
 * @author Reyaan
 */

import javax.swing.*;

public class Searchbar extends JFrame {

    // Constructor to initialize components
    public Searchbar() {
        initComponents();
    }

    // Method to initialize GUI components
    private void initComponents() {
        // Create labels and buttons
        JLabel searchbarLabel = new JLabel("Search and Manage Tasks");
        JButton doneTasksButton = new JButton("View Done Tasks");
        JButton longestTaskButton = new JButton("View Longest Task");
        JButton searchTaskButton = new JButton("Search Task by Name");
        JButton searchDeveloperButton = new JButton("Search Tasks by Developer");
        JButton deleteTaskButton = new JButton("Delete Task by Name");
        JButton reportButton = new JButton("View All Tasks Report");

        // Set the default close operation for the JFrame
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        // Add action listeners for each button to handle button clicks
        doneTasksButton.addActionListener(evt -> Tasks.displayDoneTasks());
        longestTaskButton.addActionListener(evt -> Tasks.displayLongestTask());
        searchTaskButton.addActionListener(evt -> searchTaskByName());
        searchDeveloperButton.addActionListener(evt -> searchTasksByDeveloper());
        deleteTaskButton.addActionListener(evt -> deleteTaskByName());
        reportButton.addActionListener(evt -> Tasks.displayAllTasksReport());

        // Define the layout of the components within the JFrame
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(searchbarLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(doneTasksButton)
                                .addComponent(longestTaskButton))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(searchTaskButton)
                                .addComponent(searchDeveloperButton))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(deleteTaskButton)
                                .addComponent(reportButton))))
                    .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(searchbarLabel)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(doneTasksButton)
                        .addComponent(searchTaskButton)
                        .addComponent(deleteTaskButton))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(longestTaskButton)
                        .addComponent(searchDeveloperButton)
                        .addComponent(reportButton))
                    .addContainerGap(20, Short.MAX_VALUE))
        );

        pack(); // Adjusts the frame to fit the preferred sizes of its components
    }

    // Method to search for a task by name
    private void searchTaskByName() {
        String name = JOptionPane.showInputDialog(this, "Enter task name:");
        if (name != null && !name.trim().isEmpty()) {
            Tasks.searchTaskByName(name);
        }
    }

    // Method to search for tasks by developer username
    private void searchTasksByDeveloper() {
        String devUsername = JOptionPane.showInputDialog(this, "Enter developer username:");
        if (devUsername != null && !devUsername.trim().isEmpty()) {
            Tasks.searchTasksByDeveloper(devUsername);
        }
    }

    // Method to delete a task by name
    private void deleteTaskByName() {
        String name = JOptionPane.showInputDialog(this, "Enter task name to delete:");
        if (name != null && !name.trim().isEmpty()) {
            Tasks.deleteTaskByName(name);
        }
    }

    // Main method to run the application
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Searchbar().setVisible(true));
    }
}
