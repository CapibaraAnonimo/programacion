package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Sala sala = new Sala();
		int seccion = 0;
		
		do {
			System.out.println("\n\n1. Ver Cartelera"
					+ "\n2. Comprar Entrada"
					+ "\n3. Dinero Recaudado en el dia"
					+ "\n4. Cambiar precio a una entrada"
					+ "\n0. Salir");
			do {
				System.out.println("\nElija una seccion");
				seccion = Leer.datoInt();
				if(seccion < 0 || seccion > 4)
					System.out.println("Seccion Incorrecta");
			}while(seccion < 0 || seccion > 4);
			
			switch (seccion) {
			case 0:
				break;
				
			case 1:
				System.out.println(sala.verCartelera());
				break;
			case 2: 
				sala.comprarEntrada();
				break;
			case 3:
				System.out.println("Se ha recaudado " + sala.dineroTotal() + "EURs");
				break;
			case 4:
				System.out.println("introduzca el nuevo precio de la entrada");
				sala.cambiarPrecio(Leer.datoDouble());
				break;
			}
		}while(seccion != 0);

	}

}
