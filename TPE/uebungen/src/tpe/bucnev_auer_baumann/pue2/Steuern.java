package tpe.bucnev_auer_baumann.pue2;

public abstract class Steuern {

	/**
	 * Deklaration der Variablen
	 */
	protected int lineareSteuer;
	protected int progressiveSteuer;

	/**
	 * Konstruktor, zur Erzeugung des Steuersatzes
	 * 
	 * @param lineareSteuer
	 * @param progressiveSteuer
	 * 
	 */
	public Steuern(int lineareSteuer, int progressiveSteuer) {
		this.lineareSteuer = lineareSteuer;
		this.progressiveSteuer = progressiveSteuer;
	}

	/**
	 * Abstrakte Methode, um die Steuern zu berechnen
	 * 
	 * @return
	 */
	protected abstract int berechneSteuern();

}
