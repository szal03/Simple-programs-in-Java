
package klasaobject;


public class KlasaObject {

 
    public static void main(String[] args) 
    {
        Object a = new Punkt(20,30);
        Punkt p = new Punkt(4,10); // adres
        
       // System.out.println(p.getClass());
        Punkt p2 = new Punkt(4,10); // adres
        
        //p.equals(p2);
        
        if(p.equals(p2)) // porowjaj dwa adresy
            System.out.println("są sobie rowne");
     
        Object[] punkty = new Punkt[4];
        punkty[0] = new Punkt(2,60);
        punkty[1] = new Punkt(3,65);
        punkty[2] = new Punkt(6,69);
        punkty[3] = new Punkt(90,60);
        
        for(int i = 0; i<punkty.length; i++)
        {
            System.out.println(punkty[i]);
        }
        System.out.println(p);
    }
    
}
class Punkt extends Object
{
    private int x;
    private int y;
    
    Punkt()
    {
    
    }
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    int getX()
    {
        return x;
    }
    
    int getY()
    {
        return y;
    }
    
    @Override
     public boolean equals(Object o) 
     {
         if(o == null)
             return false;
         if(this == o)
             return true;
         if(this.getClass() != o.getClass())
             return false;
         
         
         Punkt przyslany = (Punkt)o;
          
        return this.x == przyslany.x && this.y == przyslany.y;
    }
    @Override
    public String toString()
    {
        return getX() + " " + getY();
        
        
    }

     
     
}