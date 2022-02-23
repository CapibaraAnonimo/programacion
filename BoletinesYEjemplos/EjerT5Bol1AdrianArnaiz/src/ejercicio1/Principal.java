package ejercicio1;

import java.util.ArrayList;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda(0, new ArrayList<Nota>());
		int seccion = 0;
		int id = 0;
		String titulo, cuerpo;
		boolean importante;

		do {
			seccion = Leer.datoInt();

			switch (seccion) {

			}
		} while (seccion != 0);

	}

}
