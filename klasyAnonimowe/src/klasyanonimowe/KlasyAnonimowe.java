
package klasyanonimowe;


public class KlasyAnonimowe {

   
    public static void main(String[] args) 
    {
      ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() 
      {
          @Override
          public void akcja() {
              System.out.println("z klasy anonimowej");
          }
          
          
      };
      Przycisk p = new Przycisk();
      
      p.dodajAkcje(z);
    }
    
}
interface ZachowaniePoWcisnieciu
{
    void akcja();
}
class Przycisk 
{

    void dodajAkcje(ZachowaniePoWcisnieciu z)
    {
        z.akcja();
    }


}

//class Przycisk2 implements ZachowaniePoWcisnieciu
//{
//
//    @Override
//    public void akcja() {
//        
//        System.out.println("przycisk drugi");
//    }
//
//}