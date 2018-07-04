
package istanceof;


public class IstanceOf {

  
    public static void main(String[] args) 
    {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Janek","Kowalski",900);
        osoba[1] = new Student("Szary","Student");
        
//        osoba[0].pobierzOpis();
//        osoba[1].pobierzOpis();

        for(int i =0; i<osoba.length; i++)
        {
            if(osoba[i] instanceof Osoba) //instanceof sprawdza czy to jest egzemplarzem Osoba
            osoba[i].pobierzOpis();
            else
                break; 
        }
        //ulepszony for
        for(Osoba person: osoba)
        {
            if(person instanceof Osoba)
            {
                person.pobierzOpis();
            }
            else
                break;
        }
    }
    
}
abstract class Osoba
{
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void pobierzOpis();
}

class Pracownik extends Osoba
{
    double wynagrodzenie;
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis() 
    {
        System.out.println("Jestem pracownikiem");
        System.out.println("Moje imie to: "+ imie);
        System.out.println("Moje nazwisko to: "+ nazwisko);
        System.out.println("Moje wynagrodzenie wyniosi: "+ wynagrodzenie);
    }
    
}

class Student extends Osoba
{
    Student(String imie, String nazwisko)
    {
        super(imie,nazwisko);
    }
     @Override
    void pobierzOpis() 
    {
        System.out.println("Jestem studentem");
        System.out.println("Moje imie to: "+ imie);
        System.out.println("Moje nazwisko to: "+ nazwisko);
    }
}