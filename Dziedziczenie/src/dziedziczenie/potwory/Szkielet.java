
package dziedziczenie.potwory;


public class Szkielet extends Potwor
{
    String typBroni;
 public Szkielet()
 {
     System.out.println("Domyslny konstruktor z szkieleta");
 }
 public Szkielet(double predkoscChodzenia, double HP, String typBroni)
 {
     super(predkoscChodzenia, HP);
     this.typBroni = typBroni;
      System.out.println("NIE Domyslny konstruktor z szkieleta");
 }
 
 
}
