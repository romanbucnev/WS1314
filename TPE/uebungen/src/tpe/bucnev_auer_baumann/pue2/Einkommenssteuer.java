package tpe.bucnev_auer_baumann.pue2;

public abstract class Einkommenssteuer extends Steuern {

	
	/**
	 * Konstruktor
	 * @param lineareSteuer
	 * @param progressiveSteuer
	 */
	private Einkommenssteuer(int lineareSteuer, int progressiveSteuer) {
		super(lineareSteuer, progressiveSteuer);
	}
}
