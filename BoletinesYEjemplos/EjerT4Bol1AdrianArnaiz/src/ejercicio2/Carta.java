package ejercicio2;

import java.util.Date;

public class Carta extends Documento {
	protected Date dia;

	public Carta(String empresa, Date dia) {
		super(empresa);
		this.dia = dia;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nDía: " + dia;
	}

}
