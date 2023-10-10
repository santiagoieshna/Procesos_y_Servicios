package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.data.Bola;
import model.data.ColorBola;

class BolaTest {

	
	

	@Test
	void testGetColor() {
		// CASO 1     -  Contructor(ColorBola)
		// Expected value
		ColorBola colorExpected = ColorBola.ROJO;
		// Actual value
		Bola bolaRoja = new Bola(ColorBola.ROJO);
		ColorBola colorActual = bolaRoja.getColor();
		
		assertEquals(colorExpected, colorActual);
		assertNotNull(bolaRoja.getNumero());

		// CASO 2    -  Contructor(Integer, ColorBola)
		// Expected value
		Integer numero = 33;
		colorExpected = ColorBola.ROJO;
		// Actual value
		bolaRoja = new Bola(numero, ColorBola.ROJO);
		colorActual = bolaRoja.getColor();

		assertEquals(colorExpected, colorActual);
		assertEquals(numero, bolaRoja.getNumero());
		
		// CASO 3	-  Contructor(ColorBola)
		// Expected value
		colorExpected = ColorBola.AZUL;
		// Actual value
		Bola bolaAzul = new Bola(ColorBola.AZUL);
		colorActual = bolaAzul.getColor();
		
		assertEquals(colorExpected, colorActual);
		assertNotNull(bolaAzul.getNumero());
		
		// CASO 4   -  Contructor(Integer, ColorBola)
		// Expected value
		numero = 12;
		colorExpected = ColorBola.AZUL;
		// Actual value
		bolaAzul = new Bola(numero, ColorBola.AZUL);
		colorActual = bolaAzul.getColor();
		
		assertEquals(colorExpected, colorActual);
		assertEquals(numero, bolaAzul.getNumero());

	}


	@Test
	void testGetNumero() {
		//CASO 1
		Integer numero = -1;		
		Bola bolaRoja = new Bola(numero, ColorBola.ROJO);
		// Actual Value
		Integer numeroActual = bolaRoja.getNumero();
		
		assertNull(numeroActual);
		
		//VARIOS CASOS
		Integer[] numeros = {-1, 0, 1, 6, 16, 33, 34, 36};
		
		//CASOS en ROJO
		//Expected Value
		Integer[] numerosExpectedRojo = {null, null, 1, 6, 16, 33, null, null};
		//Actual Value
		Integer[] numerosActualRojo = new Integer[numeros.length];
		
		for (int i = 0; i < numerosActualRojo.length; i++) {
			Bola bola = new Bola(numeros[i], ColorBola.ROJO);
			numerosActualRojo[i] = bola.getNumero();
		}
		assertArrayEquals(numerosExpectedRojo, numerosActualRojo);
		
		//CASOS en AZUL
		//Expected Value
		Integer[] numerosExpectedAzul = {null, null, 1, 6, 16, null, null, null};
		//Actual Value
		Integer[] numerosActualAzul = new Integer[numeros.length];
		
		for (int i = 0; i < numerosActualAzul.length; i++) {
			Bola bola = new Bola(numeros[i], ColorBola.AZUL);
			numerosActualAzul[i] = bola.getNumero();
		}
		assertArrayEquals(numerosExpectedAzul, numerosActualAzul);
		
		
	}

}
