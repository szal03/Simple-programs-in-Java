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
        this.setTitle("Pasek narzedzi");
        this.setBounds(500,500,500,500);
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na zielony", new ImageIcon("zielony.gif"), Color.GREEN)));
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na niebieski", new ImageIcon("niebieski.gif"), Color.BLUE)));
        pasekNarzedzi.add(new KolorowyButton(new ActionColor("Zmieniam kolor na czerwony", new ImageIcon("czerwony.gif"), Color.RED)));
        pasekNarzedzi.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                aktywny = null;
            }
        });

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(aktywny!=null)
                panel.setBackground((Color)aktywny.getAction().getValue("kolor"));
            }
        });
        this.getContentPane().add(panel);
        this.getContentPane().setLayout(new GridLayout(2,1));
        this.getContentPane().add(pasekNarzedzi);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JToolBar pasekNarzedzi = new JToolBar("Nazwa Nowej Ramki");
    private JButton button = new JButton("wylacz malowanie");
    private JPanel panel = new JPanel();
    private KolorowyButton aktywny = null;



    private class ActionColor extends AbstractAction{

        public ActionColor(String toolTip, Icon icon, Color colour)
        {
            this.putValue(Action.SHORT_DESCRIPTION,toolTip);
            this.putValue(Action.SMALL_ICON,icon);
            this.putValue("kolor",colour);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            aktywny = (KolorowyButton) e.getSource();
        }
    }
    private class KolorowyButton extends JButton{


        public KolorowyButton(final ActionColor actionColor) {
            super(actionColor);
            this.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    for(int i=0;i<pasekNarzedzi.getComponentCount();i++)
                    {
                        if(pasekNarzedzi.getComponent(i) instanceof KolorowyButton) {
                            KolorowyButton tmp = (KolorowyButton) pasekNarzedzi.getComponent(i);
                            tmp.setBackground(Color.WHITE);
                            tmp.setZaznaczony(false);
                            //rootPane.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                            panel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                        }
                    }
                    ten.setBackground((Color)actionColor.getValue("kolor"));
                    ten.setZaznaczony(true);
                }
            });
        }
        KolorowyButton ten = this;
        boolean zaznaczony = false;
        public void setZaznaczony(boolean zaznacz)
        {
            this.zaznaczony = zaznacz;
        }
    }
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}
