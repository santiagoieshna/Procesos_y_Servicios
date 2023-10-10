package ejercicio10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio03 {
	/*
	 * Reglas de bolas de dos colores: cada apuesta en la bola de dos colores consta
	 * de 6 numeros de bolas rojas y 1 numero de bolas azules. El numero de bola
	 * roja se selecciona del 1 al 33; el n�mero de bola azul se selecciona del 1 al
	 * 16; genere aleatoriamente un numero de bola de doble color. (Requiere que no
	 * se repita el mismo numero de color)
	 */
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int i = 0;
		while (i < 6) {
			Random rand = new Random();
			int randNum = rand.nextInt(33) + 1;
			if (!hs.contains(randNum)) {
				hs.add(randNum);
				i++;
			}
		}
		boolean flag = true;
		while (flag) {
			Random blue = new Random();
			int blueNum = blue.nextInt(16) + 1;
			if (!hs.contains(blueNum)) {
				hs.add(blueNum);
				flag = false;
			}
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
