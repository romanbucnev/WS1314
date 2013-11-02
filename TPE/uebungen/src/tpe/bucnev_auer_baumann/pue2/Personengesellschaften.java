package tpe.bucnev_auer_baumann.pue2;

import java.util.LinkedList;

public class Personengesellschaften extends Unternehmen {

	Personengesellschaften(String name, int gewinn){
		this.unternehmensName = name;
		this.unternehmensGewinn = gewinn;
		LinkedList inhaber = new LinkedList();
		 //TODO Liste mit B�rgern f�llen
	}
}
