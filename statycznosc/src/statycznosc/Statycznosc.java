
package statycznosc;


public class Statycznosc
{
    public static void main(String[] args)
    {
           //Matematyka test = new Matematyka();
           
//           double wynik=Matematyka.suma(8, 10.5);
//           
//           System.out.println(wynik);
//           System.out.println(Matematyka.PI);
        
        
        Klient a = new Klient("Arek");
        Klient b = new Klient("Karol");
        Klient c = new Klient("Ola");
        
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }
    
}
class Matematyka
{
    static final double PI = 3.14;
    static double suma(double a, double b)
    {
        return a+b;
    }
}
class Klient
{
    Klient(String imie)
    {
        this.imie=imie;
        nastepnyId++;
        id=nastepnyId;
    }
    String imie;
    int id = 0;
    static int nastepnyId=0;
}