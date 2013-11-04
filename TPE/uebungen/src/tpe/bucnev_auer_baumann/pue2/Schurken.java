package tpe.bucnev_auer_baumann.pue2;

public class Schurken extends Mutanten implements Einkommenssteuer {

    // Deklaration der Variablen
    boolean verurteilt = false;



    /**
     * Konstruktor
     * @param name
     * @param einkommen
     * @param superkraft
     * @param verurteilt
     * @param inSyndikat
     */
    Schurken(String name, int einkommen, String superkraft, boolean verurteilt, boolean inSyndikat) {
        super(name, einkommen, superkraft);
        this.verurteilt = verurteilt;

        //getInstance() gibt das einzige SchurkenSyndikat Objekt zurück und mit addSchurke(this) wird das aktuelle
        //Objekt von Schurke in die Liste listSchurkenSyndikat hinzugefügt.
        if (inSyndikat){
            SchurkenSyndikat.getInstance().addSchurke(this);
        }


    }

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
        return 0;
    }

    @Override
    public String toString() {
        return "Schurken [Name= " + name + ", Einkommen= " + einkommen
                + ", Superkraft= " + superkraft + ", Verurteilt= " + verurteilt
                + "]";
    }

}