package listykombinowane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Listykombinowane extends JFrame 
{
    public Listykombinowane()
    {
          initComponents();      
    }
    
    public void initComponents()
    {
        this.setTitle("Listy kombinowane");
        this.setBounds(500,500,500,500);
        
        kombinacja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("cos");  
                ColorHandler handler = (ColorHandler)((JComboBox)ae.getSource()).getSelectedItem();
                ((JComboBox)ae.getSource()).setBackground(handler.getColor());
                //System.out.println(((JComboBox)ae.getSource()).getSelectedItem());
                        //kombinacja.getSelectedItem()
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        panel1.add(kombinacja);
        
        
        kombinacja.addItem(new ColorHandler("Niebieski", Color.BLUE));
        kombinacja.addItem(new ColorHandler("Czerwony", Color.RED));
        kombinacja.addItem(new ColorHandler("Rozowy", Color.PINK));
        kombinacja.addItem(new ColorHandler("Zolty", Color.YELLOW));
        kombinacja.addItem(new ColorHandler("Bialy", Color.WHITE));
        kombinacja.addItem(new ColorHandler("Czarny", Color.BLACK));
        
       // kombinacja.addItem("Czarny");
       // kombinacja.addItem(new String("Czarny")); ewentualnie tak jak wyżej
       //kombinacja.addItem("Zielony");
        
        this.getContentPane().add(panel1);
        this.setDefaultCloseOperation(3);
    }
    
    
    private class ColorHandler
    {
        public ColorHandler(String colorName, Color kolor)
        {
            this.kolor = kolor;
            this.colorName = colorName;
        }
        
        @Override
        public String toString()
        {
            return this.colorName;
        }
        public Color getColor()
        {
            return this.kolor;
        }
        private Color kolor;
        private String colorName;
    }
    private JPanel panel1 = new JPanel();
   private JComboBox kombinacja = new JComboBox();
    
    
    public static void main(String[] args) 
    {
       new Listykombinowane().setVisible(true);
    }

  
    
}
