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
 * @see dokumentowanie.Pracownik#getWynagrodzenie() 
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
     * <pre>
     * Jak używać:
     * Pracownik p= new Pracownik();
     * p.setWynagrodzenie(1000);
     * </pre>
     * @param nowaPensja - ustawia pracownikowi nową pensję ( nowe wynagrodzenie)
     */
    public void setWynagrodzenie(double nowaPensja)
    {
        this.wynagrodzenie = nowaPensja;
    }
    /**
     * 
     * 
     * @return zwraca pensje typu double w zł 
     * @since ver. 1.0.0.0
     */
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
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
