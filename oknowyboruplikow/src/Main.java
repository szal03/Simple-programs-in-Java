import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Main extends JFrame
{

    public Main()
    {
        this.setBounds(250, 300, 500, 300);

        this.setTitle("okno wyboru plików");


        final JFileChooser wyborPlikow = new JFileChooser();
        wyborPlikow.setCurrentDirectory(new File(System.getProperty("user.dir")));

        wyborPlikow.setMultiSelectionEnabled(true); // mozna wybrac wiecej plikow

       // wyborPlikow.setAcceptAllFileFilterUsed(true); // mozliwosc wybrania wszystkich plikow

        wyborPlikow.setFileFilter(new FiltrRozszerzen("Pola tekstowe", ROZSZERZENIA_TEKSTOWE));
        wyborPlikow.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f)
            {
                return f.isDirectory();
            }

            @Override
            public String getDescription()
            {
                return "Katalogi";
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              int tmp =  wyborPlikow.showOpenDialog(rootPane);
              if(tmp == 0)
              {
                  //System.out.println("0");
                  stworzPlikZip(wyborPlikow.getSelectedFiles());

              }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // wyborPlikow.showSaveDialog(rootPane);
                wyborPlikow.showDialog(rootPane, "Zip in that place");

            }
        });

        this.panelButton.add(button1);
        this.panelButton.add(button2);
        this.getContentPane().add(panelButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private JPanel panelButton = new JPanel();
    private JButton button1 = new JButton("otwórz");
    private JButton button2 = new JButton("zapisz");
    private final String[] ROZSZERZENIA_TEKSTOWE = new String[]{".txt", ".xml",".doc"};

    public void stworzPlikZip(File[] pliki)
    {
        for(int i=0; i<pliki.length; i++)
        {
            System.out.println(pliki[i].getPath());
        }
    }

    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    private class FiltrRozszerzen extends FileFilter
    {

        public FiltrRozszerzen(String opis, String[] roszerzenia)
        {
            this.opis=opis;
            this.rozszerzenia=roszerzenia;
        }

        @Override
        public boolean accept(File f) {
           // return f.isDirectory();
            for(int i=0; i<this.rozszerzenia.length; i++) {
                if(f.getName().toLowerCase().endsWith(this.rozszerzenia[i]) || f.isDirectory())
                return true;
            }
            return false;
        }

        @Override
        public String getDescription() {
            return opis;
        }

        private String opis;
        private String[] rozszerzenia;
    }
}
