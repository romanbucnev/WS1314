package tpe.bucnev_auer_baumann.pue2;

import java.util.ArrayList;

public class SchurkenSyndikat implements Koerperschaftssteuer {

//Singleton, geht nur weil ein einziges Objekt vorhanden ist und durch das private kann kein neues Objekt von außen angelegt werden
//dient dazu, um auf dieses einzelne Objekt von überall zugreifen zu können

    /**
     * Konstruktor
     */
    private SchurkenSyndikat(){
         Finanzamt.KoeperschaftssteuerPflicht(this);
    }


    static SchurkenSyndikat getInstance(){
                 return instance;
    }

    private static SchurkenSyndikat instance = new SchurkenSyndikat();

 //Ende Singleton


    ArrayList<Schurken> listSchurkenSyndikat = new ArrayList<Schurken>();

    public void addSchurke(Schurken schurke){
        listSchurkenSyndikat.add(schurke);


    }

    @Override
    public int berechneKoerperschaftssteuer() {

        int summeEinkommen = 0;

        for( Schurken schurk : listSchurkenSyndikat) {

            summeEinkommen = summeEinkommen + schurk.getEinkommen();

        }

        return ((summeEinkommen/100) * Konstanten.LINEARERSTEUERSATZ_KOERPER);
    }
}