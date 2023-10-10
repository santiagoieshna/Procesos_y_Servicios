package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
		
		assertEquals(1, sorteo.getNumeroRojo());
		assertEquals(4, sorteo.getNumeroAzul());
		
		assertEquals(4, apuesta.getNumeroAzul());
		assertTrue(apuesta.containsValue(1));
		
		assertTrue(juego.comprobarGanadorSimple());
		
		// Caso Perdedor Bola Azul distinta
		sorteo = SorteoOM.setValues(1, 3);
		juego = new Controler(apuesta, sorteo);
		
		assertEquals(1, sorteo.getNumeroRojo());
		assertEquals(3, sorteo.getNumeroAzul());
		
		assertEquals(4, apuesta.getNumeroAzul());
		assertTrue(apuesta.containsValue(1));
		
		assertFalse(juego.comprobarGanadorSimple());
		
		// Caso Perdedor Bola Roja distinta
		sorteo = SorteoOM.setValues(31, 4);
		juego = new Controler(apuesta, sorteo);
		
		assertEquals(31, sorteo.getNumeroRojo());
		assertEquals(4, sorteo.getNumeroAzul());
		
		assertEquals(4, apuesta.getNumeroAzul());
		assertFalse(apuesta.containsValue(31));
		
		assertFalse(juego.comprobarGanadorSimple());
		
	}

}
