import java.io.*;
import java.util.zip.*;

public class Main {


    public static int BUFFOR = 1024;

    public static void main(String[] args)
    {
        File katalog = new File(System.getProperty("user.dir")+File.separator+"nazwa_mojego_zipa");
        ZipEntry wpis = null;
        byte tmpData[]  = new byte[1024];
        try{
            if(!katalog.exists())
                katalog.mkdir();

            ZipInputStream zInS = new ZipInputStream(new BufferedInputStream(new FileInputStream("nazwa_mojego_zipa.zip"),BUFFOR));

           // zInS.getNextEntry();
            while((wpis = zInS.getNextEntry())!=null)
            {
                BufferedOutputStream fOutS = new BufferedOutputStream(new FileOutputStream(katalog+File.separator+wpis.getName()), BUFFOR);

                int counter;
                while((counter = zInS.read(tmpData,0,BUFFOR))!=-1)
                {
                    fOutS.write(tmpData,0,counter);
                }

                fOutS.close();
                zInS.closeEntry();

            }

            zInS.close();

        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }


    }

}
