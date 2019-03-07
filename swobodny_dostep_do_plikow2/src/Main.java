

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Towar[] towar = new Towar[3];

        towar[0] = new Towar();
        towar[1] = new Towar(29.0, "Java");
        towar[2] = new Towar(39.0, "C++", 2009, 11, 21);

        try
        {
            RandomAccessFile RAF = new RandomAccessFile("baza.txt", "rw");

            Towar.zapiszDoPliku(towar, RAF);
            RAF.seek(0);

            Towar[] towarki = Towar.odczytajZPliku(RAF);

            for (int i = 0; i < towarki.length; i++)
            {
                System.out.println(towarki[i].pobierzCene());
                System.out.println(towarki[i].pobierzNazwe());
                System.out.println(towarki[i].pobierzDate());
                System.out.println("-----------------------");
            }

          /* int n = 2;
           RAF.seek((n-1)*Towar.DLUGOSC_REKORDU);

           Towar a = new Towar();
           a.czytajDane(RAF);

           System.out.println(a);
           */
            try
            {
                Towar b = new Towar();

                b.czytajRekord(RAF, 3);
                System.out.println(b);

                System.out.println("lala");
            }
            catch(BrakRekordu err)
            {
                System.out.println(err.getMessage());
            }
            RAF.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
