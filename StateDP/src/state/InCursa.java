package state;

public class InCursa implements State{

	@Override
	public void schimbaStare(Autobuz autobuz) {
		if(autobuz.getStare() instanceof LaCapatDeLinie)
		{
			System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" a plecat in cursa");
			autobuz.setStare(this);
		}else {
			System.out.println("Autobuzul nu a plecat in cursa");
		}
		
	}

}
