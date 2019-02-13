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

        JPanel panel = new JPanel();
        panel.add(new JButton("test"));

        zakladki.addTab("tab1",new JLabel("to jest pierwszy"));
        zakladki.setMnemonicAt(0,KeyEvent.VK_T); //alt+t -> przeniesie do pierwszej zakladki


        zakladki.addTab("to jest drugi tab",new ImageIcon("ikonka.jpg"), panel,"tip");

        zakladki.addTab("zakladka3",panelTworzenia);
        panelTworzenia.add(new JLabel("Stwórz plik o nazwie: "));
        final JTextField nazwaNowejZakladki = new JTextField(7);
        panelTworzenia.add(nazwaNowejZakladki);
        JButton stworzZakladke = new JButton("Stwórz");
        panelTworzenia.add(stworzZakladke);

        stworzZakladke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JPanel panelTextowy = new JPanel();
                panelTextowy.setLayout(new GridLayout(1,1));
                JTextArea obszarTekstowy = new JTextArea();
                panelTextowy.add(new JScrollPane(obszarTekstowy));
                zakladki.addTab(nazwaNowejZakladki.getText()+".txt",panelTextowy);
                zakladki.setSelectedIndex(zakladki.getTabCount()-1);

                obszarTekstowy.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(!(tytulZakladki+e.getKeyChar()).equals(przedZmianaObszaruTekstowego) && czyToAscii(e.getKeyChar()) && flagaZapisu)
                        {
                            przedZmianaObszaruTekstowego=tytulZakladki+e.getKeyChar();
                            zakladki.setTitleAt(indexZakladki,tytulZakladki+"*");
                            flagaZapisu = false;
                        }
                        else if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S && !flagaZapisu)
                        {
                            zakladki.setTitleAt(indexZakladki, tytulZakladki);
                            System.out.println("Zapisujemy");
                            flagaZapisu = true;
                        }

                    }
                    private boolean czyToAscii(char zn)
                    {
                        for(int i=0; i<255; i++)
                        {
                            if(zn==i)
                            {
                                return true;
                            }

                        }
                        return false;
                    }
                    String przedZmianaObszaruTekstowego="";
                    int indexZakladki = zakladki.getSelectedIndex();
                    String tytulZakladki = zakladki.getTitleAt(indexZakladki);
                    boolean flagaZapisu = true;
                });
            }
        });
        zakladki.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        this.getContentPane().add(zakladki);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JTabbedPane zakladki = new JTabbedPane();

    private JPanel panelTworzenia = new JPanel();

    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }


}
