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

public class Verkaufsanzeige extends JFrame implements ActionListener {

    JFrame verkaufsAnzeige = new JFrame();

    JButton exitButton = new JButton();
    JButton exitButton2 = new JButton();
    JButton zurückButton = new JButton();
    JButton zurückButton2 = new JButton();
    JButton verkaufen = new JButton();
    JButton verkaufen2 = new JButton();
    JButton getraenk = new JButton();
    JButton snack = new JButton();
    JComboBox buttong = new JComboBox();
    JComboBox buttons = new JComboBox();
    JPanel auswahl = new JPanel();

    JFormattedTextField fielder;
    JFormattedTextField fielder2;

    private ArrayList<Getraenk> getraenkeListe;
    private ArrayList<Snacks> snackListe;

    private Snacks aktuellerSnack;
    private Getraenk aktuellesGetraenk;
    private String ausgabetext;

    public Verkaufsanzeige(ArrayList<Getraenk> getraenkeListe, ArrayList<Snacks> snackListe) {

        this.getraenkeListe = getraenkeListe;
        this.snackListe = snackListe;

        // Auswahl Buttons

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

        // Exit Zurück button

        exitButton.setVisible(true);
        exitButton.setBounds(190, 350, 200, 50);
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setText("EXIT");
        exitButton.setFocusable(false);
        exitButton.setBackground(new Color(0x0F0F1A));
        exitButton.setBorderPainted(false);
        exitButton.setFont(new Font(null, 1, 15));
        exitButton.setForeground(new Color(250, 250, 250));
        exitButton.setVisible(false);

        zurückButton.setBounds(410, 350, 200, 50);
        zurückButton.addActionListener(this);
        zurückButton.setText("Zurück");
        zurückButton.setFocusable(false);
        zurückButton.setBackground(new Color(0x0F0F1A));
        zurückButton.setBorderPainted(false);
        zurückButton.setFont(new Font(null, 1, 15));
        zurückButton.setForeground(new Color(250, 250, 250));
        zurückButton.setVisible(false);

        // Zurrück und Exit fürs Panel

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

        verkaufen.setBounds(300, 250, 200, 50);
        verkaufen.addActionListener(this);
        verkaufen.setText("VERKAUFEN");
        verkaufen.setFocusable(false);
        verkaufen.setBackground(new Color(0x0F0F1A));
        verkaufen.setBorderPainted(false);
        verkaufen.setFont(new Font(null, 1, 15));
        verkaufen.setForeground(new Color(250, 250, 250));
        verkaufen.setVisible(false);

        verkaufen2.setBounds(300, 250, 200, 50);
        verkaufen2.addActionListener(this);
        verkaufen2.setText("VERKAUFEN");
        verkaufen2.setFocusable(false);
        verkaufen2.setBackground(new Color(0x0F0F1A));
        verkaufen2.setBorderPainted(false);
        verkaufen2.setFont(new Font(null, 1, 15));
        verkaufen2.setForeground(new Color(250, 250, 250));
        verkaufen2.setVisible(false);

        fielder = new JFormattedTextField(NumberFormat.getNumberInstance());// Textfiel.numberformat damit nur Zahlen
                                                                            // Funktionieren
        fielder.setText("0");
        fielder.setColumns(2);
        fielder.setBounds(300, 150, 200, 50);
        fielder.setFont(new Font(null, 1, 15));
        fielder.setForeground(new Color(255, 255, 255));
        fielder.setBackground(new Color(0x0F0F1A));
        fielder.setVisible(false);

        fielder2 = new JFormattedTextField(NumberFormat.getNumberInstance());
        fielder2.setText("0");
        fielder2.setColumns(2);
        fielder2.setBounds(300, 150, 200, 50);
        fielder2.setFont(new Font(null, 1, 15));
        fielder2.setForeground(new Color(255, 255, 255));
        fielder2.setBackground(new Color(0x0F0F1A));
        fielder2.setVisible(false);

        buttong.setBounds(300, 50, 200, 50);
        buttong.setBackground(new Color(0x0F0F1A));
        buttong.setForeground(new Color(250, 250, 250));
        buttong.setFont(new Font(null, 1, 15));
        buttong.setFocusable(false);
        buttong.setVisible(false);

        buttons.setBounds(300, 50, 200, 50);
        buttons.setBackground(new Color(0x0F0F1A));
        buttons.setForeground(new Color(250, 250, 250));
        buttons.setFont(new Font(null, 1, 15));
        buttons.setFocusable(false);
        buttons.setVisible(false);

        for (Getraenk g : getraenkeListe) { // Durchlaufen der Arrays
            buttong.addItem(g.getName());// ArryList der ComboBox zufügen

        }

        for (Snacks s : snackListe) {
            buttons.addItem(s.getName());
        }

        auswahl.setBounds(0, 0, 800, 600);
        auswahl.setVisible(false);
        auswahl.setBackground(new Color(0x272640));

        verkaufsAnzeige.setLayout(null);
        verkaufsAnzeige.getContentPane().setBackground(new Color(0x272640));// Hintergrunfarbe(Rot/Gr�n/Blau)
        verkaufsAnzeige.setTitle("GETRAENKEVERWALTUNG");// Title des Frames
        verkaufsAnzeige.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Schlie�t das frame
        verkaufsAnzeige.setSize(800, 500);// setzt die X und Y demensionen des Frames
        verkaufsAnzeige.setResizable(false);// Sch�tzt das Frame vor Gr��en�nderungen
        verkaufsAnzeige.setLocationRelativeTo(null);

        verkaufsAnzeige.add(fielder);
        verkaufsAnzeige.add(fielder2);
        verkaufsAnzeige.add(buttong);
        verkaufsAnzeige.add(buttons);
        verkaufsAnzeige.add(snack);
        verkaufsAnzeige.add(getraenk);
        verkaufsAnzeige.add(verkaufen);
        verkaufsAnzeige.add(verkaufen2);
        verkaufsAnzeige.add(zurückButton);
        verkaufsAnzeige.add(exitButton);
        verkaufsAnzeige.add(zurückButton2);
        verkaufsAnzeige.add(exitButton2);
        verkaufsAnzeige.setVisible(true);// Macht das Frame sichtbar

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == zurückButton2) {
            MyFrame frame = new MyFrame(getraenkeListe, snackListe);
            verkaufsAnzeige.dispose();
        }
        if (e.getSource() == zurückButton) {// Switch Zwischen Panel und Frame
            zurückButton.setVisible(false);
            exitButton.setVisible(false);
            verkaufen.setVisible(false);
            verkaufen2.setVisible(false);
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
            verkaufen.setVisible(true);
            fielder.setVisible(true);
            buttong.setVisible(true);

            verkaufen2.setVisible(false);
            auswahl.setVisible(false);
            getraenk.setVisible(false);
            snack.setVisible(false);
            zurückButton2.setVisible(false);
            exitButton2.setVisible(false);

        }
        if (e.getSource() == snack) {
            zurückButton.setVisible(true);
            exitButton.setVisible(true);
            verkaufen2.setVisible(true);
            fielder2.setVisible(true);
            buttons.setVisible(true);

            verkaufen.setVisible(false);
            auswahl.setVisible(false);
            getraenk.setVisible(false);
            snack.setVisible(false);
            zurückButton2.setVisible(false);
            exitButton2.setVisible(false);

        }

