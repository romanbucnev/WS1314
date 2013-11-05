package tpe.bucnev_auer_baumann.pue2;
import java.util.ArrayList;

public class Personengesellschaften extends Unternehmen implements
        Einkommenssteuer, Gewerbesteuer {

    int steuerbetrag;
    private ArrayList<Buerger> inhaber = new ArrayList<Buerger>();

    /**
     * Konstrukto zur Erzeugung der Personengesellschaft
     *
     * @param name
     *            der Personengesellschaft
     * @param gewinn
     *            der Personengesellschaft
     */
    protected Personengesellschaften(String name, int gewinn,
                                     ArrayList<Buerger> inhaber) {
        super(name, gewinn);
        this.inhaber = inhaber;
    }

    /**
     * Methode, um den inhaber zu zuweisen
     *
     * @return inhaber
     */
    public ArrayList<Buerger> getInhaber() {
        return inhaber;
    }

    /**
     * Methode, um die Gewerbesteuer zu berechnen
     *
     * @return errechneter Steuerbetrag
     */
    public int berechneGewerbesteuer() {
        int steuerbetrag;
        steuerbetrag = (this.getGewinn() * Konstanten.LINEARERSTEUERSATZ_GEWERBE) / 100;

        if (steuerbetrag <= Konstanten.GEWERBE_STEUERABZUG) {
            return steuerbetrag - Konstanten.GEWERBE_STEUERABZUG;
        } else
            return 0;
    }

    /**
	 * Methode, um die Einkommensteuer zu berechnen
	 * 
	 * @return steuerbetrag betrag der die Höhe der Einkommensteuer liefert
	 */
	public int berechneEinkommenssteuer() {

		int grenze20k = (BERECHNUNGSGRENZE_20K * PROGRESSIVERSTEUERSATZ_EINKOMMEN1) / 100;
		int grenze40k = ((BERECHNUNGSGRENZE_20K * PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
				+ grenze20k;
		int grenze60k = ((BERECHNUNGSGRENZE_20K * PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
				+ grenze40k;
		int grenze120k = ((BERECHNUNGSGRENZE_60K * PROGRESSIVERSTEUERSATZ_EINKOMMEN3) / 100)
				+ grenze60k;

		if (gewinn <= 0) {
			return steuerbetrag = 0;
		} else if (gewinn <= BERECHNUNGSGRENZE_20K) {
			return steuerbetrag = (gewinn * PROGRESSIVERSTEUERSATZ_EINKOMMEN1) / 100;
		} else if (gewinn <= BERECHNUNGSGRENZE_60K) {
			return steuerbetrag = (((gewinn - BERECHNUNGSGRENZE_40K) * PROGRESSIVERSTEUERSATZ_EINKOMMEN2) / 100)
					+ grenze40k;
		} else if (gewinn <= BERECHNUNGSGRENZE_120K) {
			return steuerbetrag = (((gewinn - BERECHNUNGSGRENZE_60K) * PROGRESSIVERSTEUERSATZ_EINKOMMEN3) / 100)
					+ grenze60k;
		} else {
			return steuerbetrag = (((gewinn - BERECHNUNGSGRENZE_120K) * PROGRESSIVERSTEUERSATZ_EINKOMMEN4) / 100)
					+ grenze120k;
		}
	}

}
