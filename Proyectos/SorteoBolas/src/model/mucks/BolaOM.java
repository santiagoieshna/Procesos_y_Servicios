package model.mucks;

import java.util.HashSet;
import java.util.Set;

import model.data.Bola;
import model.data.ColorBola;

public class BolaOM {
	
	/**
	 * Metodo que retorna una bola con el numero 1 y el color que se introduzca por teclado
	 * @param color
	 * @return Bola con numero 1
	 */
	public static Bola getBola1(ColorBola color){
		return new Bola(1, color);
	}
	public static Bola getBola4(ColorBola color){
		return new Bola(4, color);
	}

	public static Set<Bola> getSetRojas1(){
		 Set<Bola> bolasRojas = new HashSet<>();
	        
	        bolasRojas.add(new Bola(1, ColorBola.ROJO));
	        bolasRojas.add(new Bola(2, ColorBola.ROJO));
	        bolasRojas.add(new Bola(3, ColorBola.ROJO));
	        bolasRojas.add(new Bola(4, ColorBola.ROJO));
	        bolasRojas.add(new Bola(5, ColorBola.ROJO));
	        bolasRojas.add(new Bola(6, ColorBola.ROJO));
	        
	    return bolasRojas;
	}
	public static Set<Bola> getSetRojas2(){
		Set<Bola> bolasRojas = new HashSet<>();
		
		bolasRojas.add(new Bola(1, ColorBola.ROJO));
		bolasRojas.add(new Bola(2, ColorBola.ROJO));
		bolasRojas.add(new Bola(13, ColorBola.ROJO));
		bolasRojas.add(new Bola(4, ColorBola.ROJO));
		bolasRojas.add(new Bola(24, ColorBola.ROJO));
		bolasRojas.add(new Bola(30, ColorBola.ROJO));
		
		return bolasRojas;
	}
	
	
}
