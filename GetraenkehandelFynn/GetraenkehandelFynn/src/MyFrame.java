import java.awt.Font;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {

	JFrame frame = new JFrame();

	JButton bestandsButton = new JButton();// Erstellt den button
	JButton verkaufsButton = new JButton();
	JButton bestandErhoehenButton = new JButton();
	JButton exitButton = new JButton();

	private ArrayList<Getraenk> getraenkeListe;
	private ArrayList<Snacks> snackListe;

	MyFrame(ArrayList<Getraenk> getraenkeListe, ArrayList<Snacks> snackListe) { // Konstruktor

		bestandsButton.setBounds(300, 50, 200, 50);// Gr��e des Buttons
		bestandsButton.addActionListener(this);// (e -> System.out.println("Bestand"));
		bestandsButton.setText("Bestand");// Beschrifftung des Buttons
		bestandsButton.setFocusable(false);
		bestandsButton.setBackground(new Color(0x0F0F1A));// Hintergrundfarbe
		bestandsButton.setForeground(new Color(250, 250, 250)); // Border entfernen
		bestandsButton.setFont(new Font(null, 1, 15));
		bestandsButton.setBorderPainted(false);

		verkaufsButton.setBounds(300, 150, 200, 50);
		verkaufsButton.addActionListener(this);// e -> System.out.println("verkaufen"
		verkaufsButton.setText("Verkaufen");
		verkaufsButton.setFocusable(false);
		verkaufsButton.setBackground(new Color(0x0F0F1A));
		verkaufsButton.setBorderPainted(false);
		verkaufsButton.setFont(new Font(null, 1, 15));
		verkaufsButton.setForeground(new Color(250, 250, 250));

		bestandErhoehenButton.setBounds(300, 250, 200, 50);
		bestandErhoehenButton.addActionListener(this);// AktionListner Für den Button
		bestandErhoehenButton.setText("Bestand Erhoehen");
		bestandErhoehenButton.setFocusable(false);
		bestandErhoehenButton.setBackground(new Color(0x0F0F1A));
		bestandErhoehenButton.setBorderPainted(false);
		bestandErhoehenButton.setFont(new Font(null, 1, 15));
		bestandErhoehenButton.setForeground(new Color(250, 250, 250));

		exitButton.setBounds(300, 350, 200, 50);
		exitButton.addActionListener(e -> System.exit(0));// Sorgt dafür das beim Dücken das programm geschlossen wird
		exitButton.setText("EXIT");
		exitButton.setFocusable(false);
		exitButton.setBackground(new Color(0x0F0F1A));
		exitButton.setBorderPainted(false);
		exitButton.setFont(new Font(null, 1, 15));
		exitButton.setForeground(new Color(250, 250, 250));

		this.setVisible(true);// Macht das Frame sichtbar
		this.setLayout(null);// entfernt das Layout damit eine Freiegestalltung des Frames möglich ist
		this.getContentPane().setBackground(new Color(0x272640));// Hintergrunfarbe(Rot/Gr�n/Blau)
		this.setTitle("GETRAENKEVERWALTUNG");// Title des Frames
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Schlie�t das frame
		this.setSize(800, 500);// setzt die X und Y demensionen des Frames
		this.setResizable(false);// Sch�tzt das Frame vor Gr��en�nderungen
		this.add(bestandsButton);// F�gt den button dem Frame hinzu
		this.add(verkaufsButton);
		this.add(bestandErhoehenButton);
		this.add(exitButton);
		this.setLocationRelativeTo(null); // setzt das frame in die Mitte des Bildschirms

		this.getraenkeListe = getraenkeListe;
		this.snackListe = snackListe;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bestandsButton) { // dafür das beim Betätigen des Buttons das Frame erzeugt wird
			Bestandsanzeige f = new Bestandsanzeige(getraenkeListe, snackListe);
		}
		if (e.getSource() == verkaufsButton) {
			Verkaufsanzeige verkaufsAnzeige = new Verkaufsanzeige(getraenkeListe, snackListe);
			this.dispose();
		}
		if (e.getSource() == bestandErhoehenButton) {
			ErhoehenAnzeige erhoehenAnzeige = new ErhoehenAnzeige(getraenkeListe, snackListe);
			this.dispose();
		}
	}
}
