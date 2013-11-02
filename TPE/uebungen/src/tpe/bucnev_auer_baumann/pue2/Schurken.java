package tpe.bucnev_auer_baumann.pue2;

public class Schurken extends Mutanten {
		boolean verurteilt = false;

	Schurken(String name, int einkommen, String superkraft, boolean verurteilt) {
		super(name, einkommen, superkraft);
		this.verurteilt = verurteilt;

	}

	@Override
	protected boolean kaempfe(Mutanten mutant) {
		if (this.superkraft.equals(mutant.superkraft)) {
			return false; // schurke verliert
		} else {
			return true; // schurke gewinnt
		}
	}

	@Override
	public String toString() {
		return "Schurken [Name= " + name + ", Einkommen= " + einkommen
				+ ", Superkraft= " + superkraft + ", Verurteilt= " +  verurteilt + "]";
	}

}
