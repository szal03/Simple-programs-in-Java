
package finallkeyword;

import java.util.Date;

public class FinallKeyword {

   
    public static void main(String[] args) 
    {
        final double PI = 3.14;
        
        Pracownik p = new Pracownik();
        
        System.out.println(p.dataZatrudnienia); //wypisze dzisiejsza date ?
    }
    
}

abstract class Osoba
{

}
class Pracownik extends Osoba
{
    Pracownik()
    {
        this.dataZatrudnienia = new Date();
    }
    Pracownik(Date data)
    {
        this.dataZatrudnienia = data;
    }
    final Date getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }
    final Date dataZatrudnienia;
}
class Programista extends Pracownik
{
    
    
}