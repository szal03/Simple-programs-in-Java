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

        JButton bUsun = (JButton)panelButtonow.add(new JButton("Usun"));
        bUsun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopAnimation();
            }
        });


        this.getContentPane().add(panelAnimacji);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void startAnimation()
    {
        panelAnimacji.dodajObrazek();
    }
    public void stopAnimation()
    {
        panelAnimacji.stop();
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
             watek = new Thread(grupaWatkow, new ObrazekRunnable((Obrazek) listaObrazkow.get(listaObrazkow.size()-1)));
            watek.start();

            grupaWatkow.list();


        }
        public void stop()
        {
           grupaWatkow.interrupt();
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
        JPanel ten = this;
        Thread watek;
        ThreadGroup grupaWatkow = new ThreadGroup("Grupa kotkow");

        public class ObrazekRunnable implements Runnable
        {
            public ObrazekRunnable(Obrazek obrazek)
            {
                this.obrazek = obrazek;
            }
            @Override
            public void run()
            {
                try {


                    while (!Thread.currentThread().isInterrupted())
                        {
                         this.obrazek.ruchObrazka(ten);
                         repaint();
                            Thread.sleep(1);
                         }
                    }
                    catch(InterruptedException e)
                    {
                     System.out.println(e.getMessage());
                     listaObrazkow.clear();
                     repaint();
                    }
            }
            Obrazek obrazek;
        }
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
