package practica2TPA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTrabajador {

	@Test
	public void test() {
		Trabajador TrabajadorPrueba = new Trabajador("Juan","1231234","Calle las Pozas","67281237","huan2012@gmail.com","*********");
		assertEquals(TrabajadorPrueba.getDireccion(), "Calle las Pozas");
	}

}
