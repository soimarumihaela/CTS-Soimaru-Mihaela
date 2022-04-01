package fabrica;

import mijlocTransport.MijlocTransport;
import mijlocTransport.Tramvai;

public class FabricaTramvai implements AbstractFactory {

	@Override
	public MijlocTransport getMijlocTransport(String nrInmatriculare) {

		return new Tramvai(nrInmatriculare);
	}

}
