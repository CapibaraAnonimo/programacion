package ejemplo1;

public class Alumno 
{
	int edad;
	String nombre;
	String apellidos;
	double notaMedia;
	String dni;
	
	
	public Alumno()
	{
		
	}
	
	public Alumno(int edad, String nombre, String apellidos, double notaMedia, String dni)
	{
		this.edad = edad;
		this.nombre = new String(nombre);
		this.apellidos = new String(apellidos);
		this.notaMedia = notaMedia;
		this.dni  = new String(dni);
	}
	
	public void AñadirEdad(int edad)
	{
		this.edad = edad;
	}
	
	public void AñadirNombre(String nombre)
	{
		this.nombre = new String(nombre);
	}
	
	public void AñadirApellidos(String apellidos)
	{
		this.apellidos = new String(apellidos);
	}
	
	public void AñadirNotaMedia(double notaMedia)
	{
		this.notaMedia = notaMedia;
	}
	
	public void AñadirDNI(String dni)
	{
		this.dni = new String(dni);
	}
	
	void DecirNombre()
	{
		System.out.printf("Mi nombre es %s %s", nombre, apellidos);
	}
	
}
