package tpe.bucnev_auer_baumann.pue2;


import java.util.ArrayList;

public class Kapitalgesellschaften extends Unternehmen implements
        Koerperschaftssteuer, Gewerbesteuer {

    private ArrayList<Buerger> gesellschafter = new ArrayList<Buerger>();
    private  ArrayList<Kapitalgesellschaften> listKapitalgesellschaften = new ArrayList<Kapitalgesellschaften>();

    /**
     * Konstruktor
     * @param unternehmensName
     * @param unternehmensGewinn
     */
    public Kapitalgesellschaften(String unternehmensName,
                                 int unternehmensGewinn) {
        super(unternehmensName, unternehmensGewinn);
        this.gesellschafter = gesellschafter;
        Finanzamt.KoeperschaftssteuerPflicht(this);
       // Finanzamt.GewerbesteuerPflicht(this);
    }

    public void addKapitalgesellschaft(Kapitalgesellschaften kapitalgesellschaften){
        listKapitalgesellschaften.add(kapitalgesellschaften);
    }


    public ArrayList<Buerger> getGesellschafter() {
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

    @Override
    public String toString() {
        return "Kapitalgesellschaften{" +
                "Unternehmensname=" + unternehmensName +
                ", Unternehmensgewinn=" + unternehmensGewinn +
                '}';
    }
}
