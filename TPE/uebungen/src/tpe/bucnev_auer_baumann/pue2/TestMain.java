package tpe.bucnev_auer_baumann.pue2;

public class TestMain {

	public static void main(String[] args) {

		//Mutanten ha = new Schurken("Roman", 21, "Laser", false, false);
		//Mutanten held = new Superhelden("Lutzi", 22, "Laser");
//		held.kaempfe(ha);
		
		
		//Richter ja = new Richter("Richy", 34, 2000, false);
		Schurken shrek = new Schurken("Shrek", 200, "Feuer", false, true);
       // Schurken peter = new Schurken("Peter", 300, "Wasser", false, true);
		// ja.verurteilt(shrek);

      //  System.out.println(SchurkenSyndikat.getInstance());
		// System.out.println(SchurkenSyndikat.getInstance().berechneKoerperschaftssteuer());

         Unternehmen unti = new Kapitalgesellschaften("RB GmbH", 2000);


		  System.out.println(Finanzamt.ListKoerperschaftssteuer);
	}

}
