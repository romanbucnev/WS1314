package tpe.bucnev_auer_baumann.pue2;

import static de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis.Konstanten.*;

public class Buerger extends Menschen implements Einkommenssteuer {

    int steuerbetrag;

    Buerger(String name, int alter, int einkommen) {
        super(name, alter, einkommen);
    }

    @Override
    public int berechneEinkommenssteuer() {
        if(einkommen <= 20000){
            return steuerbetrag = (einkommen * PROGRESSIVERSTEUERSATZ_EINKOMMEN1 ) / 100;
        }

        if(einkommen < 20000 && einkommen <= 40000)
            return
    }

    @Override
    public String toString() {
        return "Buerger [Name= " + name + ", Alter= " + alter + ", Einkommen="
                + einkommen + "]";
    }

}
