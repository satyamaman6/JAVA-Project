package office.management.system;

import javax.swing.*;
import java.awt.*;



public class Splash extends JFrame implements Runnable {
    
    Thread t;
   
    
    Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icn/tech.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1); /*after import of Java.awt now i can directlly pass image */
        add(image);
             
       t = new Thread(this);
       t.start(); /*This will call my run method which i have created below*/
                     
                 
       setVisible(true);
       int x = 1;
       for(int i = 0; i <=650; i+=100,x+=1){
       setTitle("RSPC Office Management");
       setSize(i+x,i+x);
       setLocation(900-(i/2),600-(i/2));
       
       try{
           Thread.sleep(10);
       }catch (Exception e){}
    }     
    }
    
    public void run(){ /* if i want to run then at starting i need to call start method that will call run method */
    try{
        Thread.sleep(2000);
        setVisible(false);
        
        //Next Frame
        new Login();
        
        
    
    }catch(Exception e){
    }
    
    }
   public static void main(String[] args) {
        Splash s = new Splash();
        
    }
    
}
