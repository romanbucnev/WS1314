package tpe.bucnev_auer_baumann.pue2;

public class Schurken extends Mutanten implements Einkommenssteuer {

    // Deklaration der Variablen
    boolean verurteilt = false;

    //Konstruktor
    Schurken(String name, int einkommen, String superkraft, boolean verurteilt) {
        super(name, einkommen, superkraft);
        this.verurteilt = verurteilt;

    }

    // Objekt
    Schurken schurke = new Schurken("Lutz", 20000, "Laseraugen", false);


    //Methoden
    @Override
    protected boolean kaempfe(Mutanten mutant) {
        if (this.superkraft.equals(mutant.superkraft)) {
            return false; // schurke verliert
        } else {
            return true; // schurke gewinnt
        }
    }

    @Override
    public int berechneEinkommenssteuer() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Schurken [Name= " + name + ", Einkommen= " + einkommen
                + ", Superkraft= " + superkraft + ", Verurteilt= " + verurteilt
                + "]";
    }

}