
package klasywewnetrzne;


public class Klasywewnetrzne {

  
    public static void main(String[] args) {
   
        A zewnetrzna = new A(); // to jest pierwsze
        
        A.B tmp = zewnetrzna.new B(); // do klasy zagnieżdzonej  // to jest drugie 
        
        A.C tmp2 = new A.C();
    }
    
}
class A
{
    A()
    {
        System.out.println("Z klasy zewnętrznej A");
    }
    class B
    {
         B()
    {
        System.out.println("Z klasy zagnieżdzonej B");
    }
        void cos()
        {
            test = 5;
        }
        
        private int tmp;
    }
    static class C
    {
        C()
        {
            System.out.println("Z klasy zagniżdzonej C");
        }
    
    }
    void cos2()
    {
        //tmp = 2;
    }
    private int test;
    
}