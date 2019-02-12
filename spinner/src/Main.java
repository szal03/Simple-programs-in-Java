import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormatSymbols;


public class Main extends JFrame{
    public Main()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Spinners");
        this.setBounds(500,500,500,500);

        String[] miesiace= new DateFormatSymbols().getMonths();



        SpinnerListModel modelMiesiecy = new SpinnerListModel(miesiace);

        JSpinner spinner = new JSpinner(modelMiesiecy);
       // spinner.setEditor(new JTextArea("lalal"));


        SpinnerNumberModel modelLiczb = new SpinnerNumberModel(1,1,5,2);

        JSpinner spinner2 = new JSpinner(modelLiczb);

        

        SpinnerDateModel modelDat = new SpinnerDateModel();
        JSpinner spinner3 = new JSpinner(modelDat);

        JPanel panel = new JPanel();
        panel.add(spinner);
        panel.add(spinner2);
        panel.add(spinner3);
        this.getContentPane().add(panel,BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }


}
