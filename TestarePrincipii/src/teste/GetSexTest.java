package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Time;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.engine.execution.ExecutableInvoker;

import acs.clase.Persoana;
import exceptii.CNPInvalidException;

class GetSexTest {

	
	@Test
	public void getSexRight() {
		Persoana pF=new Persoana("Iulia", "6010114100135");
		assertEquals("F", pF.getSex());
		Persoana pM=new Persoana("Ion", "5010114100135");
		assertEquals("M", pM.getSex());
		
	}
	
	@Test
	public void getSexBoundaryF() {
		Persoana pF=new Persoana("Iulia", "6010114100135");
		assertEquals("F", pF.getSex());
	
	}
	@Test
	public void getSexBoundaryM() {
		
		Persoana pM=new Persoana("Ion", "1010114100135");
		assertEquals("M", pM.getSex());
		
	}
	
	@Test
	public void getSexCrossCheck() {
		Persoana pM=new Persoana("Ana","6010114100135");
		int primaCifra=pM.CNP.charAt(0);
		assertEquals(primaCifra%2==0 ?"F":"M",pM.getSex());
		
	}
	
	@Test
	public void testGetSexShouldThrowException() {
		Persoana persoana=new Persoana("Andrei","0010114100135");
		try
		{
			persoana.getSex();	
			fail("Metoda nu arunca exceptie");
			
		}catch(CNPInvalidException exceptie){
		
	}
		
}
	
	@Test
	public void testGetSexShouldThrowExceptionJunit5() {
		Persoana p=new Persoana("Andrei","0100114100135");
		assertThrows(CNPInvalidException.class,new Executable() {
			@Override
			public void execute() throws Throwable {
				p.getSex();
			}
		});
	}
	
	@Test
	public void testGetNullCNP () {
		Persoana p=new Persoana("Andrei",null);
		assertThrows(NullPointerException.class,new Executable() {
			@Override
			public void execute() throws Throwable {
				p.getSex();
			}
		});
	}
	
	@Test
	public void testGetSexPerformence() {
		Persoana p=new Persoana("Mimi","6010114100135");
		assertTimeout(Duration.ofMillis(100),new Executable() {
			
			@Override
			public void execute() throws Throwable {
				p.getSex();
				
			}
		});
	}
	
	@Test
	public void testGetSexComformance()
	{
		Persoana p=new Persoana("Mimi","6010114100135");
		assertEquals(1,p.getSex().length()); 
	}
	
	@Test
	public void testGetSexRange()
	{
		Persoana p=new Persoana("Mimi","7010114100135");
		assertEquals("N/A", p.getSex());
	
		
	}
	

}
