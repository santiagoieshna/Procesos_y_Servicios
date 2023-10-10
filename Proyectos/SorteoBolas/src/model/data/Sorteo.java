package model.data;

public class Sorteo {

	private Bola bolaAzul;
	private Bola bolaRoja;
	
	public Sorteo() {
		this.bolaAzul = new Bola(ColorBola.AZUL);
		this.bolaRoja = new Bola(ColorBola.ROJO);
	}

	public Bola getBolaAzul() {
		return bolaAzul;
	}

	public Bola getBolaRoja() {
		return bolaRoja;
	}

	public Integer getNumeroAzul() {
		return bolaAzul.getNumero();
	}
	public Integer getNumeroRojo() {
		return bolaRoja.getNumero();
	}
	
	
}
