package sliders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;



public class Main extends JFrame {
    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Suwaki");
        this.setBounds(300,300,500,500);
        wartoscSuwaka.setEditable(false);
        
        
        suwak.setMajorTickSpacing(5);
        suwak.setMinorTickSpacing(1);
        suwak.setPaintTicks(true);
        suwak.setPaintLabels(true);
        
        
    
               
        this.getContentPane().add(suwak, BorderLayout.NORTH);
        this.getContentPane().add(wartoscSuwaka, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    JSlider suwak = new JSlider(JSlider.HORIZONTAL, 0, 10, 5);
    
    JTextField wartoscSuwaka = new JTextField(" " + suwak.getValue());
    
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}
