package fabrica;

import mijlocTransport.Autobuz;
import mijlocTransport.MijlocTransport;
import mijlocTransport.TipTransport;
import mijlocTransport.Tramvai;
import mijlocTransport.Troleibuz;

public class Fabrica {

	public MijlocTransport getMijlocTransport (TipTransport tip, String nrInmatriculare) {
		switch(tip)
		{
		case Autobuz: 
			return new Autobuz(nrInmatriculare);
		
		case Tramvai:
			return new Tramvai(nrInmatriculare);
			
		case Troleibuz:
			return new Troleibuz(nrInmatriculare);
			
		default:
			return null;
			
		}
		
	}
}
