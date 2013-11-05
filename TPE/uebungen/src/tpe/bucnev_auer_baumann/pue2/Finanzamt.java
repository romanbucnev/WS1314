package tpe.bucnev_auer_baumann.pue2;
import java.util.ArrayList;

public class Finanzamt{

    private static final ArrayList<Einkommenssteuer> ListEinkommenssteuer = new ArrayList<Einkommenssteuer>();
    protected static final ArrayList<Koerperschaftssteuer> ListKoerperschaftssteuer = new ArrayList<Koerperschaftssteuer>();
    private static final ArrayList<Gewerbesteuer> ListGewerbesteuer = new ArrayList<Gewerbesteuer>();



    public static void EinkommenssteuerPlicht(Einkommenssteuer e) {
        ListEinkommenssteuer.add(e);
    }

    public static void KoeperschaftssteuerPflicht(Koerperschaftssteuer k) {

        ListKoerperschaftssteuer.add(k);

    }

    public static void GewerbesteuerPflicht(Gewerbesteuer g) {

        ListGewerbesteuer.add(g);
    }


}
