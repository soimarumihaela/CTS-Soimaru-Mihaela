package clase;

import java.util.ArrayList;
import java.util.List;

public class TipAliment implements Item{

	
	String denumireCategorie;
	private List<Item> items;
	
	
	
	public TipAliment(String denumireCategorie) {
		
		this.denumireCategorie = denumireCategorie;
		this.items = new ArrayList<Item>();
	}

	@Override
	public void adaugaItem(Item item) {
		items.add(item);
			
	}

	@Override
	public void stergeItem(Item item) {
		items.remove(item);
		
	}

	@Override
	public void descriere() {
		System.out.println(this.denumireCategorie);
		for(Item item:items)
		{
			item.descriere();
		}
		
	}
	
	
	

	@Override
	public Item getItem(int poz) {
		
		return items.get(poz);
	}

}
