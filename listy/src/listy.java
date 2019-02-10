
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;


public class listy extends JFrame{
    public listy()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Menu Kontekstowe");
        this.setBounds(500,500,500,500);

        listaPrzedmiotow.setVisibleRowCount(3);
        listaPrzedmiotow.setFixedCellHeight(40);
        listaPrzedmiotow.setFixedCellWidth(300);
        listaPrzedmiotow.setBackground(Color.CYAN);
        listaPrzedmiotow.setSelectionBackground(Color.white);
        listaPrzedmiotow.setSelectionForeground(Color.lightGray);
        listaPrzedmiotow.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        listaPrzedmiotow.setLayoutOrientation(JList.VERTICAL);
        panelListy.add(scrollListy);

        listaPrzedmiotow.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("zmienilem sie "+(++i));
                if(e.getValueIsAdjusting())System.out.println("trzymam button myszy");
                else
                    System.out.println("puszczono button myszy");
                if(!e.getValueIsAdjusting())
                {
                    //Object wartosciWLiscie= ((JList)e.getSource()).getSelectedValue();
                    String zawartosc = (String)((JList)e.getSource()).getSelectedValue();

                    //String przedmioty = "";
                   //for(int i=0;i<wartosciWLiscie.length;i++) {
                      // przedmioty += (String) wartosciWLiscie[i];
                   //}

                    System.out.println(zawartosc);
                    //System.out.println(przedmioty);
                    komunikat.setText("lubie: "+zawartosc);
                }
            }
        });
        panelKomunikatu.add(komunikat);
        this.getContentPane().add(panelListy, BorderLayout.NORTH);
        this.getContentPane().add(panelKomunikatu, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private int i=0;
    private JList listaPrzedmiotow = new JList(new String[]{"matematyka","fizyka","informatyka","biologia","chemia","wf","wos","po","historia"});
    private JScrollPane scrollListy = new JScrollPane(listaPrzedmiotow);
    private JPanel panelListy = new JPanel();
    private JPanel panelKomunikatu = new JPanel();
    private JLabel komunikat = new JLabel();
    public static void main(String[] args)
    {
        new listy().setVisible(true);
    }
}
