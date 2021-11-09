package ejemplo1;

public class Principal {

	public static void main(String[] args) 
	{
		int edad;
		String nombre;
		String apellidos;
		double notaMedia;
		String dni;
		
		Alumno adrian = new Alumno(18, "Adrián", "Arnaiz Cano", 10.0, "00000000A");
		
		adrian.DecirNombre();
		
	}

}
