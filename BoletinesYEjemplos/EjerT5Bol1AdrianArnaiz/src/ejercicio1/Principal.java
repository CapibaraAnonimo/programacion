package ejercicio1;

import java.util.ArrayList;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda(0, new ArrayList<Nota>());
		int seccion = 0;
		int id = 0;
		int trueOrFalse = 1;
		String titulo = new String(""), cuerpo = new String("");
		boolean importante;

		do {
			seccion = Leer.datoInt();

			switch (seccion) {
			case 1:
				titulo = Leer.dato();
				cuerpo = Leer.dato();
				trueOrFalse = Leer.datoInt();
				if (trueOrFalse == 1)
					importante = true;
				else
					importante = false;
				id = Leer.datoInt();
				agenda.agregarNota(new Nota(titulo, cuerpo, importante, id));
				break;
			}
		} while (seccion != 0);

	}

}
