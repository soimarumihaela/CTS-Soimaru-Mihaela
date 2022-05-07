package main;

import clase.Meniu;
import clase.Subcategorie;
import clase.TipAliment;

public class Main {

	public static void main(String[] args) {
		
		
		Meniu meniu=new Meniu("Meniu Mimi");
		
		
		TipAliment bauturi=new TipAliment("Bauturi");
		TipAliment paste=new TipAliment("Paste");
		TipAliment desert=new TipAliment("Desert");
		
		
		Subcategorie cat1=new Subcategorie("Inghetata");
		Subcategorie cat4=new Subcategorie("Tiramisu");
		Subcategorie cat2=new Subcategorie("Carbonara");
		Subcategorie cat3=new Subcategorie("apa");
				
		
		meniu.adaugaItem(desert);
		meniu.adaugaItem(paste);
		meniu.adaugaItem(bauturi);
		
		desert.adaugaItem(cat1);
		desert.adaugaItem(cat4);
		paste.adaugaItem(cat2);
		
		bauturi.adaugaItem(cat3);
		
		
		meniu.descriere();
		
		
	}

}
