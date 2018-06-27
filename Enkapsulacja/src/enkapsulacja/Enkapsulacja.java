
package enkapsulacja;

public class Enkapsulacja {

    
    public static void main(String[] args) {
        
        KontoBankowe oszczednosciowe = new KontoBankowe();
        
       // oszczednosciowe.saldo = 10000;
        oszczednosciowe.setSaldo(20000);
           oszczednosciowe.wplac(5000);
        
        if(oszczednosciowe.wyplac(100))
        {
            System.out.println("wyplacono");
        }
        else
            System.out.println("za malo kasy na koncie");
        
     
        System.out.println(oszczednosciowe.getSaldo());
        
    }
    
}
class KontoBankowe
{
    
    public KontoBankowe()
    {
        saldo=1000;
    }
    private int saldo; // tylko wewnatrz klasy mamy dostep - private 
    int getSaldo()
    {
        return saldo;
    }
    private void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }
    
    boolean wyplac(int ile)
    {
        if(saldo<ile)
            return false;
        else
            setSaldo(saldo - ile);
           // saldo -= ile;
        
        return true;
    }
    boolean wplac(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }
    
}