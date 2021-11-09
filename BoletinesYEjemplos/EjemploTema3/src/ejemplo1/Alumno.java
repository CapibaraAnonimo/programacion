package ejemplo1;

public class Alumno 
{
	private  int edad;
	private String nombre;
	private String apellidos;
	private double notaMedia;
	private String dni;
	
	
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
	
	public void CambiarEdad(int edad)
	{
		this.edad = edad;
	}
	
	public void CambiarNombre(String nombre)
	{
		this.nombre = new String(nombre);
	}
	
	public void CambiarApellidos(String apellidos)
	{
		this.apellidos = new String(apellidos);
	}
	
	public void CambiarNotaMedia(double notaMedia)
	{
		this.notaMedia = notaMedia;
	}
	
	public void CambiarDNI(String dni)
	{
		this.dni = new String(dni);
	}
	
	public void DecirNombre()
	{
		System.out.printf("Mi nombre es %s %s\n", nombre, apellidos);
	}
	
}
