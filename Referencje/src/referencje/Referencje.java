
package referencje;

public class Referencje {

    
    public static void main(String[] args)
    {
     int a = 53;
     int b=a;
     
     b=30;
     System.out.println(a);
        
     Test x = new Test(); //w x nie znajduje sie zadna wartosc zmienna tylko adres
     
     Test y = x;
     
     y.a=40;
     
        System.out.println(x.a);
        
        String imie = "Koala"; // string jest specjalny
        String imie2=imie;
        
        imie2="nie Koala";
        
        System.out.println(imie2);
    }
    
}
class Test
{
    int a = 20;
}