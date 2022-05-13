package command;

public class Autobuz {

	private String nrInmatriculare;

	public Autobuz(String nrInmatriculare) {
		
		this.nrInmatriculare = nrInmatriculare;
	}
	
	public void pleacaInCursa(int nrLinie) {
		System.out.println("Autobuzul cu nr de inmatriculare "+ nrInmatriculare +" a plecat pe traseul "+ nrLinie);
	}
	
	
}
