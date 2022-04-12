import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class KassenzettelAusgabe extends JFrame {

    private ArrayList<Getraenk> getraenkeListe;
    private ArrayList<Snacks> snackListe;

    JFrame ausgabe = new JFrame();
    JTextPane ausgeben = new JTextPane();

    KassenzettelAusgabe(ArrayList<Getraenk> getraenkeListe, ArrayList<Snacks> snackListe, String ausgabetext) {

        this.snackListe = snackListe;
        this.getraenkeListe = getraenkeListe;

        ausgeben.setText(ausgabetext);
        ausgeben.setBounds(0, 0, 300, 300);
        ausgeben.setFont(new Font(null, 1, 15));
        ausgeben.setForeground(new Color(0x272640));
        ausgeben.setEditable(false);

        ausgabe.setLayout(null);
        ausgabe.getContentPane().setBackground(new Color(0x272640));// Hintergrunfarbe(Rot/Gr�n/Blau)
        ausgabe.setTitle("GETRAENKEVERWALTUNG");// Title des Frames
        ausgabe.setSize(300, 300);// setzt die X und Y demensionen des Frames
        ausgabe.setResizable(false);// Sch�tzt das Frame vor Gr��en�nderungen
        ausgabe.setLocationRelativeTo(null);
        ausgabe.add(ausgeben);
        ausgabe.setVisible(true);

    }
}