package tpe.bucnev_auer_baumann.pue2;

public class Superhelden extends Mutanten {

	Superhelden(String name, int einkommen, String superkraft) {
		super(name, einkommen, superkraft);
	}

	//TODO Superheld hat mehrere Superkr�fte. Mehrere Parameter �bergeben?
	
	@Override
	protected boolean kaempfe(Mutanten mutant) {
		if (this.superkraft.equals(mutant.superkraft)) {
			return true; // superheld gewinnt
		} else {
			return false; // superheld verliert
		}
	}

	@Override
	public String toString() {
		return "Superhelden [Name= " + name + ", Einkommen= " + einkommen
				+ ", Superkraft= " + superkraft + "]";
	}

}
