package model.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Apuesta { 
	private Set<Bola> bolasRojas;
	private Bola bolaAzul;
	private static final Integer NUMERO_BOLAS_ROJAS = 6;

	public Apuesta(Set<Bola> bolasRojas, Bola bolaAzul) {
		//PREGUNTA --> TERNARIOS SI? o TERNARIOS NO?
		this.bolaAzul = (bolaAzul.getColor() == ColorBola.AZUL) ? bolaAzul : null;
		this.bolasRojas = (this.bolaAzul != null && bolasRojas.size() == NUMERO_BOLAS_ROJAS) ? bolasRojas : null;
	
	}
/*
 * bolaAzul:[ 1 , 2 ,3 ,4 ,5 ] Apuesta
 */
	public Map<Bola, Set<Bola>> getApuesta() {
		Map<Bola, Set<Bola>> apuestaDict = new HashMap<>();
		apuestaDict.put(bolaAzul, bolasRojas);
		return apuestaDict;
	}
	
	public Set<Bola> getBolasRojas() {
		return bolasRojas;
	}

	public Bola getBolaAzul() {
		return bolaAzul;
	}

	public static Integer getNumeroBolasRojas() {
		return NUMERO_BOLAS_ROJAS;
	}

	public Integer getNumeroAzul() {
		return bolaAzul.getNumero();
	}
	
	public Boolean containsValue(Integer value) {
		return this.bolasRojas.contains(new Bola(value, ColorBola.ROJO));
	}


}
