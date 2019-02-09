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
        this.setTitle("Menu Kontekstowe");
        this.setBounds(500,500,500,500);
        final JPopupMenu menuKontekstowe= new JPopupMenu();
        menuKontekstowe.add(new JMenuItem(new AbstractAction("Zamknij") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }));
        menuKontekstowe.add(new JMenuItem("Kopiuj"));
        menuKontekstowe.add(new JMenuItem("Wklej"));
        menuKontekstowe.add(new JMenuItem("cos zrob xd"));

        this.getContentPane().add(testowy, BorderLayout.SOUTH);
        testowy.addMouseListener(new MouseAdapter() {


            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("zwolnienie");
                if(e.getClickCount()==3 && e.getButton()==MouseEvent.BUTTON1)   //ile razy ktos cos kliknol
                {
                    JOptionPane.showMessageDialog(rootPane,"klikles 3 razy lewym przyciskiem myszy");
                }
                if(e.isPopupTrigger())
                {
                    menuKontekstowe.show(e.getComponent(),e.getX(),e.getY());
                }
            }


        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private JButton testowy=new JButton("test");
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}
