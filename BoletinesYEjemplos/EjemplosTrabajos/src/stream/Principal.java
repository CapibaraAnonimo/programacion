package stream;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(11);
		lista.add(4);
		lista.add(6);
		lista.add(1);
		lista.add(17);

		Integer numero = lista
		.stream()
		.filter(Integer -> Integer == 11)
		.sorted()
		.findAny()
		.orElse(null);

		System.out.println(numero);
		
	}

}
