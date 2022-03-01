package ejercicio2;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		List<Socio> lista = new ArrayList();
		Socio s1 = new Socio(1, "00000000a", "Nombre1", "Apellido1");
		Socio s2 = new Socio(2, "00000001a", "Nombre2", "Apellido2");
		int seccion = 0, id = 0;

		GestionClub club = new GestionClub(lista);

		club.anyadirSocio(s1);
		club.anyadirSocio(s2);

		do {
			seccion = Leer.datoInt();
			
			switch(seccion) {
			case 1:
				System.out.println(club.mostarSocios());
				break;
			case 2:
				System.out.println(club.mostarSocios());
				id =Leer.datoInt();
				System.out.println(club.buscarSocio(id));
			}
		} while (seccion != 0);

	}

}
