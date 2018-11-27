
package newpackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class dialog extends JDialog{
    
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    
    
    public dialog(JFrame parent)
    {
        super(parent, true);
        initComponents();
        
        int szer = (int)parent.getBounds().getWidth();
        int wys = (int)parent.getBounds().getHeight();
        
        
        int szerOkna = this.getSize().width;
        int wysOkna = this.getSize().height;
       
        this.setLocation(parent.getBounds().x+(szer-szerOkna)/2,parent.getBounds().y+(wys-wysOkna)/2);
    }
    public void  initComponents()
    {
        this.setTitle("To jest okno nr: " + (++i));
        this.setBounds(300,300,500,300);
   
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    JButton noweOkno = new JButton("Stwórz nowe okno");
   static int i = 0;
    
}
