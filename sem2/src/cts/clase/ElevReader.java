package cts.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends Reader {

	@Override
	public List<Aplicant> readAplicanti(String file) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(file));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		scanner.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Elev elev=new Elev();
			readDateAplicant(scanner, elev);
			int clasa = scanner.nextInt();
			String tutore = scanner.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		scanner.close();
		return elevi;
	}

}