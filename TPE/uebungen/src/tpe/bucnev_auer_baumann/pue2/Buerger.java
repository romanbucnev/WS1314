package tpe.bucnev_auer_baumann.pue2;

public class Buerger extends Menschen {



	Buerger(String name, int alter, int einkommen) {
		super(name, alter, einkommen);
	}
	
	@Override
	public String toString() {
		return "Buerger [Name= " + name + ", Alter= " + alter + ", Einkommen="
				+ einkommen + "]";
	}
}
