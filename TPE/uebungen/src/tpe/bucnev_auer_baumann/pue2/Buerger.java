package tpe.bucnev_auer_baumann.pue2;

import  tpe.bucnev_auer_baumann.pue2.Konstanten;

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

        if(einkommen < 20000 && einkommen <= 40000) {
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Buerger [Name= " + name + ", Alter= " + alter + ", Einkommen="
                + einkommen + "]";
    }

}
