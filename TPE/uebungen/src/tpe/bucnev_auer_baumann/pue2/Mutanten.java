package tpe.bucnev_auer_baumann.pue2;

public abstract class Mutanten extends Einwohner {

	protected String superkraft;

	// public enum Superkraft{
	// FEUERBALL, LASERBLICK, EISSTRAHL
	// }
	Mutanten(String name, int einkommen, String superkraft) {
		this.name = name;
		this.einkommen = einkommen;
		this.superkraft = superkraft;
	}

	/**
	 * Absrakte Methode, um gegeneinander zu kaempfen
	 * 
	 * @return
	 */
	protected abstract boolean kaempfe(Mutanten mutant);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((superkraft == null) ? 0 : superkraft.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mutanten other = (Mutanten) obj;
		if (superkraft == null) {
			if (other.superkraft != null)
				return false;
		} else if (!superkraft.equals(other.superkraft))
			return false;
		return true;
	}

	// TODO equals methode nochmals �berpr�fen, ob sie sinn macht

	@Override
	public String toString() {
		return "Mutanten [Name= " + name + ", Einkommen= " + einkommen
				+ ", Superkraft= " + superkraft +  "]";
	}

}
