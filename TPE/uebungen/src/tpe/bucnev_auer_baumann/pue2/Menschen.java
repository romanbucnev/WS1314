package tpe.bucnev_auer_baumann.pue2;

public class Menschen extends Einwohner {

	protected int alter;

	protected Menschen(String name, int einkommen,  int alter) {
		this.name = name;
		this.alter = alter;
		this.einkommen = einkommen;
	}

	protected int getAlter() {
		return alter;
	}

	@Override
	public String toString() {
		return "Menschen [Name= " + name + ", Alter= " + alter + ", Einkommen="
				+ einkommen + "]";
	}


}
