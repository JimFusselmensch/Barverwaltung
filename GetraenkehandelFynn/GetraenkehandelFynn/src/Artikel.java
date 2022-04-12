import java.util.Scanner;

//abstract zum vererben sorgt dafür das kein Object erzeugt werden kann

public abstract class Artikel {

	// Deklaration der Attribute

	protected String name;
	protected double preis;
	protected int bestand;
	protected String lagerung;
	protected double gewicht;
	protected double verfallsdatum;
	protected int barcode;
	protected String hersteller;

	// Konstruktor
	// Polymorphie
	public Artikel() {
	}

	public Artikel(String name, double preis, int bestand, String lagerung, double gewicht, double verfallsdatum,
			int barcode, String hersteller) {
		this.name = name;
		this.preis = preis;
		this.bestand = bestand;
		this.lagerung = lagerung;
		this.gewicht = gewicht;
		this.verfallsdatum = verfallsdatum;
		this.barcode = barcode;
		this.hersteller = hersteller;

	}

	// Set-Methoden Attributvariablen mit einem Wert besetzen

	public void setName(String name) {
		this.name = name;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public void setBestand(int bestand) {
		this.bestand = bestand;
	}

	public void setLagerung(String lagerung) {
		this.lagerung = lagerung;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	public void setVerfallsdatum(double verfallsdatum) {
		this.verfallsdatum = verfallsdatum;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	// Get-Methoden zum auslesen des Artikels

	public String getName() {
		return name;
	}

	public double getPreis() {
		return preis;
	}

	public int getBestand() {
		return bestand;
	}

	public String getLagerung() {
		return lagerung;
	}

	public double getGewicht() {
		return gewicht;
	}

	public double getVerfallsdatum() {
		return verfallsdatum;
	}

	public int getBarcode() {
		return barcode;
	}

	public String getHersteller() {
		return hersteller;
	}

	// Methoden zur Verwaltung der Getraenke
	// Diese Methode erhoeht den Bestand um die eingegebene Menge

	public void bestandErhoehen(int menge) {

		bestand = bestand + menge;
	}

	// Diese Methode verringert den Bestand um die Verkaufsmenge,
	// ruft die Methode kassenzettelDrucken() auf und gibt den von ihr als
	// Rueckgabewert erhaltenen String zur�ck

	public String verkaufen(int verkaufsmenge) {
		String ausgabetext;

		if (bestand >= verkaufsmenge) {

			bestand = bestand - verkaufsmenge;

			ausgabetext = kassenzettelDrucken(verkaufsmenge);
		} else if (bestand == verkaufsmenge) {

			bestand = bestand - verkaufsmenge;

			ausgabetext = kassenzettelDrucken(verkaufsmenge) + "Dies war der letzte " + this.getName();
		} else {

			ausgabetext = "Nicht genug Bestand";
		}

		return ausgabetext;
	}

	// Diese Methode berechnet den Gesamtpreis und gibt den Kassenzettel als String
	// zur�ck

	public String kassenzettelDrucken(int verkaufsmenge) {
		String kassenzettel;
		double gesamtpreis;

		gesamtpreis = preis * verkaufsmenge;

		kassenzettel = "  Name: " + name +

				"\n  Verkaufsmenge: " + verkaufsmenge +

				"\n  Preis in Euro: " + preis +

				"\n  Gesamtpreis: " + gesamtpreis +

				"\n";

		return kassenzettel;
	}

	// Diese Methode gibt einen Rabatt ab einem kauf von 20,30 und 40 produkten

	public String rabattGeben(int verkaufsmenge) {
		String ausgabetext;
		double gesamtrabatt;

		if (verkaufsmenge >= 20 && verkaufsmenge <= 29) {
			bestand = bestand - verkaufsmenge;
			preis = preis - 0.10d;
			gesamtrabatt = 0.10d * verkaufsmenge;
			ausgabetext = kassenzettelDrucken(verkaufsmenge) + "\n  Sie erhalten eine Rabatt von: " + gesamtrabatt;
		}

		else if (verkaufsmenge >= 30 && verkaufsmenge <= 39) {
			bestand = bestand - verkaufsmenge;
			preis = preis - 0.20d;
			gesamtrabatt = 0.20d * verkaufsmenge;
			ausgabetext = kassenzettelDrucken(verkaufsmenge) + "\n  Sie erhalten eine Rabatt von: " + gesamtrabatt;
		}

		else if (verkaufsmenge >= 40) {
			bestand = bestand - verkaufsmenge;
			preis = preis - 0.30d;
			gesamtrabatt = 0.30d * verkaufsmenge;
			ausgabetext = kassenzettelDrucken(verkaufsmenge) + "\n  Sie erhalten eine Rabatt von: " + gesamtrabatt;
		}

		else {
			bestand = bestand - verkaufsmenge;
			ausgabetext = kassenzettelDrucken(verkaufsmenge);
		}
		return ausgabetext;
	}

}