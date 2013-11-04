package tpe.bucnev_auer_baumann.pue2;

import tpe.bucnev_auer_baumann.pue2.Buerger;
import tpe.bucnev_auer_baumann.pue2.Gewerbesteuer;
import tpe.bucnev_auer_baumann.pue2.Koerperschaftssteuer;
import tpe.bucnev_auer_baumann.pue2.Konstanten;

import java.util.LinkedList;

public class Kapitalgesellschaften extends Unternehmen implements
        Koerperschaftssteuer, Gewerbesteuer {

       //Test

    private LinkedList<Buerger> gesellschafter = new LinkedList<Buerger>();

    /**
     * Konstruktor
     * @param unternehmensName
     * @param unternehmensGewinn
     * @param gesellschafter
     */
    public Kapitalgesellschaften(String unternehmensName,
                                 int unternehmensGewinn, LinkedList<Buerger> gesellschafter) {
        super(unternehmensName, unternehmensGewinn);
        this.gesellschafter = gesellschafter;
        Finanzamt.KoeperschaftssteuerPflicht(this);
        Finanzamt.GewerbesteuerPflicht(this);
    }


    public LinkedList<Buerger> getGesellschafter() {
        return gesellschafter;
    }

    @Override
    public int berechneKoerperschaftssteuer() {
        return (this.getGewinn() / 100) * Konstanten.LINEARERSTEUERSATZ_KOERPER;
    }

    @Override
    public int berechneGewerbesteuer() {
        return (this.getGewinn() / 100) * 10;
    }

}
