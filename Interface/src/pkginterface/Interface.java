
package pkginterface;

import java.util.Arrays;
import java.util.Collections;


public class Interface {

   
    public static void main(String[] args) 
    {
//        nazwaInterfejsu a= new Pracownik();
        
//        ((Pracownik)a).getWynagrodzenie(); // rzutowanie w dół
        
        System.out.println(nazwaInterfejsu.PI);
        
        int[] tab = new int[3];
        tab[0]=3;
        tab[1]=-7;
        tab[2]=34;
        
        Arrays.sort(tab);
         System.out.println(tab[0]);
         
        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(1000);
         pracownik[1] = new Pracownik(5000);
          pracownik[2] = new Pracownik(19000);
          
          
        System.out.println(pracownik[0].compareTo(pracownik[1])); 
        Arrays.sort(pracownik);
       
        
//         Arrays.sort(pracownik, Collections.reverseOrder());
        System.out.println("po sortowaniu: ");
        
        for(Pracownik p: pracownik)
        {
            System.out.println(p.getWynagrodzenie());
        }

       
       
    }
    
}
interface nazwaInterfejsu
{
    double PI = 3.14; //public, static, final  
    
    void cos(); //public abstract
    
    
}

class Pracownik implements nazwaInterfejsu, Comparable
{

    @Override
    public void cos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    Pracownik(double wynagrodzenie)
    {
        this.wynagrodzenie = wynagrodzenie;
    }
     public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }

    private double wynagrodzenie;

    @Override
    public int compareTo(Object t) 
    {
        Pracownik przyslany = (Pracownik)t;
        
        if(this.wynagrodzenie < przyslany.wynagrodzenie)
        {
               return -1;
        }
        else if(this.wynagrodzenie > przyslany.wynagrodzenie)
       {
        return 1;
       }
        else
            return 0;
    }
}