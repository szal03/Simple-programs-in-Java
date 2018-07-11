
package agregacja;


public class Agregacja {

  
    public static void main(String[] args) 
    {
       Pracownik p = new Pracownik("Krzysztof", new Adres("Długa",30));
       Pracownik a = new Pracownik("Jakub", new Adres("Krótka",35));
       Pracownik b = new Pracownik("Adam", new Adres("Morska",309));
       Pracownik c = new Pracownik("Andrzej", new Adres("Ciemna",15));
       Pracownik d = new Pracownik("Jan", new Adres("Twarda",90));
       
        System.out.println(p);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
class Pracownik
{
    String imie;
    Adres adres;

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return this.imie + ": " + adres.ulica + " " + adres.nrDomu;
    }
    
   
    
}
class Adres
{
    String ulica;
    int nrDomu;

    public Adres(String ulica, int nrDomu) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
    }
    
    

}