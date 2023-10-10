package model.data;

public class Sorteo {

	private Bola bolaAzul;
	private Bola bolaRoja;
	
	public Sorteo() {
		this.bolaAzul = new Bola(ColorBola.AZUL);
		this.bolaRoja = new Bola(ColorBola.ROJO);
	}
	/**
	 * Metodo para @tests
	 * @return
	 */
	public void setSorteo(Integer rojo, Integer azul) {
		this.bolaRoja = new Bola(rojo ,ColorBola.ROJO);
		this.bolaAzul = new Bola(azul ,ColorBola.AZUL);
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
