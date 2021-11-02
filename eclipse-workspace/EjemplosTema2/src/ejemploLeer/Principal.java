package ejemploLeer;

public class Principal {

	public static void main(String[] args) 
	{
		String apellidos = new String();
		int edad = 0;
		int sumando1 = 0;
		int sumando2 = 0;
		int suma;
		
		System.out.println("Buenas, introduzca sus apellidos");
		
		apellidos = Leer.dato();
		
		System.out.printf("Sus apellidos son %s\n", apellidos);
		
		System.out.println("Introduce tu edad");
		edad = Leer.datoInt();
		System.out.printf("Tienes %d años\n", edad);
		
		System.out.println("Introduzca el sumando 1");
		sumando1 = Leer.datoInt();
		System.out.println("Introduzca el sumando 2");
		sumando2 = Leer.datoInt();
		
		suma = sumando1 + sumando2; 
		System.out.printf("La suma es %d\n", suma);
		
		

	}

}
