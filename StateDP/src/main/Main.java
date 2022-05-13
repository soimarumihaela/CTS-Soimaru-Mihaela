package main;

import state.Autobuz;
import state.InCursa;

public class Main {

	public static void main(String[]args) {
		Autobuz autobuz=new Autobuz("108");
		autobuz.pleacaInCursa();
		autobuz.laCapatDeLinie();
		autobuz.ieseDinService();
		autobuz.intraInService();
		autobuz.ieseDinService();
		autobuz.laCapatDeLinie();
		autobuz.pleacaInCursa();
	}
}
