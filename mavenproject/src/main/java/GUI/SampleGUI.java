/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;


/**
 *
 * @author jeslinpjames
 */
public class SampleGUI extends JFrame{
//    JFrame myframe;
    
    JPanel myPanel; 
    JButton myButton;
    public SampleGUI(){
        this.setTitle("Welcome");
        this.setSize(300,300);
        this.setLocation(900,500);
//        this.setBounds(300,300,900,500);

        myButton = new JButton("Click Me");
        myButton.setBounds(120,120,100,30);
        
        myPanel = new JPanel();
        myPanel.setLayout(null);
        myPanel.add(myButton);
        this.add(myPanel);
        this.setVisible(true);
        }
    public static void main(String args[]){
       new SampleGUI();
    }
}
