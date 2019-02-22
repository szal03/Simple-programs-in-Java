import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inS;
        OutputStream outS;

        Reader reader;
        File plik = new File("nazwa_pliku.txt");
       // Writer writer = new BufferedWriter(new FileWriter(plik));
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik)));


        ((BufferedWriter)writer).write("lala");

        ((BufferedWriter)writer).newLine();
        ((BufferedWriter)writer).write("następna linia");

        ((BufferedWriter)writer).close();
    }
    void nazwaF(InputStream inS)
    {

    }
}
