package main;

import fabrica.FabricaAutobuz;
import fabrica.FabricaTramvai;
import fabrica.FabricaTroleibuz;
import mijlocTransport.MijlocTransport;

public class Main {
	
	public static void main(String[] args) {
		
		MijlocTransport autobuz=new FabricaAutobuz().getMijlocTransport("B90MIM");
		MijlocTransport tramvai= new FabricaTramvai().getMijlocTransport("B56MUM");
		MijlocTransport troleibuz= new FabricaTroleibuz().getMijlocTransport("B56NUU");
		
		autobuz.afisareNrInmatriculare();
		tramvai.afisareNrInmatriculare();
		troleibuz.afisareNrInmatriculare();
	}

}
