
package klasy;

public class Klasy
{

 
    public static void main(String[] args)
    {
   
        
        Monitor abc = new Monitor();
        abc.szerokosc = 124;
        Monitor abc2 = new Monitor();
        abc2.szerokosc=230;
        
        System.out.println(abc.szerokosc);
        System.out.println(abc2.szerokosc);
        
        abc.Wlacz();
        abc.Wylacz();
        
        // konstruktory
        //new Punkt();
        
        Punkt p = new Punkt(40,50);
        Punkt p2=new Punkt(30,155);
     
        
        System.out.println("p.x " + p.x);
        System.out.println("p.y " + p.y);
        
         System.out.println("p2.x " + p2.x);
        System.out.println("p2.y " + p2.y);
        
    }
    
}

class Monitor
{
    int szerokosc;
    int wysokosc;
    
    void Wlacz()
    {
        System.out.println("Monitor jest wlaczony");
    }
    void Wylacz()
    {
        System.out.println("Monitor jest wylaczony");
    }
          
}

class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konstruktor domyślny");
    }
    Punkt(int wspolrzedna1, int wspolrzedna2)
    {
        System.out.println("Wywołano konstruktor z dwoma zmiennymi");
          x=wspolrzedna1;
          y=wspolrzedna2;
    }
    int x;
    int y;
}