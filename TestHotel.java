package practica2TPA;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHotel {

	@Test
	public void test() {
		Hotel PruebaHotel=new Hotel("Ca�o","Madrid");
		assertEquals(PruebaHotel.getNombre(), "Ca�o");
	}

}
