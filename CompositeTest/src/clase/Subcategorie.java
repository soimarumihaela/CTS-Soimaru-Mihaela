package clase;

public class Subcategorie implements Item{

	String numeAliment;
	
	
	public Subcategorie(String numeAliment) {
	
		this.numeAliment = numeAliment;
	}

	@Override
	public void adaugaItem(Item item) {
		System.out.println("Nu se mai pot adauga iteme");
		
	}

	@Override
	public void stergeItem(Item item) {
		System.out.println("Nu se pot sterge. ");
		
	}

	@Override
	public void descriere() {
		System.out.println(this.numeAliment);
		
	}

	@Override
	public Item getItem(int poz) {
		System.out.println("Nu se poate obtine");
		return null;
	}

}
