
package referencje1;


public class Referencje1 {


    public static void main(String[] args) 
    {
            int a = 5;
            
            Test x = new Test();
            
//            x.zmienWartosc(a);
//            System.out.println(a);
            
            a=x.zmienWartosc2(a);
            System.out.println(a);
            
            Foo f = new Foo();
            
            x.zmienZawartosc(f);
            System.out.println(f.y);
    }
    
}

class Test
{
//    void zmienWartosc(int zmienna)
//    {
//        zmienna=zmienna+2;
//       // System.out.println(zmienna);
//    }
    
    int zmienWartosc2(int zmienna)
    {
        zmienna=zmienna+2;
        return zmienna;
    }
    void zmienZawartosc(Foo zmienna)
    {
        zmienna.y=zmienna.y+50;
    }
    
}
class Foo
{
    int y=20;
    
}