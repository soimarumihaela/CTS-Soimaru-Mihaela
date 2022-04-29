package observer;

public class Calator implements Observer  {

	String nume;


	public Calator(String nume) {
		
		this.nume = nume;
	}


	@Override
	public void primesteAnunt(String anunt) {
		System.out.println(nume+" Ai primit anuntul: "+anunt);
	}

}
