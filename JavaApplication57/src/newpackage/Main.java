package newpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame{
    
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    
    
    public Main()
    {
        initComponents();
    }
    public void  initComponents()
    {
        this.setTitle("Aplikacja z wieloma oknami");
        this.setBounds(500,500,500,500);
        this.getContentPane().add(noweOkno);
        noweOkno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new dialog(toOkno).setVisible(true);
            }
        });
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private JFrame toOkno = this;
    private JButton noweOkno = new JButton("Stwórz nowe okno");
   
}
