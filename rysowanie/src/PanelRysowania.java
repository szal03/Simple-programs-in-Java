import javax.swing.*;
import java.awt.*;

public class PanelRysowania extends JPanel {
    public PanelRysowania()
    {
        super();

        this.add(new JButton("button1"){
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);

            }

        });

    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("napis",0,40);
        g.drawImage(new ImageIcon("kot.jpg").getImage(), 40,80,null);

        g.drawRect(50,50,50,50);

        g.drawLine(80,80,100,100);

    }
    public static int i = 0;
}
