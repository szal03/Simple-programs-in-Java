
package flowlayout;
import javax.swing.*;
import java.awt.*;

public class Flowlayout extends JFrame
{

    public Flowlayout()
    {
        this.setBounds(500,300,400,500);
        
        initComponents();
        
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents()
    {
//        Container kontener = getContentPane();
       
        
        
        button1.setPreferredSize(new Dimension(100,100));
        button2.setPreferredSize(button2.getPreferredSize());
        
        panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        this.getContentPane().add(panel1, BorderLayout.PAGE_START);
        
    }
    
    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEADING));
    
    JButton button1 = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");
    JButton button4 = new JButton("Button4");
    
    
    public static void main(String[] args) 
    {
        new Flowlayout().setVisible(true);
        
        
    }
    
}
