import java.util.Scanner;

public class Tenis {
	
	public static void main(String[] args) {
		Boolean ganaJugadorUno = false, ganaJugadorDos = false;
		Integer puntoJugadorUno = 0, puntoJugadorDos = 0;
		String[] puntos = {"0","15", "30", "40"};
		Scanner sc= new Scanner(System.in);
		Integer set = 0;
		do {
			Integer punto = 0;
			
			punto = sc.nextInt();
			if(punto == 1)
				puntoJugadorUno ++;
			else if(punto == 2)
				puntoJugadorDos ++;
			
			if(!estanIguales(puntoJugadorUno,puntoJugadorDos)) {
				
			}else if(ganaJugador(puntoJugadorUno))
				
			
			
			imprimiResultado(puntos, puntoJugadorUno, puntoJugadorDos);
						
		}while(!ganaJugadorUno && !ganaJugadorDos);
	}

	private static boolean ganaJugador(Integer puntoJugadorUno) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean estanIguales(Integer puntoJugadorUno, Integer puntoJugadorDos) {
		// TODO
		return (puntoJugadorUno<4)|| true;
	}

	private static void imprimiResultado(String[] puntos, Integer puntoJugadorUno, Integer puntoJugadorDos) {
		System.out.println(puntos[puntoJugadorUno]+"-"+puntos[puntoJugadorDos]);
	}
}
