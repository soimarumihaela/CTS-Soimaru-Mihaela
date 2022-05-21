package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import acs.clase.Persoana;
import exceptii.CNPInvalidException;

public class GetVarstaTest {

	
	@Test
	public void getVarstaRight() {
		Persoana p=new Persoana("Mimi","6010114122145");
		assertEquals(21, p.getVarsta());
	}
	
	@Test
	public void getVarstaBoundaryInferior() {
		Persoana p=new Persoana("Mimi","4000101122145");
		assertEquals(222, p.getVarsta());
	}
	@Test
	public void getVarstaBoundarySuperior() {
		Persoana p=new Persoana("Mimi","6220101122145");
		assertEquals(0, p.getVarsta());
	}
	
	@Test(expected=NullPointerException.class)
	public void getVarstaErrorNull() {
		Persoana p=new Persoana("Mimi",null);
		p.getVarsta();
	}
	
	@Test(expected=CNPInvalidException.class)
	public void getVarstaErrorCNPInvalid() {
		Persoana p=new Persoana("Mimi","6250112188157");
		p.getVarsta();
	}
	
	@Test(timeout=100)
	public void getVarstaPerformance()
	{
		Persoana p=new Persoana("Mimi","6010114122145");
		p.getVarsta();
		
	}
	
	@Test
	public void getVarstaOrder()
	{
		Persoana p1=new Persoana("Mimi","6010114122145");
		Persoana p2=new Persoana("Ana","6000114122145");
		assertTrue(p2.getVarsta()>p1.getVarsta());
	}
	
	@Test
	public void getVarsta1An()
	{
		Persoana p=new Persoana("Mimi","6210122896745");
		assertEquals(1, p.getVarsta());
	}
	
	//de facut pt checkCNP
	
	
	

}
