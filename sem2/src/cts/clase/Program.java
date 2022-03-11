package cts.clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) throws FileNotFoundException {
		List<Aplicant> listaAngajati;
		Reader reader = new AngajatReader();
		listaAngajati = reader.readAplicanti("angajati.txt");
		for (Aplicant angajat : listaAngajati) {
			System.out.println(angajat.toString());
			//aplicant.afisareAcceptanta();
			//aplicant
		}
			

	}
}