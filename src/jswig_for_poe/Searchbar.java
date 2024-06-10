/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jswig_for_poe;

/**
 *
 * @author Reyaan
 */
import javax.swing.*;

public class Searchbar extends JFrame {

    public Searchbar() {
        initComponents();
    }

    private void initComponents() {
        JLabel searchbarLabel = new JLabel("Search and Manage Tasks");
        JButton doneTasksButton = new JButton("View Done Tasks");
        JButton longestTaskButton = new JButton("View Longest Task");
        JButton searchTaskButton = new JButton("Search Task by Name");
        JButton searchDeveloperButton = new JButton("Search Tasks by Developer");
        JButton deleteTaskButton = new JButton("Delete Task by Name");
        JButton reportButton = new JButton("View All Tasks Report");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        doneTasksButton.addActionListener(evt -> Tasks.displayDoneTasks());
        longestTaskButton.addActionListener(evt -> Tasks.displayLongestTask());
        searchTaskButton.addActionListener(evt -> searchTaskByName());
        searchDeveloperButton.addActionListener(evt -> searchTasksByDeveloper());
        deleteTaskButton.addActionListener(evt -> deleteTaskByName());
        reportButton.addActionListener(evt -> Tasks.displayAllTasksReport());

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

        pack();
    }

    private void searchTaskByName() {
        String name = JOptionPane.showInputDialog(this, "Enter task name:");
        if (name != null && !name.trim().isEmpty()) {
            Tasks.searchTaskByName(name);
        }
    }

    private void searchTasksByDeveloper() {
        String devUsername = JOptionPane.showInputDialog(this, "Enter developer username:");
        if (devUsername != null && !devUsername.trim().isEmpty()) {
            Tasks.searchTasksByDeveloper(devUsername);
        }
    }

    private void deleteTaskByName() {
        String name = JOptionPane.showInputDialog(this, "Enter task name to delete:");
        if (name != null && !name.trim().isEmpty()) {
            Tasks.deleteTaskByName(name);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Searchbar().setVisible(true));
    }
}
