package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Matematica;

public class MatematicaTest {

	@Test
	public void test() {
		int s;
		Matematica m=new Matematica();
		s=m.suma(3, 5);
		assertEquals(8, s);
		
	}

}
