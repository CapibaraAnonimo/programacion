package ejemploCosasOrdenadas;

import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		Numero n1 = new Numero(1);
		Numero n2 = new Numero(1);
		
		System.out.println(n1.equals(n2));
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
	}

}
