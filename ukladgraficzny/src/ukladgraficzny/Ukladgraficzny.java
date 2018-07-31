
package ukladgraficzny;

import javax.swing.*;
import java.awt.*;

public class Ukladgraficzny extends JFrame
{
    
    public Ukladgraficzny()
    {
        super("Układ graficzny(Layout)");
        this.setBounds(300, 320, 300, 200);
        
        initComponents();
        
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
        przycisk1 = new JButton("Hej!");
        
        Container kontener = this.getContentPane();
        
        kontener.add(przycisk1);
    }
    
    JButton przycisk1;
    
    public static void main(String[] args) 
    {
        new Ukladgraficzny().setVisible(true);
        
        
    }
    
}
