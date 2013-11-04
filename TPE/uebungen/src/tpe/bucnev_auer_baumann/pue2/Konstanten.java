package tpe.bucnev_auer_baumann.pue2;

/**
 * Klasse, um die Konstanten festzulegen die innerhalb des Programms zur
 * Berechnung der Steuer genutzt werden.
 *
 * @author Patric Auer
 * @author Romna Bucnev
 * @author Tobias Baumann
 *
 */
public class Konstanten {

    /**
     * Steuersaetze zur Berechnung der verschiedenen Steuerarten
     */
    public static final int LINEARERSTEUERSATZ_KOERPER = 25;
    public static final int LINEARERSTEUERSATZ_GEWERBE = 10;
    public static final int PROGRESSIVERSTEUERSATZ_EINKOMMEN1 = 10;
    public static final int PROGRESSIVERSTEUERSATZ_EINKOMMEN2 = 25;
    public static final int PROGRESSIVERSTEUERSATZ_EINKOMMEN3 = 35;
    public static final int PROGRESSIVERSTEUERSATZ_EINKOMMEN4 = 50;

    /**
     * Abzuziehender Betrag bei Berechnung der Gewerbesteuer
     */
    public static final int GEWERBE_STEUERABZUG = 1000;

    /**
     * Grenzwerte für die Berechnung der Einkommensteuer
     */
    public static final int BERECHNUNGSGRENZE_20K = 20000;
    public static final int BERECHNUNGSGRENZE_40K = 40000;
    public static final int BERECHNUNGSGRENZE_60K = 60000;
    public static final int BERECHNUNGSGRENZE_120K = 120000;
}
