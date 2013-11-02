package tpe.bucnev_auer_baumann.pue2;

public abstract class Gewerbesteuer extends Steuern {
	
	/**
	 * Konstruktor
	 * @param lineareSteuer
	 * @param progressiveSteuer
	 */
	private Gewerbesteuer(int lineareSteuer, int progressiveSteuer){
		super(lineareSteuer, progressiveSteuer);
	}

}
