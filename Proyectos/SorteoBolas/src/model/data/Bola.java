package model.data;

import java.util.Random;

public class Bola {
	private Integer numero;
	private ColorBola color;
	
	public Bola(Integer numero, ColorBola color) {
		super();
		this.color = color;
		this.numero = (color.getRango()>=numero && numero > 0) ? numero:null;
		
	}
	public Bola(ColorBola color) {
		super();
		this.color = color;
		obtenerNumero();
	}
	
	private void obtenerNumero() {
		setNumero(new Random().nextInt(getRango())+1);
	}
	
	public Integer getRango() {
		return color.getRango();
	}
	
	private void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getNumero() {
		return numero;
	}
	public ColorBola getColor() {
		return color;
	}
	
	
	
	
	
}
