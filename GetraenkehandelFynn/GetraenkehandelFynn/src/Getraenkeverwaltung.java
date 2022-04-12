import java.util.ArrayList;

public class Getraenkeverwaltung {

	public static void main(String[] args) {

		// Getr�nke
		Getraenk trinkCola = new Getraenk("Cola", 1.50, 2000, "Kalt", 0.330, 03.2029, 1235437885, "Coca cola");
		Getraenk trinkFanta = new Getraenk("Fanta", 1.20, 2300, "Kalt", 0.330, 04.2030, 1246544444, "Coca cola");
		Getraenk trinkSprite = new Getraenk("Sprite", 1.40, 2600, "Kalt", 0.330, 05.2030, 1246546644, "Coca cola");
		Getraenk trinkBier = new Getraenk("Bier", 1.00, 3000, "Extra kalt", 0.500, 04.2025, 1431654241,
				"Biernominalverteilung");
		Getraenk trinkSekt = new Getraenk("Sekt", 3.40, 250, "Kalt", 0.750, 04.2028, 2128495086, "Sekten");
		Getraenk trinkWein = new Getraenk("Wein", 5.50, 400, "Zimmertemperatur", 0.750, 05.2040, 02334325475,
				"KapitalistenWeine");
		Getraenk trinkMate = new Getraenk("Mate", 1.43, 2040, "Kalt", 0.500, 05.2027, 1234561536, "KarateMate");
		Getraenk trinkVodka = new Getraenk("Vodka", 1.54, 3009, "Kalt", 0.750, 04.2039, 1432432987, "Waesserchen");
		Getraenk trinkKorn = new Getraenk("Korn", 12.50, 300, "Eiskalt", 0.750, 05.2050, 1242412347, "Happy Landleben");

		// Snacks
		Snacks issChips = new Snacks("Chips", 2.00, 240, "Trocken", 0.230, 05.2024, 1543225652, "Choeppes");
		Snacks issErdnuesse = new Snacks("Erdnuesse", 2.20, 503, "Trocken", 0.400, 05.2023, 1984756384, "Earthnuts");
		Snacks issSchokolade = new Snacks("Schokolade", 3.00, 2000, "Trocken", 0.250, 05.2025, 1984456372,
				"Wolly Wunker");
		Snacks issWeingummi = new Snacks("Weingummi", 2.50, 230, "Trocken", 0.300, 07.2034, 2049384769, "BigBag");
		Snacks issSalzstangen = new Snacks("Salzstangen", 1.75, 2664, "Trocken", 0.500, 08.2024, 1634654322,
				"Stangen e.V.");
		Snacks issCracker = new Snacks("Cracker", 2.30, 5000, "Trocken", 0.700, 02.2030, 1435226534, "Crackattack");
		Snacks issRussischbrot = new Snacks("Russischbrot", 3.00, 800, "Trocken", 0.300, 04.2055, 1532676654,
				"Eigen Brotler");
		Snacks issFlips = new Snacks("Flips", 1.20, 2355, "Trocken", 0.250, 03.2034, 1554336565, "Kickflips");
		Snacks issPralinen = new Snacks("Pralinen", 5.00, 4000, "Trocken", 0.400, 04.2025, 1332256567, "Dulces");

		// ArrayList für die Getraenke

		ArrayList<Getraenk> getraenkeListe = new ArrayList<Getraenk>();

		getraenkeListe.add(trinkBier);
		getraenkeListe.add(trinkCola);
		getraenkeListe.add(trinkFanta);
		getraenkeListe.add(trinkVodka);
		getraenkeListe.add(trinkMate);
		getraenkeListe.add(trinkWein);
		getraenkeListe.add(trinkSprite);
		getraenkeListe.add(trinkSekt);
		getraenkeListe.add(trinkKorn);

		// for-schleife zum durchlaufen der Arraylist

		for (Getraenk g : getraenkeListe) {
			System.out.println("\n" + "Name: "
					+ g.getName()
					+ "   Bestand: "
					+ g.getBestand()
					+ "   Preis: "
					+ g.getPreis()
					+ "   Gewicht: "
					+ g.getGewicht()
					+ "   Hersteller: "
					+ g.getHersteller()
					+ "   Lagerung: "
					+ g.getLagerung()
					+ "   Verfalssdatum: "
					+ g.getVerfallsdatum()
					+ "   Barcode: "
					+ g.getBarcode());
		}

		// ArrayList für die Snacks

		ArrayList<Snacks> snackListe = new ArrayList<Snacks>();

		snackListe.add(issChips);
		snackListe.add(issErdnuesse);
		snackListe.add(issSchokolade);
		snackListe.add(issWeingummi);
		snackListe.add(issSalzstangen);
		snackListe.add(issCracker);
		snackListe.add(issRussischbrot);
		snackListe.add(issFlips);
		snackListe.add(issPralinen);

		for (Snacks s : snackListe) {
			System.out.println("\n" + "Name: "
					+ s.getName()
					+ "   Bestand: "
					+ s.getBestand()
					+ "   Preis: "
					+ s.getPreis()
					+ "   Gewicht: "
					+ s.getGewicht()
					+ "   Hersteller: "
					+ s.getHersteller()
					+ "   Lagerung: "
					+ s.getLagerung()
					+ "   Verfalssdatum: "
					+ s.getVerfallsdatum()
					+ "   Barcode: "
					+ s.getBarcode());
		}
		// JFrame erzeugen
		MyFrame frame = new MyFrame(getraenkeListe, snackListe);// Erstellt ein Frame

	} // end of main
} // end of class Getraenkeverwaltung