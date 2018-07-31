
package ukladgraficzny;

import javax.swing.*;
import java.awt.*;

public class Ukladgraficzny extends JFrame
{
    
    public Ukladgraficzny()
    {
        super("Układ graficzny(Layout)");
        
        this.setBounds(300, 300, 500, 300);
        initComponents();
        this.pack();
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
        centrum = new JButton("centrum");
        
        gora = new JButton("jestem na gorze");
        
        dol = new JButton("jesteem na dole");
        
        prawo = new JButton("jestem po prawej");
        
        lewo = new JButton("jestem po lewej");
        
        Container kontener = this.getContentPane();
        
        kontener.add(centrum, BorderLayout.CENTER);
        kontener.add(gora,BorderLayout.PAGE_START);
        kontener.add(dol, BorderLayout.PAGE_END);
        kontener.add(prawo, BorderLayout.EAST);
        kontener.add(lewo,BorderLayout.WEST);
        
    }
    
    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawo;
    JButton lewo;
            
    
    public static void main(String[] args) 
    {
        new Ukladgraficzny().setVisible(true);
        
        
    }
    
}
