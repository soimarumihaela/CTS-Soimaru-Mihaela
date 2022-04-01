package fabrica;


import mijlocTransport.Autobuz;
import mijlocTransport.MijlocTransport;

public class FabricaAutobuz implements AbstractFactory{

	@Override
	public MijlocTransport getMijlocTransport(String nrInmatriculare) {
		
		return new Autobuz(nrInmatriculare);
	}

	
}
