package office.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

;

public class AddProduct extends JFrame {
    
    JButton sub,clr;

    AddProduct() {

        /*  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icn/user.JFIF"));
        Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(480, 50, 150, 150);
        add(image);
         */
        setSize(1000, 700);
        setLocation(650, 150);
        setLayout(null);

        JLabel heading = new JLabel("INWARD  MATERIAL");
        heading.setBounds(400, 45, 200, 30);
        heading.setFont(new Font("serif", Font.BOLD, 20));
        add(heading);
        
        JLabel name = new JLabel("KUSUM GROUPS");
        name.setBounds(380, 0, 300, 50);
        name.setFont(new Font("serif", Font.BOLD, 30));
        add(name);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icn/KFL.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 100, 50);
        add(image);

        JLabel date = new JLabel("DATE :");
        date.setBounds(130, 150, 200, 20);
        date.setFont(new Font("serif", Font.BOLD, 20));
        date.setForeground(Color.BLACK);
        add(date);

        JLabel pname = new JLabel("PRODUCT :");
        pname.setBounds(130, 200, 200, 20);
        pname.setFont(new Font("serif", Font.BOLD, 20));
        pname.setForeground(Color.BLACK);
        add(pname);
        
        JLabel party = new JLabel("PARTY :");
        party.setBounds(130, 250, 200, 20);
        party.setFont(new Font("serif", Font.BOLD, 20));
        party.setForeground(Color.BLACK);
        add(party);

        JLabel lcn = new JLabel("LOCATION :");
        lcn.setBounds(130, 300, 200, 20);
        lcn.setFont(new Font("serif", Font.BOLD, 20));
        lcn.setForeground(Color.BLACK);
        add(lcn);

        JLabel veh = new JLabel("VEHICLE NO :");
        veh.setBounds(130, 350, 200, 20);
        veh.setFont(new Font("serif", Font.BOLD, 20));
        veh.setForeground(Color.BLACK);
        add(veh);
        
        JLabel grade = new JLabel("GRADE :");
        grade.setBounds(130, 400, 200, 20);
        grade.setFont(new Font("serif", Font.BOLD, 20));
        grade.setForeground(Color.BLACK);
        add(grade);

        JLabel challan = new JLabel("CHALLAN :");
        challan.setBounds(570, 150, 200, 20);
        challan.setFont(new Font("serif", Font.BOLD, 20));
        challan.setForeground(Color.BLACK);
        add(challan);
        
        JLabel bag = new JLabel("NO OF BAG :");
        bag.setBounds(570, 200, 200, 20);
        bag.setFont(new Font("serif", Font.BOLD,20));
        bag.setForeground(Color.BLACK);
        add(bag);
        
        JLabel qty = new JLabel("QUANTITY (Kgs) :");
        qty.setBounds(570, 250, 200, 25);
        qty.setFont(new Font("serif", Font.BOLD,20));
        qty.setForeground(Color.BLACK);
        add(qty);
        
        JLabel cty = new JLabel("CITY :");
        cty.setBounds(570, 300, 200, 25);
        cty.setFont(new Font("serif", Font.BOLD,20));
        cty.setForeground(Color.BLACK);
        add(cty);
        
        JLabel invn = new JLabel("INVOICE NO :");
        invn.setBounds(570, 350, 200, 20);
        invn.setFont(new Font("serif", Font.BOLD,20));
        invn.setForeground(Color.BLACK);
        add(invn);
        
        JLabel invd = new JLabel("INVOICE DATE :");
        invd.setBounds(570, 400, 200, 20);
        invd.setFont(new Font("serif", Font.BOLD,20));
        invd.setForeground(Color.BLACK);
        add(invd);

        JTextField dt = new JTextField();
        dt.setBounds(300, 150, 150, 25);
        dt.setHorizontalAlignment(SwingConstants.CENTER);
        add(dt);

        String[] products = {"x", "y", "z", "a", "b", "c"};
        JComboBox<String> pro = new JComboBox<>(products);
        pro.setBounds(300, 200, 150, 25);
        pro.setSelectedIndex(-1); // No item selected by default
        add(pro);
        
        JTextField part = new JTextField();
        part.setBounds(300, 250, 150, 25);
        part.setHorizontalAlignment(SwingConstants.CENTER);
        add(part);
        
        JTextField loc = new JTextField();
        loc.setBounds(300, 300, 150, 25);
        loc.setHorizontalAlignment(SwingConstants.CENTER);
        add(loc);
        
        JTextField vhc = new JTextField();
        vhc.setBounds(300, 350, 150, 25);
        vhc.setHorizontalAlignment(SwingConstants.CENTER);
        add(vhc);
        
        JTextField grd = new JTextField();
        grd.setBounds(300, 400, 150, 25);
        grd.setHorizontalAlignment(SwingConstants.CENTER);
        add(grd);
        
        JTextField cha = new JTextField();
        cha.setBounds(750, 150, 150, 25);
        cha.setHorizontalAlignment(SwingConstants.CENTER);
        add(cha);        
        
        JTextField nobg = new JTextField();
        nobg.setBounds(750, 200, 150, 25);
        nobg.setHorizontalAlignment(SwingConstants.CENTER);
        add(nobg);
        
        JTextField qnty = new JTextField();
        qnty.setBounds(750, 250, 150, 25);
        qnty.setHorizontalAlignment(SwingConstants.CENTER);
        add(qnty);
        
        JTextField cit = new JTextField();
        cit.setBounds(750, 300, 150, 25);
        cit.setHorizontalAlignment(SwingConstants.CENTER);
        add(cit);
        
        JTextField invc = new JTextField();
        invc.setBounds(750, 350, 150, 25);
        invc.setHorizontalAlignment(SwingConstants.CENTER);
        add(invc);
        
        JTextField nvd = new JTextField();
        nvd.setBounds(750, 400, 150, 25);
        nvd.setHorizontalAlignment(SwingConstants.CENTER);
        add(nvd);
        
        
        sub = new JButton("Submit");
        sub.setBounds(380, 480, 100, 30);
        add(sub);
        
        clr = new JButton("Clear");
        clr.setBounds(520,480,100,30);
        add(clr);
       
 

        setVisible(true);
    }


    public static void main(String[] args) {
        new AddProduct();
    }

    private static class Public {

        public Public() {
        }
    }

}
