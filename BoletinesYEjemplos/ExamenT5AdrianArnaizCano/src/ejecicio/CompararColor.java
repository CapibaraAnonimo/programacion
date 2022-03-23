package ejecicio;

import java.util.Comparator;

public class CompararColor implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {
		return o1.getColor().compareToIgnoreCase(o2.getColor());
	}

}
