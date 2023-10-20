import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

public class Termin {

    String date;
    String pocetak;
    String kraj;

    public Termin(String date, String pocetak, String kraj){
        this.date = date;
        this.pocetak = pocetak;
        this.kraj = kraj;
    }




    public String getTime() {
        return pocetak;
    }

    public String getDate() {
        return date;
    }

    public String getVremeTrajanja() {
        return kraj;
    }
}
