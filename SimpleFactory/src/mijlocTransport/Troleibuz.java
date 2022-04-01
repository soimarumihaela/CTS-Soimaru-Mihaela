package mijlocTransport;

public class Troleibuz extends MijlocTransport {

	public Troleibuz(String nrInmatriculare) {
		super(nrInmatriculare);
		
	}

	@Override
	public void afisareNrInmatriculare() {
		System.out.println("Troleibuzul are nr de inmatriculare: ");
		System.out.println(super.getNrInmatriculare());
		
	}

}
