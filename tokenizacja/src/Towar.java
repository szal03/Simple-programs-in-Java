import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Towar {

    public Towar(){
        this.cena=0.0;
        this.nazwa="";
        this.dataWydania=new GregorianCalendar().getTime();

    }

    public Towar(double cena, String nazwa)
    {
        this();
        this.cena = cena;
        this.nazwa = nazwa;
    }

    public Towar(double cena, String nazwa, int rok, int miesiac, int dzien){
        this(cena,nazwa);
        GregorianCalendar kalendarz = new GregorianCalendar(rok, miesiac-1, dzien);
        this.dataWydania = kalendarz.getTime();
    }

    public double pobierzCene(){
        return this.cena;
    }
    public String pobierzNazwe(){
        return this.nazwa;
    }
    public Date pobierzDate(){
        return dataWydania;
    }
    public void ustawCene(double cena){
        this.cena = cena;
    }
    public void ustawNazwe(String nazwa){
        this.nazwa=nazwa;
    }
    public void ustawDate(int rok, int miesiac, int dzien){
        GregorianCalendar kalendarz = new GregorianCalendar(rok, miesiac-1, dzien);
        this.dataWydania = kalendarz.getTime();
    }
    public void ustawDate(Date data){
        this.dataWydania=data;
    }
    @Override
    public String toString()
    {
        GregorianCalendar kalendarz = new GregorianCalendar();
        kalendarz.setTime(this.dataWydania);
        return this.cena+" zł; nazwa: "+ this.nazwa+" "+kalendarz.get(Calendar.YEAR)+" rok "+kalendarz.get(Calendar.MONTH)+" miesiąc "+kalendarz.get(Calendar.DAY_OF_MONTH)+" dzień ";
    }

    public static void zapiszDOPliku(Towar[] towar, PrintWriter outS)
    {
        
    }

    double cena;
    String nazwa;
    Date dataWydania;
}
