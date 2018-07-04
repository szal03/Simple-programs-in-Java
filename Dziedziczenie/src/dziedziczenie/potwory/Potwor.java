/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dziedziczenie.potwory;

/**
 *
 * @author Alice
 */
public class Potwor {
    public double predkoscChodzenia = 10;
    public double HP;
    
    public void atakuj()
    {
        
        System.out.println("to jest metoda ataku z klasy potwor");
    }
    
    public Potwor()
    {
        System.out.println("domyslny konstruktor z klasy potwor");
    }
    public Potwor(double predkoscChodzenia,double HP)
    {
        this.predkoscChodzenia = predkoscChodzenia;
        this.HP = HP;
        
    System.out.println("NIE domyslny konstruktor z klasy potwor");
      
    }
}
