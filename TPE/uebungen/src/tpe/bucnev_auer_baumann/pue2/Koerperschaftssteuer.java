package tpe.bucnev_auer_baumann.pue2;

public abstract class Koerperschaftssteuer extends Steuern {

	/**
	 * Konstruktor
	 * @param lineareSteuer
	 * @param progrssiveSteuer
	 */
	private Koerperschaftssteuer(int lineareSteuer, int progrssiveSteuer) {
		super(lineareSteuer, progrssiveSteuer);

	}

}
