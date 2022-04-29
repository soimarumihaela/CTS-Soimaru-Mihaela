package strategy;

public class Sms implements ModPlata {

	@Override
	public void plateste(double suma) {
		System.out.println("Suma " +suma+" a fost platita prin sms");
		
	}

}
