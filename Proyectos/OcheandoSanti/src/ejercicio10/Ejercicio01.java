package ejercicio10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio01 {
	// 1. Genere 10 números aleatorios que van del 1 al 100
	// y colóquelos en una coleccion. Coloque los números mayores
	// o iguales a 10 en la coleccion
	// en un conjunto de listas e imprímalos en la consola.
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
//		gen10AlumnosJose(al);

		List<Integer> numeritos = IntStream
								.generate(() ->{
									return new Random().nextInt(101)+1;
								}).limit(100)
								.boxed()
								.collect(Collectors.toList());
		

	}

	private static void gen10AlumnosJose(ArrayList<Integer> al) {
		int[] arr = new int[10]; // Indica la longitud
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 10)
				al.add(arr[i]);
		}
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
