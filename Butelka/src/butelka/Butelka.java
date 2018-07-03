
package butelka;


public class Butelka
{
    private double ileLitrow;
    
  
    Butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;
    }
    
    double getIleLitrow()
    {
        return ileLitrow;
    }
  
    void wlej(double ilosc)
    {
        this.ileLitrow += ilosc;
    }
    
    boolean wylej(double ilosc)
    {
        if(ilosc<ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;
        
        return true;
    }
    
    void przelej(double ilosc, Butelka gdziePrzelac)
    {
        if(this.wylej(ilosc))
        {
        gdziePrzelac.wlej(ilosc);
        }
        else
            System.out.println("Za malo");
    }
    
    public static void main(String[] args)
    {
          Butelka[] butelka1 = new Butelka[3]; // null
          
          butelka1[0] = new Butelka(5);
          butelka1[1]=new Butelka(10);
          butelka1[2]=new Butelka(15);
          
          butelka1[0].wlej(6);
          butelka1[2].wylej(7);
          
          butelka1[1].przelej(4,butelka1[0]); // zgadza sie 
          
          System.out.println(butelka1[0].getIleLitrow());
          System.out.println(butelka1[1].getIleLitrow());
          System.out.println(butelka1[2].getIleLitrow());
        
    }
    
}
