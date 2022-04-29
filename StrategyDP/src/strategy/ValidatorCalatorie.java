package strategy;

public class ValidatorCalatorie {
	
	private ModPlata modPlata;
	private double pret;
	
	public ValidatorCalatorie(double pret) {
		this.pret=pret;
		this.modPlata=new CardCalatorii();
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void platesteCalatorie() {
		modPlata.plateste(pret);
	}
	

}
