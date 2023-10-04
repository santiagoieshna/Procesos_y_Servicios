package gatetes;

public class GatosService {
	private GatosRepository gatosRepository;

	public GatosService(GatosRepository gatosRepository) {
		super();
		this.gatosRepository=gatosRepository;
	}
	
	public void addOneThousandCats() {
		GatoOM gatoOM=new GatoOM();
		int maximoGatos = 1000;
		do {
			gatosRepository.addGato(gatoOM.getRandomCat());				
		}while(gatosRepository.size()<maximoGatos);
	}
	
	// Quiero que me digas cuantos gatos hay por cada raza
	
	
}
