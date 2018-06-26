
package metody;

public class Metody 
{

   
    public static void main(String[] args) 
    {
        Test a = new Test();
        //a.wypisz();
        a.wypisz("hakuna matatha", "jak cudownie to brzmi");
        
        int wynik=a.suma(30,30);
        
        System.out.println(wynik);
        
        double wynik2 = a.dzielenie(10.0, 2.0);
        System.out.println(wynik2);
        
        double wynik3=a.suma(4.89, 7.89);
        System.out.println(wynik3);
        
    }
    
}

class Test
{
    void wypisz(String slowo, String zdanie)
    {
        System.out.println(slowo+" "+zdanie);
    }
    
    int suma(int liczba1, int liczba2)
    {
        return liczba1+liczba2;
    }
    //przeciazenie funkcji
     double suma(double liczba1, double liczba2)
    {
        return liczba1+liczba2;
    }
    double dzielenie(double a, double b)
    {
        if(b==0)
            return 0;
        
        return a/b;
    }
}