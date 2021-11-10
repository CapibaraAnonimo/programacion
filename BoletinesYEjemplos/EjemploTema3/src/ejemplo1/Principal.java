package ejemplo1;

import lectura.Leer;

public class Principal {

	public static void main(String[] args) 
	{
		int edad;
		String nombre;
		String apellidos;
		double notaMedia;
		String dni;
		Alumno adrian = new Alumno(18, "Adrián", "Arnaiz Cano", 10.0, "00000000A");
		Alumno alumn1;
		
		System.out.println("Diga su edad");
		edad = Leer.datoInt();
		System.out.println("Diga su nombre");
		nombre = Leer.dato();
		System.out.println("Diga sus apellidos");
		apellidos = Leer.dato();
		System.out.println("Diga su nota media");
		notaMedia = Leer.datoDouble();
		System.out.println("Diga su DNI");
		dni = Leer.dato();
		
		alumn1 = new Alumno(edad, nombre, apellidos, notaMedia, dni);
		
		adrian.DecirNombre();
		alumn1.DecirNombre();
		
	}

}
