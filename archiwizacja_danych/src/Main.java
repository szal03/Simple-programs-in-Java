
import java.io.*;
import java.util.zip.*;

public class Main {


    public static  final int BUFFOR = 1024;

    public static void main(String[] args)
    {
        String[] tab = new String[]{"plik1.txt", "plik2.txt","plik3.txt"};
        byte tmpDate[] = new byte[BUFFOR];
        try {
            ZipOutputStream zOutS = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("nazwa_mojego_zipa.zip"), BUFFOR));
            for(int i =0; i <tab.length; i++)
            {
                        BufferedInputStream inS = new BufferedInputStream(new FileInputStream(tab[i]), BUFFOR);

                        zOutS.putNextEntry(new ZipEntry(tab[i])); //początek

                        int counter; // liczy ile bajtow do bufora
                        while ((counter = inS.read(tmpDate, 0, BUFFOR)) != -1) // WCZYTUJEMY ZA KAŻDYM RAZEM   do buffora z pliku do kiedy to nie bedzie koniec strumienia
                        {
                            zOutS.write(tmpDate, 0, counter); // do ile jest bajtow w nastepnym buforze
                        }

                        zOutS.closeEntry();//koniec
                        inS.close(); // zamykamy strumienie
            }
            zOutS.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
