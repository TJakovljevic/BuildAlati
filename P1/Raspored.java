import java.util.HashMap;
import java.util.HashSet;

public class Raspored {

    Termin termin;
    Prostorija prostorija;


    public Raspored(){
         termin = new Termin("1999-08-08","19:30", "30");
         prostorija = new Prostorija("Raf", 14);
    }


    @Override
    public String toString(){
        return termin.getDate() + " " +  termin.getTime() + " " +
                termin.getVremeTrajanja() + ", " + prostorija.getVrsta() + ", " + prostorija.getBroj();
    }


    public Termin getTermin() {
        return termin;
    }

    public Prostorija getProstorija() {
        return prostorija;
    }
}
