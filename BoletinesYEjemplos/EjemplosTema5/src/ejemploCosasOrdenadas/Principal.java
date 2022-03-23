package ejemploCosasOrdenadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		Numero n2 = new Numero(5);
		Numero n1 = new Numero(9);
		
		//System.out.println(n1.equals(n2));
		//System.out.println(n1.hashCode());
		//System.out.println(n2.hashCode());
		
		Set<Numero>  setOrd = new TreeSet<Numero>();
		setOrd.add(n1);
		setOrd.add(n2);
		
		System.out.println(setOrd);
		
		
		List<Numero> lista = new ArrayList<Numero>();
		lista.add(n1);
		lista.add(n2);
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
	}

}
