package ejercicio1;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private String dni;

	public Persona() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void pedirDatos() {
		try {
			Scanner lector = new Scanner(System.in);
			System.out.println("Introduce el nombre");
			setNombre(lector.nextLine());
			System.out.println("Introduce los apellido");
			setApellidos(lector.nextLine());
			System.out.println("Introduce la edad");
			setEdad(Integer.parseInt(lector.nextLine()));
			System.out.println("Introduce el DNI");
			setDni(lector.nextLine());
			lector.close();
		} catch (Exception e) {
			System.err.println(e.getStackTrace()[0].getLineNumber());
		}
	}

}
