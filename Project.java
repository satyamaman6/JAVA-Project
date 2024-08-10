package office.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(500, 500);
        setLocation(700, 150);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icn/img.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 150, 150);
        add(image);

        JMenuBar mb = new JMenuBar();

        // CREATING HEADER1 WITH SUBHEADER
        JMenu newInformation = new JMenu("DEPARTMENTS");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);

        JMenu rawinput = new JMenu("ROW INPUT"); // Changed to JMenu to allow sub-options
        rawinput.setBackground(Color.PINK);

        // Create sub-options for rawinput
        JMenuItem optionA = new JMenuItem("Batch Processing");
        optionA.setBackground(Color.PINK);
        optionA.addActionListener(this); // Add ActionListener to Batch Processing

        JMenuItem optionB = new JMenuItem("Single Entry");
        optionB.setBackground(Color.PINK);

        // Add sub-options to rawinput
        rawinput.add(optionA);
        rawinput.add(optionB);

        JMenuItem production = new JMenuItem("PRODUCTION");
        production.setBackground(Color.WHITE);

        JMenuItem printing = new JMenuItem("PRINTING");
        printing.setBackground(Color.PINK);

        JMenuItem dispatch = new JMenuItem("DISPATCH");
        dispatch.setBackground(Color.WHITE);
        newInformation.add(rawinput);
        newInformation.add(production);
        newInformation.add(printing);
        newInformation.add(dispatch);

        // CREATING HEADER2 WITH SUBHEADER   
        JMenu user = new JMenu("EXPLORE");
        user.setForeground(Color.RED);
        mb.add(user);

        JMenuItem nuser = new JMenuItem("NEW USER");
        nuser.setBackground(Color.PINK);

        JMenuItem exisit = new JMenuItem("EXISITNG USER");
        exisit.setBackground(Color.WHITE);
        user.add(nuser);
        user.add(exisit);

        // CREATING HEADER3 WITH SUBHEADER   
        JMenu repo = new JMenu("REPORT");
        repo.setForeground(Color.BLUE);
        mb.add(repo);

        JMenuItem prepo = new JMenuItem("PRINTING REPORT");
        prepo.setBackground(Color.PINK);

        JMenuItem npreport = new JMenuItem("NON-PRINTING REPORT");
        npreport.setBackground(Color.WHITE);
        repo.add(prepo);
        repo.add(npreport);

        // CREATING HEADER4 WITH SUBHEADER 
        JMenu product = new JMenu("NEW PRODUCT");
        product.setForeground(Color.BLUE);
        mb.add(product);

        JMenuItem nproduct = new JMenuItem("RAW Material");
        nproduct.setBackground(Color.PINK);

        JMenuItem pm = new JMenuItem("PRODUCTION");
        pm.setBackground(Color.WHITE);
        product.add(nproduct);
        product.add(pm);

        // UTILITY
        JMenu utility = new JMenu("UTILITY");
        utility.setForeground(Color.RED);
        mb.add(utility);

        JMenuItem notepad = new JMenuItem("NOTEPAD");
        notepad.addActionListener(this);
        notepad.setBackground(Color.WHITE);

        JMenuItem calcy = new JMenuItem("CALCULATOR");
        calcy.addActionListener(this);
        calcy.setBackground(Color.PINK);
        utility.add(notepad);
        utility.add(calcy);

        // EXIT
        JMenu ext = new JMenu("EXIT");
        ext.setForeground(Color.BLUE);
        ext.addActionListener(this);
        mb.add(ext);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        ext.add(ex);

        setJMenuBar(mb);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("CALCULATOR")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (msg.equals("NOTEPAD")) {
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (msg.equals("Batch Processing")) {
            // Call Selectfile class and show file chooser
            Selectfile selectfile = new Selectfile();
            selectfile.main(new String[]{});
        }
    }

    public static void main(String[] args) {
        new Project();
    }
}
