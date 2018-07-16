/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokumentowanie;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla ..
 * opis
 * opis
 * opis
 * opis
 * @author Alice S
 * @version 1.0.4.2 16.07.2018
 */
public class Pracownik {
    
    
    /**
         Konstruktor domyślny
    */
    public Pracownik() {}
    /** 
     * Konstruktor tworzący obiek <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imię
     * @param nazwisko ustawia nazwisko
     */
    public Pracownik(String imie, String nazwisko)
    {   
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
     /** 
     * Konstruktor tworzący obiek <code>Pracownik</code> z imieniem i nazwiskiem oraz z wynagrodzeniem
     * @param imie ustawia imię
     * @param nazwisko ustawia nazwisko
     * @param wynagrodzenie ustawia wynagrodzenie
     */
    public Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        this(imie, nazwisko); // zeby nie pisać dwa razy - pobiera z Pracownika wyrzej
        this.wynagrodzenie = wynagrodzenie;
    }
    /**
     * 
     * 
     * @param nowaPensja 
     */
    public void setWynagrodzenie(double nowaPensja)
    {
    
    }
    /**
    Imię pracownika
    */
    private String imie;
     /**
    Nazwisko pracownika
    */
    private String nazwisko;
         /**
    Wynagrodzenie pracownika
    */
    private double wynagrodzenie;
}
