package state;

public class LaCapatDeLinie implements State {

	@Override
	public void schimbaStare(Autobuz autobuz) {
		if(!(autobuz.getStare()instanceof LaCapatDeLinie)) {
			System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" a ajuns la capat de linie");
			autobuz.setStare(this);
		}
		else {
			System.out.println("Autobuzul nu a ajuns la capat de linie");
		}
		
	}
	

}
