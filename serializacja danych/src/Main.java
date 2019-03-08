

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Towar[] towar = new Towar[3];

        towar[0] = new Towar();
        towar[1] = new Towar(29.0, "Video Kurs Java");
        towar[2] = new Towar(39.0, "Video Kurs C++", 2008, 11, 21);


        try
        {
            ObjectOutputStream outS = new ObjectOutputStream(new FileOutputStream("baza1.txt"));

            outS.writeObject(towar);

            outS.close();

            ObjectInputStream inS = new ObjectInputStream(new FileInputStream("baza1.txt"));

            Towar[] a = (Towar[])inS.readObject();

            for (int i = 0 ; i < a.length; i++)
                System.out.println(a[i].pobierzNazwe());

            inS.close();

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }


    }
}
