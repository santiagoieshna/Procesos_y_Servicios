package controller;

import java.util.List;
//import java.util.stream.Collectors;

import model.data.Apuesta;
import model.data.Sorteo;

public class Controler {
	private List<Apuesta> apuestas; //Podria ser tambien una lista
	private Apuesta apuesta;
	private Sorteo sorteo;
	
	public Controler(Apuesta apuesta) {
		super();
		this.apuesta = apuesta;
		this.sorteo = new Sorteo();
	}
	public Controler(Apuesta apuesta, Sorteo sorteo) {
		// TODO Borrar este Constructor, solo es para tests
		super();
		this.apuesta = apuesta;
		this.sorteo = sorteo;
	}
	
	public Controler(List<Apuesta> apuestas) {
		super();
		this.apuestas = apuestas;
		this.sorteo = new Sorteo();
	}
	
	public Boolean comprobarGanadorSimple() {
		Boolean ganador=false;
		if(apuesta.getNumeroAzul()==sorteo.getNumeroAzul()){
			ganador = apuesta.getBolasRojas().stream()
					.anyMatch((bola)->{
						return bola.getNumero()==sorteo.getNumeroRojo();
					});
		}
		return ganador;
	}
	
	
	
	/**
	 * Metodo que verificara de una lista los ganadores del sorteo
	 */
	public void comprobarGanadores() {
//		apuestas.stream()
//		.collect(Collectors.groupingBy(apuesta.getNumeroAzul()));
	}
	
	
	
}
