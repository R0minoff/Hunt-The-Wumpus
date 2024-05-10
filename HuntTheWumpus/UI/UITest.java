// Mateen and Eyouel 
// February 12, 2024
// Period 5
// Hunt the Wumpus - User Interface Test Class

package UI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
import java.util.ArrayList;

public class UITest extends javax.swing.JFrame implements ActionListener {
    ///////////////////////
    // Properties & Fields
    //////////////////////

    
    ///////////////////////
    // Constructor(s)
    //////////////////////
    /*public UITest(){
        JFrame f=new JFrame("Button Test");  
        JButton b=new JButton("Click Here");  
        b.setBounds(50,100,95,30);  
        f.add(b);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
        
        
    }*/
      /*public UITest(){
    draw();
  }
  @SuppressWarnings("deprecation")
public void draw(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setSize(800,800);


  for(int x = 0; x <8; x++){
    //JButton you = new JButton("!");
    JFrame you = new JFrame("Jframe");
    you.setBounds(x*50,0,50,50);
    you.enable(false);
    you.setBackground( (x%2 == 0)? Color.GRAY: Color.DARK_GRAY);
    add(you);
  }
  for(int x = 0; x <8; x++){
    JButton you = new JButton("!");
    you.setBounds(x*50,50,50,50);
    you.enable(false);
    you.setBackground( (x%2 == 0)? Color.GRAY: Color.DARK_GRAY);
    add(you);
    }
   
    for(int x = 0; x <8; x++){
      JButton you = new JButton("!");
      you.setBounds(x*50,100,50,50);
      you.enable(false);
      you.setBackground( (x%2 == 0)? Color.GRAY: Color.DARK_GRAY);
      add(you);
      }

    setVisible(true);
  }*/
    public UITest(){
    draw();
        }

    ///////////////////////
    // Methods
    //////////////////////
    @SuppressWarnings("deprecation")
    public void draw(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setSize(800,800);


  for(int x = 0; x <8; x++){
    //JButton you = new JButton("!");
    JButton you = new JButton("Jframe");
    you.setBounds(x*50,0,50,50);
    you.enable(false);
    you.setBackground( (x%2 == 0)? Color.GRAY: Color.DARK_GRAY);
    add(you);
  }
  for(int x = 0; x <8; x++){
    JButton you = new JButton("!");
    you.setBounds(x*50,50,50,50);
    you.enable(false);
    you.setBackground( (x%2 == 0)? Color.GRAY: Color.DARK_GRAY);
    add(you);
    }
   
    for(int x = 0; x <8; x++){
      JButton you = new JButton("!");
      you.setBounds(x*50,100,50,50);
      you.enable(false);
      you.setBackground( (x%2 == 0)? Color.GRAY: Color.DARK_GRAY);
      add(you);
      }
      

    setVisible(true);
  }
    
     

    public static void main(String[] args)  {  
       UITest varUITest =  new UITest();
       varUITest.draw();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
