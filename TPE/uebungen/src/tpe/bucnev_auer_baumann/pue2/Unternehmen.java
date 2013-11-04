package TPE.uebungen.src.tpe.bucnev_auer_baumann.pue2;

import java.util.LinkedList;


public  class Unternehmen {
    protected String unternehmensName;
    protected int unternehmensGewinn;
    LinkedList gesamteListe = new LinkedList();

    //TODO Listen aus PG und KG zusammenf�hren in gesamteListe

    protected Unternehmen(String unternehmensName, int unternehmensGewinn) {
        this.unternehmensName = unternehmensName;
        this.unternehmensGewinn = unternehmensGewinn;
    }

    public int getGewinn() {
        return unternehmensGewinn;
    }
}


