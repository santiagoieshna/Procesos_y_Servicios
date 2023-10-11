package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.Controler;
import model.data.Apuesta;
import model.data.Sorteo;
import model.mucks.ApuestaOM;
import model.mucks.SorteoOM;

class ControlerTest {

	@Test
	void testComprobarGanadorSimple() {
		// Caso ganador
		Sorteo sorteo = SorteoOM.setValues(1, 4);
		Apuesta apuesta = ApuestaOM.getSample1(4);
		Controler juego = new Controler(apuesta, sorteo);
		final Integer  NUMERO_UNO = 1;
		final Integer  NUMERO_CUATRO = 4;
		final Integer  NUMERO_TRES = 3;
		final Integer  NUMERO_TRENTAYUNO = 31;
		
		
		assertEquals(NUMERO_UNO, sorteo.getNumeroRojo());
		assertEquals(NUMERO_CUATRO, sorteo.getNumeroAzul());
		
		assertEquals(NUMERO_CUATRO, apuesta.getNumeroAzul());
		assertTrue(apuesta.containsValue(1));
		
		assertTrue(juego.comprobarGanadorSimple());
		
		// Caso Perdedor Bola Azul distinta
		sorteo = SorteoOM.setValues(1, 3);
		juego = new Controler(apuesta, sorteo);
		
		assertEquals(NUMERO_UNO, sorteo.getNumeroRojo());
		assertEquals(NUMERO_TRES, sorteo.getNumeroAzul());
		
		assertEquals(NUMERO_CUATRO, apuesta.getNumeroAzul());
		assertTrue(apuesta.containsValue(1));
		
		assertFalse(juego.comprobarGanadorSimple());
		
		// Caso Perdedor Bola Roja distinta
		sorteo = SorteoOM.setValues(31, 4);
		juego = new Controler(apuesta, sorteo);
		
		assertEquals(NUMERO_TRENTAYUNO, sorteo.getNumeroRojo());
		assertEquals(NUMERO_CUATRO, sorteo.getNumeroAzul());
		
		assertEquals(NUMERO_CUATRO, apuesta.getNumeroAzul());
		assertFalse(apuesta.containsValue(31));
		
		assertFalse(juego.comprobarGanadorSimple());
		
	}

}
