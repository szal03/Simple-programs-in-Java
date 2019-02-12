import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame{
    public Main()
    {

    }
    public void initComponents()
    {
        this.setTitle("Spinners");
        this.setBounds(300,300,300,200);




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }


}
