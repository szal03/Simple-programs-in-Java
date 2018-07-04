
package butelka;


public class Butelka
{
    private double ileLitrow;
    private double pojemnosc;
  
    Butelka(double ileLitrow,double pojemnosc)
    {
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
    }
    
    double getIleLitrow()
    {
        return ileLitrow;
    }
    
    double getPojemnosc()
    {
         return pojemnosc;
    }
  
    void wlej(double ilosc, double pojemnosc)
    {
        if(this.ileLitrow+ilosc<=pojemnosc)
        {
            this.ileLitrow += ilosc;
        }
        else
        {
            System.out.println("woda w butelce przeleje sie");
        }
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
        gdziePrzelac.wlej(ilosc,pojemnosc);
        }
        else
            System.out.println("Za malo");
    }
    
    public static void main(String[] args)
    {
          Butelka[] butelka1 = new Butelka[3]; // null
          
          butelka1[0] = new Butelka(5,10);
          butelka1[1]=new Butelka(10,20);
          butelka1[2]=new Butelka(15,30);
          
        //  butelka1[0].wlej(6);
         // butelka1[2].wylej(7);
          
          //butelka1[1].przelej(4,butelka1[0]); // zgadza sie 
          
          System.out.println(butelka1[0].getIleLitrow());
          System.out.println(butelka1[0].getPojemnosc());
          System.out.println(butelka1[1].getIleLitrow());
          System.out.println(butelka1[1].getPojemnosc());
          System.out.println(butelka1[2].getIleLitrow());
          System.out.println(butelka1[2].getPojemnosc());
    }
    
}
