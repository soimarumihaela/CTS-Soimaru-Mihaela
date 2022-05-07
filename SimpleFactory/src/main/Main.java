package main;


import fabrica.Fabrica;
import mijlocTransport.MijlocTransport;
import mijlocTransport.TipTransport;

public class Main {
	public static void main(String [] args) {
		Fabrica fabrica=new Fabrica();
		
	MijlocTransport autobuz=fabrica.getMijlocTransport(TipTransport.Autobuz, "B20STB");
	MijlocTransport tramvai=fabrica.getMijlocTransport(TipTransport.Tramvai, "B30STB");
	MijlocTransport troleibuz=fabrica.getMijlocTransport(TipTransport.Troleibuz, "B40STB");
	
	autobuz.afisareNrInmatriculare();
	tramvai.afisareNrInmatriculare();
	troleibuz.afisareNrInmatriculare();
		
	}
	
}
