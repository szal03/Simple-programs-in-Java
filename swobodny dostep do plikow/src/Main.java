import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        Towar[] towar = new Towar[3];

        towar[0]= new Towar();
        towar[1] = new Towar(29, "Java");
        towar[2]=new Towar(39,"C#",2008,2,11);
        try{
            /*
            DataOutputStream outS = new DataOutputStream(new FileOutputStream("nowy.txt"));


            outS.writeDouble(1234.234);
            outS.close();

            DataInputStream inS = new DataInputStream(new FileInputStream("nowy.txt"));
            System.out.println(inS.readDouble());
            inS.close(); */

            RandomAccessFile RAF = new RandomAccessFile("nowy.txt", "rw"); // swobodny dostęp do pliku

            RAF.writeDouble(123.42);
            RAF.writeDouble(41.23);
            RAF.writeChars("cos ");

            System.out.println(RAF.getFilePointer());

            RAF.seek(16);

            System.out.println(RAF.readChar());

            RAF.close();


        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
