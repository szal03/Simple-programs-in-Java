
package klasywewnetrzne;


public class Klasywewnetrzne {

  
    public static void main(String[] args) {
   
        A zewnetrzna = new A();
        
        A.B tmp = zewnetrzna.new B(); // do klasy zagnieżdzonej 
    }
    
}
class A
{
    A()
    {
        System.out.println("Z klasy zewnętrznej");
    }
    class B
    {
         B()
    {
        System.out.println("Z klasy zagnieżdzonej");
    }
        void cos()
        {
            test = 5;
        }
        
        private int tmp;
    }
    void cos2()
    {
        //tmp = 2;
    }
    private int test;
    
}