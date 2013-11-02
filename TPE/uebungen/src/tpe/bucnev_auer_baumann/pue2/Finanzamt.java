package tpe.bucnev_auer_baumann.pue2;

import java.util.LinkedList;

import de.hs_ma.ws_13.tpe_04_uib.auer_baummann_bucnev.metropolis.SchurkenSyndikat;

public abstract class Finanzamt<e, k, g> implements Einkommenssteuer,
        Koerperschaftssteuer, Gewerbesteuer {

    LinkedList<e> ListEinkommenssteuer = new LinkedList<e>();
    LinkedList<k> ListKoerperschaftssteuer = new LinkedList<k>();
    LinkedList<g> ListGewerbesteuer = new LinkedList<g>();

    // LinkedList list = new LinkedList();
    // Mutanten baer = new Schurken("Lutz", 20000, "Laseraugen", false);

    public int berechneEinkommenssteuer(e schurke) {
        // Laufe Liste durch, rechne einkommen zusammen und berechne nach formel
        ListEinkommenssteuer.add((e) schurke);
        return 0;

    }
}
