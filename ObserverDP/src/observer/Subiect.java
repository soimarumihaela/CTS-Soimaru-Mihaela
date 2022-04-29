package observer;

public interface Subiect {
	
	public void adaugaObserver(Observer obs);
	public void elminaObserver(Observer obs);
	
	public void anuntaCalator();

}
