import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame {
    public Main(){
        this.setTitle("Animacja obrazka");
        this.setBounds(400,400,400,400);
        panelAnimacji.setBackground(Color.darkGray);
        JButton bStart = (JButton)panelButtonow.add(new JButton("Start"));

        this.getContentPane().add(panelButtonow, BorderLayout.SOUTH);

        bStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startAnimation();
            }
        });
        this.getContentPane().add(panelAnimacji);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void startAnimation()
    {
        panelAnimacji.dodajObrazek();
    }
    private JPanel panelButtonow = new JPanel();
    private PanelAnimacji panelAnimacji = new PanelAnimacji();
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    class PanelAnimacji extends JPanel
    {
        public void dodajObrazek()
        {
            listaObrazkow.add(new Obrazek());
            for(int i=0; i<5000; i++)
            {
                for(int j=0;j<listaObrazkow.size();j++)
                {
                    ((Obrazek) listaObrazkow.get(j)).ruchObrazka(this);


                    this.paint(this.getGraphics());
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            for(int i=0; i<listaObrazkow.size();i++)
            {
                g.drawImage(Obrazek.getImg(), ((Obrazek)listaObrazkow.get(i)).x,((Obrazek)listaObrazkow.get(i)).y,null);
            }
        }
        ArrayList listaObrazkow = new ArrayList();
    }

}
class Obrazek
{
    public static Image getImg()
    {
        return Obrazek.obraz;
    }
    public void ruchObrazka(JPanel pojemnik)
    {
        Rectangle granicePanelu = pojemnik.getBounds();

        x+=dx;
        y+=dy;

        if(y+yObrazka>=granicePanelu.getMaxY())
        {
            y=(int)(granicePanelu.getMaxY()-yObrazka);
            dy=-dy;
        }
        if(x+xObrazka>=granicePanelu.getMaxX())
        {
            x=(int)(granicePanelu.getMaxX()-xObrazka);
            dx=-dx;
        }

        if(y<=granicePanelu.getMinY())
        {
            y=(int)(granicePanelu.getMinY());
            dy=-dy;
        }
        if(x<=granicePanelu.getMinX())
        {
            x=(int)(granicePanelu.getMinX());
            dx=-dx;
        }





    }
    public static Image obraz = new ImageIcon("kot.jpg").getImage();

    int x=0;
    int y=0;
    int dx = 1;
    int dy =1;
    int xObrazka = obraz.getWidth(null);
    int yObrazka= obraz.getHeight(null);
}
