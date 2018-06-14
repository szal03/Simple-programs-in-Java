package tablice;

public class Tablice 
{
    public static void main(String[] args)
    {
       int[] tab1;
       tab1=new int[5];
       tab1[0]=40;
       
        System.out.println(tab1[0]);
        
      int []tab2={2,3,4,5,6,12,15,16};
      
        System.out.println(tab2[4]);
        System.out.println(tab2[tab2.length-1]);
        
        //tablice wierowymiarowe
        //wiersz x kolumna
        int[][]tab3=new int [4][3];
        tab3[0][0]=25;
        tab3[3][0]=70;
        System.out.println(tab3[0][0]);
        System.out.println(tab3[3][0]);

        
        int[][]tab4=
        {
            {3,4,5},
            {7,2,1},
            {9,4,6}
        };
        System.out.println(tab4[1][1]);
        
    }
    
}
