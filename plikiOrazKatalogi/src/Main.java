import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        try {
            File katalog = new File("strona"+File.separator+"php"+File.separator+"mysql");
            katalog.mkdirs();

            File plik2 = new File("strona"+File.separator+"php"+File.separator+"mysql", "strona1.txt");
            if(!plik2.exists())
            {
                plik2.createNewFile();
            }
            File plik = new File("test.txt");
            if (!plik.exists()) {
                plik.createNewFile();
            }
            System.out.println("sciezka do pliku");
            System.out.println(plik.getAbsolutePath()); // absolutna,doslowna
            System.out.println(plik.getCanonicalPath());//kanoniczna,zawsze prawdziwa
            System.out.println("-------");

            System.out.println("Czy moge pisać? :"+plik.canWrite());
            System.out.println("Czy moge wykonać?"+plik.canExecute());
            System.out.println("Czy moge czytac? :"+plik.canRead());
            System.out.println("Czy jest ukryty :"+plik.isHidden());
            System.out.println("Czy jest plikiem :"+plik.isFile());
            System.out.println("ostatnia modyfikacja :"+new Date(plik.lastModified()));
            System.out.println("Długość pliku w bajtach(ilość znaków):"+plik.length());

           // plik.list();

           // plik.delete();
            System.out.println("-------");
            Main.wypiszWszystkieSciezki(new File(System.getProperty("user.dir")));
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
       // System.out.println(System.getProperty("user.dir"));
    }
    public static void wypiszWszystkieSciezki(File nazwaSciezki)
    {
        String[] nazwyPlikowIKatalogow=nazwaSciezki.list();
        System.out.println(nazwaSciezki.getPath());
        for(int i=0;i<nazwyPlikowIKatalogow.length;i++)
        {
            File p = new File(nazwaSciezki.getPath(),nazwyPlikowIKatalogow[i]);
            System.out.println(p.getPath());
            if(p.isDirectory())
            {
                wypiszWszystkieSciezki(new File(p.getPath()));
            }
        }
    }
}
