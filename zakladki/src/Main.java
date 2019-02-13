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
        JTextField nazwaNowejZakladki = new JTextField(7);
        panelTworzenia.add(nazwaNowejZakladki);
        JButton stworzZakladke = new JButton("Stwórz");
        panelTworzenia.add(stworzZakladke);

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
