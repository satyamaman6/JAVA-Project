package office.management.system;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Selectfile {

    public static void main(String[] args) {
        // Create a new JFrame to hold the file chooser
        JFrame frame = new JFrame("Excel File Chooser Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 400);
        frame.setLocation(720, 170);
        frame.setLayout(null); // Disable layout manager for absolute positioning
        
        // Create the "Insert File" button
        JButton insertFileButton = new JButton("Insert File");
        insertFileButton.setBounds(100, 100, 200, 30); // Set position and size (x, y, width, height)
        insertFileButton.setBackground(new Color(33, 120, 190)); // Blue background
        insertFileButton.setForeground(Color.WHITE); // White text
        insertFileButton.setFocusPainted(false); // Remove focus border
        insertFileButton.setFont(new Font("Arial", Font.BOLD, 10)); // Font style and size
        
        // Create the "Submit" button
        JButton submitButton = new JButton("SUBMIT");
        submitButton.setBounds(150, 150, 100, 30); // Set position and size
        submitButton.setBackground(Color.GRAY); // Gray background
        submitButton.setForeground(Color.WHITE); // White text
        submitButton.setFocusPainted(false); // Remove focus border
        submitButton.setFont(new Font("Arial", Font.BOLD, 14)); // Font style and size
        
        // Add ActionListener to "Insert File" button
        insertFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a file chooser
                JFileChooser fileChooser = new JFileChooser();
                
                // Set file filter for Excel files (.xls, .xlsx)
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files", "xls", "xlsx");
                fileChooser.setFileFilter(filter);
                
                // Set the directory to the user's home folder or any other directory you want
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                
                // Open the file chooser dialog and capture the user's selection
                int result = fileChooser.showOpenDialog(frame);
                
                // Check if a file was selected
                if (result == JFileChooser.APPROVE_OPTION) {
                    // Get the selected file
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());

                    // Optional: Open the selected file (if supported)
                    if (Desktop.isDesktopSupported()) {
                        try {
                            Desktop.getDesktop().open(selectedFile);
                            // Here you can add the logic to insert that file into SQL.
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        });
        
        // Add the buttons to the frame
        frame.add(insertFileButton);
        frame.add(submitButton);
        
        // Display the frame
        frame.setVisible(true);
    }
}
