package zdarzeniaokna;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame implements WindowListener{
    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Pola wyboru");
        this.setBounds(500,500,500,500);
        
        this.addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent we) {
                 JOptionPane.showMessageDialog(rootPane,"wiatj :)" );
    }
        });
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent we) 
    {
       JOptionPane.showMessageDialog(rootPane,"wiatj :)" );
    }

    @Override
    public void windowClosing(WindowEvent we) 
    {
       int opcja = JOptionPane.showConfirmDialog(rootPane,"czy napewno chcesz zamknąć okno? ;(");
       if(opcja ==0) this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Zapisujemy dane na dysku");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Jestem minimalizowany");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
       System.out.println("Jestem maxymalizowany");
    }

    @Override
    public void windowActivated(WindowEvent we) {
         System.out.println("Jestem aktywny");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
         System.out.println("Jestem nieaktywny");
    }
    
    
}
