import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class ErhoehenAnzeige extends JFrame implements ActionListener {

    JFrame erhoehenAnzeige = new JFrame();
    JButton exitButton = new JButton();
    JButton zurückButton = new JButton();
    JButton exitButton2 = new JButton();
    JButton zurückButton2 = new JButton();
    JButton erhoehen = new JButton();
    JButton erhoehen2 = new JButton();
    JButton getraenk = new JButton();
    JButton snack = new JButton();
    JPanel auswahl = new JPanel();

    JFormattedTextField fielder;
    JFormattedTextField fielder2;

    JComboBox buttong = new JComboBox();
    JComboBox buttons = new JComboBox();

    private ArrayList<Getraenk> getraenkeListe;
    private ArrayList<Snacks> snackListe;
    private Getraenk aktuellesGetraenk;
    private Snacks aktuellerSnack;

    public ErhoehenAnzeige(ArrayList<Getraenk> getraenkeListe, ArrayList<Snacks> snackListe) {

        this.getraenkeListe = getraenkeListe;
        this.snackListe = snackListe;

        // Zwischen auswahl button

        getraenk.setBounds(190, 200, 200, 50);
        getraenk.addActionListener(this);
        getraenk.setText("Getraenk");
        getraenk.setFocusable(false);
        getraenk.setBackground(new Color(0x0F0F1A));
        getraenk.setBorderPainted(false);
        getraenk.setFont(new Font(null, 1, 15));
        getraenk.setForeground(new Color(250, 250, 250));
        getraenk.setVisible(true);

        snack.setBounds(410, 200, 200, 50);
        snack.addActionListener(this);
        snack.setText("Snacks");
        snack.setFocusable(false);
        snack.setBackground(new Color(0x0F0F1A));
        snack.setBorderPainted(false);
        snack.setFont(new Font(null, 1, 15));
        snack.setForeground(new Color(250, 250, 250));
        snack.setVisible(true);

        // JButton zum schließen der Getraenkeverwaltung

        exitButton.setBounds(190, 350, 200, 50);
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setBackground(new Color(0x0F0F1A));
        exitButton.setBorderPainted(false);
        exitButton.setFont(new Font(null, 1, 15));
        exitButton.setForeground(new Color(250, 250, 250));
        exitButton.setVisible(false);

        // JButton zum zurrückführen zum Mainframe

        zurückButton.setBounds(410, 350, 200, 50);
        zurückButton.addActionListener(this);
        zurückButton.setText("Zurück");
        zurückButton.setFocusable(false);
        zurückButton.setBackground(new Color(0x0F0F1A));
        zurückButton.setBorderPainted(false);
        zurückButton.setFont(new Font(null, 1, 15));
        zurückButton.setForeground(new Color(250, 250, 250));
        zurückButton.setVisible(false);

        // Jbutton Exit und Zurück fürs Panel

        // JButton zum schließen der Getraenkeverwaltung

        exitButton2.setBounds(190, 350, 200, 50);
        exitButton2.addActionListener(e -> System.exit(0));
        exitButton2.setText("EXIT");
        exitButton2.setFocusable(false);
        exitButton2.setBackground(new Color(0x0F0F1A));
        exitButton2.setBorderPainted(false);
        exitButton2.setFont(new Font(null, 1, 15));
        exitButton2.setForeground(new Color(250, 250, 250));
        exitButton2.setVisible(true);

        // JButton zum zurrückführen zum Mainframe

        zurückButton2.setBounds(410, 350, 200, 50);
        zurückButton2.addActionListener(this);
        zurückButton2.setText("Zurück");
        zurückButton2.setFocusable(false);
        zurückButton2.setBackground(new Color(0x0F0F1A));
        zurückButton2.setBorderPainted(false);
        zurückButton2.setFont(new Font(null, 1, 15));
        zurückButton2.setForeground(new Color(250, 250, 250));
        zurückButton2.setVisible(true);

        // Erhoehen button

        erhoehen.setBounds(300, 250, 200, 50);
        erhoehen.addActionListener(this);
        erhoehen.setText("ERHOEHEN");
        erhoehen.setFocusable(false);
        erhoehen.setBackground(new Color(0x0F0F1A));
        erhoehen.setBorderPainted(false);
        erhoehen.setFont(new Font(null, 1, 15));
        erhoehen.setForeground(new Color(250, 250, 250));
        erhoehen.setVisible(false);

        // Erhoehen Button die zweite

        erhoehen2.setBounds(300, 250, 200, 50);
        erhoehen2.addActionListener(this);
        erhoehen2.setText("ERHOEHEN");
        erhoehen2.setFocusable(false);
        erhoehen2.setBackground(new Color(0x0F0F1A));
        erhoehen2.setBorderPainted(false);
        erhoehen2.setFont(new Font(null, 1, 15));
        erhoehen2.setForeground(new Color(250, 250, 250));
        erhoehen2.setVisible(false);

        // JTextfield zur Eingabe der Bestandserhoehung

        fielder = new JFormattedTextField(NumberFormat.getNumberInstance());
        fielder.setText("0");
        fielder.setColumns(2);
        fielder.setBounds(300, 150, 200, 50);
        fielder.setFont(new Font(null, 1, 15));
        fielder.setForeground(new Color(255, 255, 255));
        fielder.setBackground(new Color(0x0F0F1A));
        fielder.setVisible(false);

        // JTextfiel für Snackeingabe

        fielder2 = new JFormattedTextField(NumberFormat.getNumberInstance());
        fielder2.setText("0");
        fielder2.setColumns(2);
        fielder2.setBounds(300, 150, 200, 50);
        fielder2.setFont(new Font(null, 1, 15));
        fielder2.setForeground(new Color(255, 255, 255));
        fielder2.setBackground(new Color(0x0F0F1A));
        fielder2.setVisible(false);

        // JComboBox zur Auswahl des Artikels

        buttong.setBounds(300, 50, 200, 50);
        buttong.setBackground(new Color(0x0F0F1A));
        buttong.setForeground(new Color(250, 250, 250));
        buttong.setFont(new Font(null, 1, 15));
        buttong.setFocusable(false);
        buttong.setVisible(false);

        // JComboBox für die Snacks

        buttons.setBounds(300, 50, 200, 50);
        buttons.setBackground(new Color(0x0F0F1A));
        buttons.setForeground(new Color(250, 250, 250));
        buttons.setFont(new Font(null, 1, 15));
        buttons.setFocusable(false);
        buttons.setVisible(false);

        for (Getraenk g : getraenkeListe) {
            buttong.addItem(g.getName());
        }

        for (Snacks s : snackListe) {
            buttons.addItem(s.getName());
        }

        // Erzeugen des Bestanderhoehen frames

        auswahl.setBounds(0, 0, 800, 600);
        auswahl.setVisible(false);
        auswahl.setBackground(new Color(0x272640));

        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0x272640));// Hintergrunfarbe(Rot/Gruen/Blau)
        this.setTitle("GETRAENKEVERWALTUNG");// Title des Frames
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Schliesst das frame
        this.setSize(800, 500);// setzt die X und Y demensionen des Frames
        this.setResizable(false);// Schuetzt das Frame vor Groessenaenderungen
        this.setLocationRelativeTo(null); // Lässt das Frame in der Mitte des Bildschirms erscheinen

        // Hinzufügen der einzelnen Buttons/Textfield/Combobox zum Fram ErhoehenAnzeige

        this.add(zurückButton);
        this.add(zurückButton2);
        this.add(exitButton);
        this.add(exitButton2);
        this.add(erhoehen);
        this.add(erhoehen2);
        this.add(fielder);
        this.add(fielder2);
        this.add(buttong);
        this.add(buttons);
        this.add(getraenk);
        this.add(snack);
        this.add(auswahl);

        this.setVisible(true);// Macht das Frame sichtbar

    }// Konstruktor Close

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == zurückButton2) {
            this.dispose(); // Schließt das fenster beim drücken des Buttons
            MyFrame frame = new MyFrame(getraenkeListe, snackListe);
        }
        if (e.getSource() == zurückButton) { // Switch zwischen Panel und Frame
            zurückButton.setVisible(false);
            exitButton.setVisible(false);
            erhoehen.setVisible(false);
            erhoehen2.setVisible(false);
            fielder.setVisible(false);
            fielder2.setVisible(false);
            buttong.setVisible(false);
            buttons.setVisible(false);

            auswahl.setVisible(true);
            getraenk.setVisible(true);
            snack.setVisible(true);
            zurückButton2.setVisible(true);
            exitButton2.setVisible(true);
        }
        if (e.getSource() == getraenk) {
            zurückButton.setVisible(true);
            exitButton.setVisible(true);
            erhoehen.setVisible(true);
            fielder.setVisible(true);
            buttong.setVisible(true);

            auswahl.setVisible(false);
            getraenk.setVisible(false);
            snack.setVisible(false);
            zurückButton2.setVisible(false);
            exitButton2.setVisible(false);

        }
        if (e.getSource() == snack) {
            zurückButton.setVisible(true);
            exitButton.setVisible(true);
            erhoehen2.setVisible(true);
            fielder2.setVisible(true);
            buttons.setVisible(true);

            auswahl.setVisible(false);
            getraenk.setVisible(false);
            snack.setVisible(false);
            zurückButton2.setVisible(false);
            exitButton2.setVisible(false);

        }

        if (e.getSource() == erhoehen2) {
            if (fielder2.getValue() != null) {// Checkt ob etwas eingegeben wurde
                // Hier wird die eingegebene Zahl übergeben
                int anzahl2 = ((Number) fielder2.getValue()).intValue();

                if (anzahl2 >= 0) {// wenn die anzahl kleiner als Null ist soll das ausgewählte Item
                    Snacks selectedsnack = snackListe.get(buttons.getSelectedIndex());// erhoeht werden
                    selectedsnack.bestandErhoehen(anzahl2);
                }
            }
            Bestandsanzeige f = new Bestandsanzeige(getraenkeListe, snackListe);
        } // erhoehen2 Close
        if (e.getSource() == erhoehen) {

            if (fielder.getValue() != null) {

                // Hier wird die eingegebene Zahl übergeben
                int anzahl = ((Number) fielder.getValue()).intValue();

                if (anzahl >= 0) {
                    // Nimmt aus der Combobox was ausgewählt ist
                    Getraenk selectedgetraenk = getraenkeListe.get(buttong.getSelectedIndex());
                    selectedgetraenk.bestandErhoehen(anzahl);
                }

            }
            Bestandsanzeige f = new Bestandsanzeige(getraenkeListe, snackListe);
        } // erhoehen Close

    }// ActionListener Close
}// Body Close
