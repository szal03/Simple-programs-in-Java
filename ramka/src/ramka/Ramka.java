
package ramka;
import javax.swing.*;
import java.awt.*; // awt - abstract window toolkit


public class Ramka 
{
    public Ramka()
    {
      JFrame frame = new JFrame();  
      frame.setTitle("Moja Ramka");
      
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.setDefaultCloseOperation(3); // tezz exit (to samo co wyzej ) 
      frame.setVisible(true);
    }
   
    public static void main(String[] args)
    {
     new Ramka();
    }
    
}
