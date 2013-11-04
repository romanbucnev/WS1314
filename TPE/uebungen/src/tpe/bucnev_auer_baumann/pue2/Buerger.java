package tpe.bucnev_auer_baumann.pue2;

/**
 * Klasse, in der die Einkommensteuer der Buerger von Metropolis berechnet wird
 *
 * @author Patric Auer
 * @author Roman Bucnev
 * @author Tobias Baumann
 *
 */
public class Buerger extends Menschen implements Einkommenssteuer {

    int steuerbetrag;

    /**
     * Konstruktor zur Erzeugung eines Buerger
     *
     * @param name
     *            des Buerrger
     * @param alter
     *            des Buerger
     * @param einkommen
     *            des Buerger
     */
    Buerger(String name, int alter, int einkommen) {
        super(name, alter, einkommen);
    }

    /**
     * Methode, um die Einkommensteuer zu berechnen
     *
     * @return steuerbetrag betrag der die Höhe der Einkommensteuer liefert
     */
    public int berechneEinkommenssteuer() {

        int grenze20k = (Konstanten.BERECHNUNGSGRENZE_20K * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN1) / 100;
        int grenze40k = ((Konstanten.BERECHNUNGSGRENZE_20K * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
                + grenze20k;
        int grenze60k = ((Konstanten.BERECHNUNGSGRENZE_20K * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
                + grenze40k;
        int grenze120k = ((Konstanten.BERECHNUNGSGRENZE_60K * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN3) / 100)
                + grenze60k;

        if (einkommen <= 0) {
            return steuerbetrag = 0;
        } else if (einkommen <= Konstanten.BERECHNUNGSGRENZE_20K) {
            return steuerbetrag = (einkommen * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN1) / 100;
        } else if (einkommen <= Konstanten.BERECHNUNGSGRENZE_60K) {
            return steuerbetrag = (((einkommen - Konstanten.BERECHNUNGSGRENZE_40K) * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
                    + grenze40k;
        } else if (einkommen <= Konstanten.BERECHNUNGSGRENZE_120K) {
            return steuerbetrag = (((einkommen - Konstanten.BERECHNUNGSGRENZE_60K) * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN3) / 100)
                    + grenze60k;
        } else {
            return steuerbetrag = (((einkommen - Konstanten.BERECHNUNGSGRENZE_120K) * Konstanten.PROGRESSIVERSTEUERSATZ_EINKOMMEN4) / 100)
                    + grenze120k;
        }
    }

    @Override
    public String toString() {
        return "Buerger [steuerbetrag=" + steuerbetrag + "]";
    }

}