package tpe.bucnev_auer_baumann.pue2;

import java.util.ArrayList;

public  class Unternehmen {
    protected String unternehmensName;
    protected int unternehmensGewinn;
    ArrayList gesamteListe = new ArrayList();

    //TODO Listen aus PG und KG zusammenf�hren in gesamteListe

    protected Unternehmen(String unternehmensName, int unternehmensGewinn) {
        this.unternehmensName = unternehmensName;
        this.unternehmensGewinn = unternehmensGewinn;
    }

    public int getGewinn() {
        return unternehmensGewinn;
    }

    Unternehmen(){

    }
}


