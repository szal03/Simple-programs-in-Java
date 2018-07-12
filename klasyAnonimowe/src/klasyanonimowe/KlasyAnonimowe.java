
package klasyanonimowe;


public class KlasyAnonimowe {

   
    public static void main(String[] args) 
    {
      ZachowaniePoWcisnieciu z = () -> {
          System.out.println("z klasy anonimowej");
      };
      
      ZachowaniePoWcisnieciu2 z2 = (int a, int b) ->
      {
          System.out.println(a+b);
      };
      Przycisk p = new Przycisk();
      
      p.dodajAkcje(z);
      
      p.dodajAkcje2(7, 10, z2);
    }
    
}
interface ZachowaniePoWcisnieciu
{
    void akcja();
}
interface ZachowaniePoWcisnieciu2
{
    void akcja2(int a, int b);

}
class Przycisk 
{

    void dodajAkcje(ZachowaniePoWcisnieciu z)
    {
        z.akcja();
    }
    void dodajAkcje2(int a, int b, ZachowaniePoWcisnieciu2 z)
    {
        z.akcja2(a,b);
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