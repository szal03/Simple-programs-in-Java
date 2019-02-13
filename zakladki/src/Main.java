import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame{
    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Zakładki");
        this.setBounds(300,300,300,300);

    }
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }


}
