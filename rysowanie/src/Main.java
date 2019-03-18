import javax.swing.*;

public class Main extends JFrame
{
    public Main()
    {
        this.setTitle("Rysowanie");
        this.setBounds(400,400,400,400);

        this.getContentPane().add(panelDoRysowania);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
    private PanelRysowania panelDoRysowania = new PanelRysowania();
}