        if (e.getSource() == verkaufen)
            if (fielder.getValue() != null) {
                // Hier wird die eingegebene Zahl übergeben
                int anzahl = ((Number) fielder.getValue()).intValue();

                if (anzahl >= 0) {
                    // Nimmt aus der Combobox was ausgewählt ist
                    Getraenk selectedgetraenk = getraenkeListe.get(buttong.getSelectedIndex());
                    ausgabetext = selectedgetraenk.rabattGeben(anzahl);

                }
                KassenzettelAusgabe test = new KassenzettelAusgabe(getraenkeListe, snackListe, ausgabetext);
            } // Verkaufen CLose
        if (e.getSource() == verkaufen2) {
            if (fielder2.getValue() != null) {
                // Hier wird die eingegebene Zahl übergeben
                int anzahl2 = ((Number) fielder2.getValue()).intValue();

                if (anzahl2 >= 0) {
                    // Nimmt aus der Combobox was ausgewählt ist
                    Snacks selectedsnack = snackListe.get(buttons.getSelectedIndex());
                    ausgabetext = selectedsnack.rabattGeben(anzahl2);
                }
                KassenzettelAusgabe test = new KassenzettelAusgabe(getraenkeListe, snackListe, ausgabetext);
            }
        } // Verkaufen2 Close

    }// Konstruktor Close
}// Body Close