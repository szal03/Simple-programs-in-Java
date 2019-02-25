import java.io.*;

public class Main {
    public static void main(String[] args)
    {
        try {
            PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt")); // kiedy "true" jest drugim parametrem
            // to z każdym otwarciem programu - on dopisuje do tego co tam było


            drukarz.println(1234);
           // drukarz.flush(); // zapisanie wszystkiego co jest w buforze

            drukarz.close(); // zawsze zamykaj strumień

            drukarz = new PrintWriter(new FileWriter("dane.txt",true));
            drukarz.append("dopisek");
            drukarz.println();

            drukarz.printf("On ma %d kg oraz %.2f %s  wzrostu", 50, 165.4, "centymetrow");

            drukarz.close();


            BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));

            //System.out.println((char)reader.read());
            //System.out.println(reader.readLine());
          //  System.out.println(reader.readLine());
          //  System.out.println(reader.readLine());
          //  System.out.println(reader.readLine());


            BufferedWriter writer = new BufferedWriter(new FileWriter("baza.txt"));

            String tresc="";
            while((tresc=reader.readLine()) != null)
            {
                //System.out.println(tresc);
                writer.write(tresc);
                writer.newLine();
            }
            writer.close();
            reader.close();

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        //Main.test(1,2,3,"cos","cos2");


    }
    static void test(Object... a)
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
