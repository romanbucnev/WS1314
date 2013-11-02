package tpe.bucnev_auer_baumann.pue2;

import java.util.LinkedList;

public class SchurkenSyndikat implements Koerperschaftssteuer {

    private int einkommen = 20000;
    private int steuerbetragSyndikat;

    public int getSteuern() {
        return berechneKoerperschaftssteuer();
    }

    @Override
    public int berechneKoerperschaftssteuer() {
        return steuerbetragSyndikat = (einkommen * LINEARERSTEUERSATZ_KOERPER) / 100;
    }

    LinkedList<Schurken> ListSchurkenSyndikat = new LinkedList<Schurken>();

    public LinkedList<Schurken> getListSchurkenSyndikat() {
        return ListSchurkenSyndikat;
    }
}