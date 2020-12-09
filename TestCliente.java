package practica2TPA;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCliente extends TestCase {
	@Test
	public void testCliente() {
		Cliente ClientePrueba = new Cliente("Juan","1231234","Calle las Pozas","67281237","huan2012@gmail.com","*********");
		assertEquals(ClientePrueba.getNombre(), "Juan");	
	}

}
