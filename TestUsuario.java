package practica2TPA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsuario {

	@Test
	public void test() {
		Usuario UsuarioPrueba = new Usuario("Juan","1231234","Calle las Pozas","67281237","huan2012@gmail.com","*********");
		assertEquals(UsuarioPrueba.getEmail(), "huan2012@gmail.com");
	}

}
