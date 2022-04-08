package main;

import facade.Autobuz;
import facade.Facade;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz= new Autobuz();
		Facade.deschideUsi(autobuz);
		Facade.elibereazaUsi(autobuz);

	}

}
