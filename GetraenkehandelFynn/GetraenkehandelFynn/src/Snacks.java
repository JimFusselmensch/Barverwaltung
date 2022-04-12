
import java.lang.*;

public class Snacks extends Artikel {

    // Konstruktoren
    public Snacks() {

    }

    public Snacks(String name, double preis, int bestand, String lagerung, double gewicht, double verfallsdatum,
            int barcode, String hersteller) {
        super(name, preis, bestand, lagerung, gewicht, verfallsdatum, barcode, hersteller);
    }

}
