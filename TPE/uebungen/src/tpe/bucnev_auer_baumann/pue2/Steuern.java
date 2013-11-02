package tpe.bucnev_auer_baumann.pue2;

public abstract class Steuern {


    protected int steuerermaessigung = 1000; // 1000 Metro-Dollar
    protected int gewinn;
    protected int steuerbetrag;

    public Steuern(int linearerSteuersatz, int progressiverSteuersatz) {
        this.linearerSteuersatz = linearerSteuersatz;
        this.progressiverSteuersatz = progressiverSteuersatz;
    }

    public abstract int berechneSteuer();

    public String toString(){
        return "
    }

}
