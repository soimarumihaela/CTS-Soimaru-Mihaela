package fabrica;

import mijlocTransport.MijlocTransport;
import mijlocTransport.Troleibuz;

public class FabricaTroleibuz implements AbstractFactory {

	@Override
	public MijlocTransport getMijlocTransport(String nrInmatriculare) {
		
		return new Troleibuz(nrInmatriculare);
	}

}
