import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Bestandsanzeige {

    JTable table = new JTable();
    JTable table2 = new JTable();

    DefaultTableModel tableModel = new DefaultTableModel();
    JFrame f = new JFrame();

    ArrayList<Getraenk> getraenkeListe;
    ArrayList<Snacks> snackListe;

    public Bestandsanzeige(ArrayList<Getraenk> getraenkeListe, ArrayList<Snacks> snackListe) {

        // Spalten bennen

        tableModel.addColumn("Name");
        tableModel.addColumn("Bestand");
        tableModel.addColumn("Preis");
        tableModel.addColumn("Gewicht");
        tableModel.addColumn("Hersteller");
        tableModel.addColumn("Lagerung");
        tableModel.addColumn("Verfallsdatum");
        tableModel.addColumn("Barcode");

        // Arrylist for-Schleife
        for (Getraenk g : getraenkeListe) {
            // Hier wird für jeden Zeile ein neues Objekt eingefügt, aufgrund des
            // durchlauf der ArryList mit der for_Schleife
            tableModel.insertRow(0, new Object[] { g.getName(), g.getBestand(), g.getPreis(), g.getGewicht(),
                    g.getHersteller(), g.getLagerung(), g.getVerfallsdatum(), g.getBarcode() });
            // adding a new row
            tableModel.insertRow(tableModel.getRowCount(), new Object[] {});
        }

        for (Snacks s : snackListe) {

            JTable table = new JTable(tableModel);

            tableModel.insertRow(0, new Object[] { s.getName(), s.getBestand(), s.getPreis(), s.getGewicht(),
                    s.getHersteller(), s.getLagerung(), s.getVerfallsdatum(), s.getBarcode() });

            // adding a new row
            tableModel.insertRow(tableModel.getRowCount(), new Object[] {});

            f.setSize(1000, 300);
            f.add(new JScrollPane(table));
            f.setResizable(false);
            f.setDefaultCloseOperation(f.HIDE_ON_CLOSE);
            f.setVisible(true);
            f.setLocationRelativeTo(null);
        }

        this.getraenkeListe = getraenkeListe;
        this.snackListe = snackListe;
    }
}
