import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        Towar[] towar = new Towar[3];

        towar[0]= new Towar();
        towar[1] = new Towar(29, "Java");
        towar[2]=new Towar(39,"C#",2008,2,11);
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("baza.txt"));



            writer.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
