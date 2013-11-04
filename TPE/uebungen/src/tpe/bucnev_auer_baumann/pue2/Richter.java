package tpe.bucnev_auer_baumann.pue2;

public class Richter extends Menschen {

    private boolean korrupt;

    protected Richter(String name, int alter, int einkommen, boolean korrupt) {
        super(name, alter, einkommen);
        this.korrupt = korrupt;
    }


    /**
     * Methode zur Bestimmung, ob ein Schurke verurteilt wird, mithilfe der Überprüfung der Korruption
     * @param schurke
     * @return Schurke wird verurteilt oder Schurke wird nicht verurteilt
     */
    protected boolean verurteilt(Schurken schurke) {
        if(this.korrupt){
            return schurke.verurteilt = false;
        } else{
            return schurke.verurteilt = true;
        }
    }


    @Override
    public String toString() {
        return "Richter [Name= " + name + ", Alter= " + alter + ", Einkommen="
                + einkommen + ", Korrupt= " + korrupt +  "]";
    }


}