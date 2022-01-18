package ejemploArraysObjetos;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) {
		int nVs = 0, seguir, tam = 100;// Contador de objetos Veh�culo, variable para salir del bucle y tama�o
		String modelo;
		//boolean cRuedas;
		// Creamos un array de objetos Vehiculo para almacenar 100 Veh�culos
		Vehiculo lista[] = new Vehiculo[tam];
		//String aux;
		
		do {
			System.out.print("Introduce el modelo del veh�culo: ");
			modelo = Leer.dato();
			System.out.print("Introduce la potencia: ");
			double potencia = Leer.datoDouble();
			lista[nVs] = new Vehiculo(modelo, potencia);
			nVs++;// Aumentamos en uno el n�mero de veh�culos
			System.out.println("Si desea terminar pulse 0, cualquier n�mero para seguir");
			seguir = Leer.datoInt();
		} while (seguir != 0 && nVs < lista.length);
		// Imprimimos los veh�culos introducidos, ojo no hasta el tama�o del array, sino
		// hasta donde hay veh�culos con datos
		
		for (int i = 0; i < nVs; i++) {
			System.out.println(lista[i]);
		}
		System.out.println("Fin del programa");
	}

}
