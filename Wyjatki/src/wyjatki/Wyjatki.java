
package wyjatki;


public class Wyjatki 
{

   
    public static void main(String[] args) 
    {
        int a =10;
       try{
        if(a == 10)
            throw new NaszWyjatek("a jest rowne 10 bee ");
       }
       catch(Exception ex)
       {
           System.out.println(ex.getMessage());
       }
         try
         {
             System.out.println(5/0);
         }
         catch(ArithmeticException ex)
         {
             System.out.println("Powstał wyjątek: " + ex.getMessage());
         }
         finally
         {
             System.out.println("to zawsze zostanie wywołane");
         }
         System.out.println("cos");
    }
 
}
class NaszWyjatek extends Exception
{

    public NaszWyjatek(String string) {
        super(string);
    }
    


}