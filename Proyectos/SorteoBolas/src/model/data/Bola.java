package model.data;

import java.util.Objects;
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

	@Override
	public int hashCode() {
		return Objects.hash(color, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bola other = (Bola) obj;
		return color == other.color && Objects.equals(numero, other.numero);
	}
	
}
