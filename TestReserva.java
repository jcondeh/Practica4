package practica2TPA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReserva {

	@Test
	public void test() {
		Reserva PruebaReserva=new Reserva(600,"2021-05-03","2021-05-10",140);
		assertEquals(PruebaReserva.getIdHabitacion(), 600);
	}

}
