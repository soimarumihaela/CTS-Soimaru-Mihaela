package state;

public class LaReparat implements State {

	@Override
	public void schimbaStare(Autobuz autobuz) {
		if(autobuz.getStare()instanceof LaCapatDeLinie) {
			System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" intra in service");
			autobuz.setStare(this);
		}
		else
		{
			System.out.println("Autobuzul nu poate fi trimis la reparat");
		}
		
	}

}
