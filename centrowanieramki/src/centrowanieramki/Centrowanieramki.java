
package centrowanieramki;

import javax.swing.*;
import java.awt.*;


public class Centrowanieramki extends JFrame
{
    public Centrowanieramki()
    {
        int szerokosc = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wysokosc = Toolkit.getDefaultToolkit().getScreenSize().height;
        
        System.out.println(szerokosc);
        System.out.println(wysokosc);
        
        this.setSize(szerokosc/2,wysokosc/2);
        
//        this.setLocation(szerokosc/2,400);
        

        int szerokoscRamki = this.getSize().width;
        int wysokoscRamki = this.getSize().height;
        
        
        this.setLocation((szerokosc-szerokoscRamki)/2,(wysokosc-wysokoscRamki)/2); // zawsze wysrodkuje ramke
        
        this.setDefaultCloseOperation(3);
    }
 
    public static void main(String[] args)
    {
        new Centrowanieramki().setVisible(true);
        
        
    }
    
}
