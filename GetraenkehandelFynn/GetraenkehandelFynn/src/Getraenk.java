
import java.lang.*;

public class Getraenk extends Artikel {

    // Konstruktoren
    public Getraenk() {

    }

    public Getraenk(String name, double preis, int bestand, String lagerung, double gewicht, double verfallsdatum,
            int barcode, String hersteller) {
        super(name, preis, bestand, lagerung, gewicht, verfallsdatum, barcode, hersteller);
    }

}
