
package dziedziczenie.potwory;

public class Zombie extends Potwor
{
     public Zombie()
     {
         System.out.println("Domyślny konstruktor z klasy zombiego");
     }
     public Zombie(double predkoscChodzenia, double HP)
     {
         super(predkoscChodzenia, HP);
         System.out.println("NIE Domyslny konstruktor z zombiego");
     }
}
