package state;

public class Autobuz {
	private State stare;
	private String nrAutobuz;
	
	public State getStare() {
		return stare;
	}
	protected void setStare(State stare) {
		this.stare = stare;
	}
	public String getNrAutobuz() {
		return nrAutobuz;
	}
	public void setNrAutobuz(String nrAutobuz) {
		this.nrAutobuz = nrAutobuz;
	}
	public Autobuz(String nrAutobuz) {
	
		this.nrAutobuz = nrAutobuz;
		this.stare=new LaCapatDeLinie();
	}
	
	public void pleacaInCursa() {
		InCursa autobuzInCursa=new InCursa();
		autobuzInCursa.schimbaStare(this);
		
	}
	public void intraInService() {
		LaReparat autobuzLaReparat=new LaReparat();
		autobuzLaReparat.schimbaStare(this);
	}
	public void ieseDinService() {
		LaCapatDeLinie autobuzLaCapatDeLinie=new LaCapatDeLinie();
		autobuzLaCapatDeLinie.schimbaStare(this);
	}
	public void laCapatDeLinie() {
		LaCapatDeLinie laCapat=new LaCapatDeLinie();
		laCapat.schimbaStare(this);
	}
	
	

}
