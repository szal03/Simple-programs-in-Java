package petle;

public class Petle 
{


    public static void main(String[] args) 
    {
        //zad1
      /*String[] zwierzaki=
       {
           "kot",
           "pies",
           "papuga",
           "swinka morska",
           "mysz",
           "krolik",
           "kura"
       };
       // petla while
       int i=0;
       while(i<zwierzaki.length)
       {
           if(i!=3) System.out.println(zwierzaki[i]);
            
           i++;
       }
       
       //pentla do - while
       i=0; // zerowanie i - bo bylo wczesniej uzywane
       do
       {
           System.out.println(zwierzaki[i]);
           i++;
       
       }while(i<zwierzaki.length);
       
        int []liczby={10,20,30,40,50,60,70,80,90,100};
        
        int j=0;
        while(j<10)
        {
            System.out.println(liczby[j]);
            j++;
        }
        //zad2
        //petla for
        for(int k=0;k<zwierzaki.length; k++)
       {
           System.out.println(zwierzaki[k]);
       }  
        //enhanced for
        for(String myValue: zwierzaki)
        {
            System.out.println(myValue);
        }*/
        //zad3
        for(int m=1;m<=10;m++)
        {
            for(int l=1;l<=10;l++)
            {
            System.out.print(l*m + " ");
        
            }
            
            System.out.println();
        }
        
        //
        for(int n=0;n<10;n++)
        {
            if(n==3) continue;
            
            
            if(n==8)break;
            
            System.out.println(n);
        }
        
        //zad - wypisywanie co drugiej kolumny
         for(int m=1;m<=10;m++)
        {
            for(int l=1;l<=10;l++)
            {
                if(l%2==0)
                     System.out.print(l*m + " ");
        
            }
            
            System.out.println();
        }
        //sumowanie
        int []tab1={1,24,25,13,16,17,91};
        
         int suma=0;
         
         for(int p=0;p<tab1.length;p++)
         {
             suma=suma+tab1[p];
         }
         
         System.out.println(suma);
         
    }
    
}
