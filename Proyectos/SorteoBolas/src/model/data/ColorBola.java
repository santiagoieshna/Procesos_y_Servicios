package model.data;

public enum ColorBola {
	AZUL(16), ROJO(33);
	
	private Integer rango;
	
	ColorBola(int i) {
		this.rango=i;
	}
	public Integer getRango() {
		return rango;
	}
	
	
}
