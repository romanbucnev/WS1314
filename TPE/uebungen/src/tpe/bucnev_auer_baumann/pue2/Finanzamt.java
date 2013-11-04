package TPE.uebungen.src.tpe.bucnev_auer_baumann.pue2;

import tpe.bucnev_auer_baumann.pue2.Gewerbesteuer;

import java.util.LinkedList;

public abstract class Finanzamt<e, k, g> implements Einkommenssteuer,
        Koerperschaftssteuer, Gewerbesteuer {

    private static final LinkedList<Einkommenssteuer> ListEinkommenssteuer = new LinkedList<Einkommenssteuer>();
    private static final LinkedList<Koerperschaftssteuer> ListKoerperschaftssteuer = new LinkedList<Koerperschaftssteuer>();
    private static final LinkedList<Gewerbesteuer> ListGewerbesteuer = new LinkedList<Gewerbesteuer>();

    // LinkedList list = new LinkedList();
    // Mutanten baer = new Schurken("Lutz", 20000, "Laseraugen", false);

    public static void EinkommenssteuerPlicht(Einkommenssteuer e) {
        // Laufe Liste durch, rechne einkommen zusammen und berechne nach formel
        ListEinkommenssteuer.add(e);
    }

    public static void KoeperschaftssteuerPflicht(Koerperschaftssteuer k) {
        // Laufe Liste durch, rechne einkommen zusammen und berechne nach formel
        ListKoerperschaftssteuer.add(k);
    }

    public static void GewerbesteuerPflicht(Gewerbesteuer g) {
        // Laufe Liste durch, rechne einkommen zusammen und berechne nach formel
        ListGewerbesteuer.add(g);
    }

//	public int berechneEinkommenssteuer() {
//        int summe = 0;
//        for (Einkommenssteuer e : ListEinkommenssteuer) {
//            summe = summe + e.berechneEinkommenssteuer();
//        }
//        return summe;
//    }
//	
//	public int berechneKoerperschaftssteuer() {
//        int summe = 0;
//        for (Koerperschaftssteuer k : ListKoerperschaftssteuer) {
//            summe = summe + k.berechneKoerperschaftssteuer();
//        }
//        return summe;
//    }
//
//    public int berechneGewerbesteuer() {
//        int summe = 0;
//        for (Gewerbesteuer g : ListGewerbesteuer) {
//            summe = summe + g.berechneGewerbesteuer();
//        }
//        return summe;
//    }
}
