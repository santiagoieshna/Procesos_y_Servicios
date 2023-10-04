package gatetes;

import java.util.Set;

public interface GatosRepository {
	

	public boolean addGato(Gato gato);
	

	public int size();
	
	public Set<Gato> findAll();
	
	
}
