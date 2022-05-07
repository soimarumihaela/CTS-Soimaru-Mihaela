package clase;

import java.util.ArrayList;
import java.util.List;

public class Meniu implements Item{

	private String nume;
	private List<Item> items;
	
	
	
	public Meniu(String nume) {
		
		this.nume = nume;
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
		System.out.println(this.nume);
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
