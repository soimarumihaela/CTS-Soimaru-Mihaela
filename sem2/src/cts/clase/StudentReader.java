package cts.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends Reader {

	@Override
	public List<Aplicant> readAplicanti(String file) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}
	
		scanner.useDelimiter(",|\n");
		List<Aplicant> aplicanti = new ArrayList<>();

		while (scanner.hasNext()) {
			Student student=new Student();
			readDateAplicant(scanner, student);
			int an_studii = scanner.nextInt();
			String facultate = (scanner.next()).toString();
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
			aplicanti.add(student);
		}
		scanner.close();
		return aplicanti;
	}

}