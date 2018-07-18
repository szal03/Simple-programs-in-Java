
package ramka;
import javax.swing.*;
import java.awt.*; // awt - abstract window toolkit


public class Ramka extends JFrame 
{
    public Ramka()
    {
//      JFrame frame = new JFrame();  // prez konstruktor tez mozna nadac tytul ramki
//      frame.setTitle("Moja Ramka");
//      
//      frame.setSize(500,400);
//      
//      
//      frame.setLocation(500, 400);
//      
////      frame.setBounds(0, 0, 0, 0);
//
//        frame.setBackground(Color.BLUE);
//        
//        frame.setResizable(false);
//        
//
//      
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////      frame.setDefaultCloseOperation(3); // tezz exit (to samo co wyzej ) 
//      frame.setVisible(true);
        
        
        this.setBounds(500, 400, 500, 400);
        this.setDefaultCloseOperation(3);
        this.setTitle("ramka z rozszerzenia");
        
//        this.pack();
        
    }
   
    public static void main(String[] args)
    {
     new Ramka().setVisible(true);
    }
    
}
