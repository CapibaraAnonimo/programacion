package optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		int num =2;
		Optional<Integer> numero = Optional.<Integer>empty();
		
		numero = Optional.ofNullable(null);
		
		System.out.println(numero);
		System.out.println(numero.orElseGet(() -> 12));
		
		
		System.out.println(numero.or(() -> Optional.of(num)));
		
		System.out.println(numero.orElseThrow(() -> new NoSuchElementException()));
	}

}
