package ejemploPrintf;

public class Principal {

	public static void main(String[] args) 
	{
		float sueldo = 867.342796f;
		byte edad = 18;
		String nombre = new String("Adrián");
		String apellido1 = new String("Arnaiz");
		String apellido2 = new String("Cano");
		
		System.out.printf("El sueldo redondeado es: \t%.2f\n", sueldo);
		System.out.printf("Mi edad es: \t\t\t%d", edad);
		System.out.println("\n" + nombre + " " + apellido1 + " " + apellido2);
		System.out.printf("Mi nombre es %s %s %s y mi edad es %d", nombre, apellido1, apellido2, edad);
		
	}

}
