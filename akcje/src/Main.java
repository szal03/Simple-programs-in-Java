import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main extends JFrame
{
    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Pasek menu");
        this.setBounds(300,300,500,500);


        this.setJMenuBar(pasekMenu);

        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
        menuPlik.setMnemonic('P');


        JMenuItem podMenuNowy = menuPlik.add(new JMenuItem("Nowy"));

        podMenuNowy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Tu jest kod ktory tworzy nowy plik");
            }
        });
        menuPlik.addSeparator();
        Action actionSave = new ActionSave("Zapisz");
        //final JMenuItem podMenuZapisz = menuPlik.add(new JMenuItem("zapisz"));
        final JMenuItem podMenuZapisz = menuPlik.add(actionSave);
        //
        podMenuZapisz.setEnabled(false);

        podMenuZapisz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Zapisujemy na dysku");
                podMenuZapisz.setEnabled(flagaObszaruTekstowego=false);
            }
        });
        podMenuZapisz.setToolTipText("Zapisanie pliku na dysku");
        podMenuZapisz.setMnemonic('Z');
        podMenuZapisz.setAccelerator(KeyStroke.getKeyStroke("Ctrl S"));
        //
        menuPlik.add(new JMenuItem("wczytaj"));
        menuPlik.addSeparator();

        JMenu menuOpcje = new JMenu("Opcje");
        menuPlik.add(menuOpcje);
        tylkoDoOdczytu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(tylkoDoOdczytu.isSelected())
                {
                    podMenuZapisz.setEnabled(false);
                }
                else
                {
                    podMenuZapisz.setEnabled(flagaObszaruTekstowego);
                }
            }
        });

        menuOpcje.add(new JMenuItem("Opcja 1"));
        menuOpcje.add(new JMenuItem("Opcja 2"));

        menuOpcje.add(tylkoDoOdczytu);

        JMenu menuPomoc = pasekMenu.add(new JMenu("pomoc"));
        menuPomoc.add(new JMenuItem("FAQ"));

        obszarTekstowy.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(tylkoDoOdczytu.isSelected()) e.consume();

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(tylkoDoOdczytu.isSelected())
                {
                    e.consume();
                }
                else if(!(obszarTekstowy.getText()+e.getKeyChar()).equals(przedZmianaObszaruTekstowego) && czyTOAscii(e.getKeyChar()))
                {
                    przedZmianaObszaruTekstowego=obszarTekstowy.getText()+e.getKeyChar();
                    podMenuZapisz.setEnabled(flagaObszaruTekstowego=true);
                }
                System.out.println(obszarTekstowy.getText() + e.getKeyChar());

            }


        });

        this.getContentPane().setLayout(new GridLayout(2,1));
        this.getContentPane().add(obszarTekstowy);
        this.getContentPane().add(buttonZapisz);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem tylkoDoOdczytu= new JCheckBoxMenuItem("Tylko do odczytu");
    private JRadioButtonMenuItem radio;
    private JTextArea obszarTekstowy = new JTextArea();
    private boolean flagaObszaruTekstowego = false;
    private String przedZmianaObszaruTekstowego="";
    private JButton buttonZapisz = new JButton("Zapisz");

    private class ActionSave extends AbstractAction
    {
        public ActionSave(String nazwa)
        {
            this.putValue(Action.NAME, nazwa);
        }
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Zapisujemy na dysku");
            this.setEnabled(flagaObszaruTekstowego=false);
        }
    }
    private boolean czyTOAscii(char zn)
    {
        for (int i=0; i<255; i++)
        {
            if(zn == i) return  true;

        }


        return false;
    }
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}