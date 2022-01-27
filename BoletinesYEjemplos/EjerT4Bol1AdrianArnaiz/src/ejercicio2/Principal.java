package ejercicio2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Principal {

	public static void main(String[] args) {
		Documento d;
		TarjetaVisita t;
		Carta c;
		String empresa = new String("IBM");
		
		d = new Documento(empresa);
		t = new TarjetaVisita(empresa, "Magicarp mamado");
		c = new Carta(empresa, new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime());
		
		System.out.println(d);
		System.out.println(t);
		System.out.println(c);

	}

}
