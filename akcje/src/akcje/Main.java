package akcje;

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
    JMenuItem podMenuNowy = menuPlik.add(new JMenuItem("Nowy"));
    
    podMenuNowy.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Tu jest kod ktory tworzy nowy plik");
        }
    });
    menuPlik.addSeparator();
    final JMenuItem podMenuZapisz = menuPlik.add(new JMenuItem("zapisz"));
    //
    podMenuZapisz.setEnabled(false);
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
               podMenuZapisz.setEnabled(true);
           }
        }
    });
    
    menuOpcje.add(new JMenuItem("Opcja 1"));
    menuOpcje.add(new JMenuItem("Opcja 2"));
    
     menuOpcje.add(tylkoDoOdczytu);
    
    JMenu menuPomoc = pasekMenu.add(new JMenu("pomoc"));
    menuPomoc.add(new JMenuItem("FAQ"));
    
    obszarTekstowy.addKeyListener(new KeyAdapter() {
    
        public void keyTyped(KeyEvent e){
         if(tylkoDoOdczytu.isSelected()) e.consume();
        }
        public void keyPressed(KeyEvent e) {
        
        }
        
        
    });
     
    
    this.getContentPane().setLayout(new GridLayout(2,1));
    this.getContentPane().add(obszarTekstowy);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem tylkoDoOdczytu= new JCheckBoxMenuItem("Tylko do odczytu");
    private JTextArea obszarTekstowy = new JTextArea();
    
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}
