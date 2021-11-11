package ejercicio04;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		String cadena = new String();
		int veces = 0;
		Copiado co = new Copiado();
		
		System.out.println("Introduce la cadena a copiar");
		cadena = Leer.dato();
		System.out.println("Introduce las veces que quieres que se copie");
		veces = Leer.datoInt();
		co.copiar(cadena, veces);

	}

}
