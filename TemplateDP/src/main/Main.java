package main;

import template.Tramvai;
import template.TramvaiProbe;

public class Main {

	public static void main(String[] args) {
		
		Tramvai tramvai=new Tramvai();
		
		tramvai.parcurgeSensNormal();
		tramvai.parcurgeSensInvers();
		
		TramvaiProbe tram=new TramvaiProbe();
		tram.parcurgeSensInvers();
		tram.parcurgeSensNormal();
		
	
		
		

	}

}
