package optional;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		
		int dos =2;
		Optional<Integer> numero = Optional.<Integer>empty();
		
		numero = Optional.ofNullable(null);
		
		
		System.out.println(numero.orElseGet(() -> 12));
	}

}
