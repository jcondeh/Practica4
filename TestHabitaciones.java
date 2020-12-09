package practica2TPA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHabitaciones {

	@Test
	public void testHabitacion() {
		Habitaciones habitacion6 = new Habitaciones(600,6,2,"cama familiar y cama individual", "incluye television, frigorifico y caja fuerte", 25.00, false, "familiar");
		assertEquals(habitacion6.getDescripcion(), "cama familiar y cama individual");
	}

}
