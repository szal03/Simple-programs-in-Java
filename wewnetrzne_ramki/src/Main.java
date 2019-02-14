import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import java.awt.*;
import  java.awt.event.*;

public class Main extends JFrame {

    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Wewnętrzne ramki");
        this.setBounds(300,300,300,300);


        JInternalFrame wewnetrznaRamka = new JInternalFrame("ramkowy tytul",true,true, true, true);

        wewnetrznaRamka.add(new JButton("test"), BorderLayout.NORTH);

        wewnetrznaRamka.setVisible(true);
        wewnetrznaRamka.pack();
        desktopPane.add(wewnetrznaRamka);

        JInternalFrame wewnetrznaRamka2 = new JInternalFrame("ramkowy tytul",true,true, true, true);
        wewnetrznaRamka2.add(new JLabel("test2"), BorderLayout.NORTH);

        wewnetrznaRamka2.setVisible(true);
        wewnetrznaRamka2.pack();
        desktopPane.add(wewnetrznaRamka2);
        wewnetrznaRamka.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);


        wewnetrznaRamka.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                System.out.println("otwarte");
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                System.out.println("zamkniety");
                String odp=JOptionPane.showInternalInputDialog(e.getInternalFrame(),"Wpisz wyjscie by wyjsc z programu lub zamknij by zamknąć tylko ramke");
                if(odp!=null)
                {
                    if(odp.equals("wyjscie"))
                    {
                        System.exit(0);
                    }
                    else if(odp.equals("zamknij"))
                    {
                        e.getInternalFrame().dispose();
                    }

                }

            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                System.out.println("zamkniecie");
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                System.out.println("zikonizowany");
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                System.out.println("maxymalizacja");
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                System.out.println("aktywny");
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                System.out.println("dezaktywowany");
            }
        });
        this.getContentPane().add(desktopPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private JDesktopPane desktopPane = new JDesktopPane();
    public static void main(String[] args){

        new Main().setVisible(true);
    }

}
