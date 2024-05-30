/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jswig_for_poe;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Reyaan
 */
public class WelcomePage extends javax.swing.JFrame {

    public WelcomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        tasks = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jTextField1.setText("E");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tasks.setText("Add Tasks");
        tasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonPressed(evt);
            }
        });

        jLabel1.setText("Welcome to EasyKanban");

        report.setText("Show Report");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReportButtonClicked(evt);
            }
        });

        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);
        jList1.getAccessibleContext().setAccessibleName("task_list");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(quit)
                        .addGap(72, 72, 72)
                        .addComponent(report)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(tasks)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129))))
            .addComponent(jTextField2)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tasks)
                    .addComponent(report)
                    .addComponent(quit))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //For the field to show the username that was entered
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        //jTextField2.setText(CredentialStorage.logged_username);
    }//GEN-LAST:event_jTextField2ActionPerformed

    //this is for the quit button
    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        close();
    }//GEN-LAST:event_quitActionPerformed

    //For the report button to show the message
    private void showReportButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReportButtonClicked
        //JOptionPane.showMessageDialog(WelcomePage.this, "Coming Soon");
        refreshTaskList();
        System.out.println("Tasks added: " + Tasks.tasks.size());
        for (Task t : Tasks.tasks) {
            System.out.println(t.toString());
        }
    }//GEN-LAST:event_showReportButtonClicked

    private void addTaskButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonPressed
        // TODO add your handling
        String taskName = showPopup("Task Input", "Enter the task name:", "No task name entered or dialog was cancelled.");

        if (taskName != null) {
            System.out.println("Task name entered:" + taskName);
            String taskDescription = showPopup("Task Input", "Enter the task description:", "No task description entered or dialog was cancelled.");

            if (taskDescription != null) {
                System.out.println("Task description entered:" + taskDescription);

                String taskDuration = showPopup("Task Input", "Enter the task duration:", "No task duration entered or dialog was cancelled.");

                int duration = 0;
                try {
                    duration = Integer.parseInt(taskDuration);
                }catch(NumberFormatException e) {
                    System.out.println("The duration provided could not be parsed into an integer");
                    return;
                }
                
                if (taskDuration != null) {
                    String taskStatus = showProgressSelector();

                    if (taskStatus != null) {
                        Tasks.add_new_task(taskName, taskDescription, duration, taskStatus);
                        refreshTaskList();
                    }
                }
            }
        }
    }//GEN-LAST:event_addTaskButtonPressed

    String showPopup(String title, String body, String error) {
        String str = JOptionPane.showInputDialog(null, body, title, JOptionPane.QUESTION_MESSAGE);
        if (str != null && !str.trim().isEmpty()) {
            return str;
        } else {
            System.out.println(error);
            return null;
        }
    }

    String showProgressSelector() {
        String[] statuses = {"To Do", "Doing", "Done"};
        String taskStatus = (String) JOptionPane.showInputDialog(null, "Select task Status:", "Task Status", JOptionPane.QUESTION_MESSAGE, null,
                statuses, statuses[0]);
        return taskStatus;
    }

    void refreshTaskList() {
        this.jList1.removeAll();
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Task t : Tasks.tasks) {
            model.addElement(t.toString());
        }
        this.jList1.setModel(model);
    }

    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        Tasks.tasks = new ArrayList<>();

        // TODO: Remove when we fix the login screen
        CredentialStorage.logged_username = "asd_";

        java.awt.EventQueue.invokeLater(() -> {
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true);
            wp.refreshTaskList();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton quit;
    private javax.swing.JButton report;
    private javax.swing.JButton tasks;
    // End of variables declaration//GEN-END:variables
}
