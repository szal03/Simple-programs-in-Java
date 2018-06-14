
package javaapplication1;

public class JavaApplication1 {


    public static void main(String[] args)
    {
        int a=20;
        int b=4;
        int c;
        c=a+b+b;
        
        System.out.println(c);
        
        //instrukcje warunkowe
        
        if(a>b)
            System.out.println("a>b");
        else
            System.out.println("a<b");
        
       int d=50;
       switch(d)
       {
           case 20:
           { System.out.println("a=20");
               break;
           }
           case 30:
           {
               System.out.println("a=30");
               break;
           }
           case 50:
           {
               System.out.println("a=50");
               break;
           }
           default:
                System.out.println("inna wartosc");
           
           }
           
            int x=5;
            String parzystosc = x % 2 == 0 ? "parzysta" : "nieparzysta";
            
            System.out.println(parzystosc);
       
       }
            
              
    }
    

