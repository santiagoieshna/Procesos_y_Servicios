package controller;

import java.util.List;
import java.util.stream.Collectors;

import model.data.Apuesta;
import model.data.Sorteo;

public class Controler {
	private Apuesta apuesta;
	private List<Apuesta> apuestas; //Podria ser tambien una lista
	private Sorteo sorteo;
	
	public Controler(Apuesta apuesta) {
		super();
		this.apuesta = apuesta;
		this.sorteo = new Sorteo();
	}
	
	public Controler(List<Apuesta> apuestas) {
		super();
		this.apuestas = apuestas;
		this.sorteo = new Sorteo();
	}
	
	/**
	 * Metodo que verificara de una lista los ganadores del sorteo
	 */
	public void comprobarGanadores() {
		apuestas.stream()
		.collect(Collectors.groupingBy(apuesta.getNumeroAzul()));
	}
	
	
	
}
