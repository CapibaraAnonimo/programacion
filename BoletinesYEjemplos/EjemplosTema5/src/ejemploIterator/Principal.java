package ejemploIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<String> listaDeNombres = new ArrayList<String>();
		listaDeNombres.add("Juan Pérez Sánchez");
		listaDeNombres.add("José Alberto García Montes");
		String cadenaBuscar = "Alberto";
		System.out.println("La cadena que buscamos es " + cadenaBuscar);
		
		Iterator it = listaDeNombres.iterator();

	}

}
