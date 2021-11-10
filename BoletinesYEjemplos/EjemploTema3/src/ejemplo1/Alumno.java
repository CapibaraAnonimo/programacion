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
	
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public int getEdad()
	{
		return edad;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = new String(nombre);
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setApellidos(String apellidos)
	{
		this.apellidos = new String(apellidos);
	}
	
	public String getApellidos()
	{
		return apellidos;
	}
	
	public void setNotaMedia(double notaMedia)
	{
		this.notaMedia = notaMedia;
	}
	
	public double getNotaMedia()
	{
		return notaMedia;
	}
	
	public void setDNI(String dni)
	{
		this.dni = new String(dni);
	}
	
	public String getDNI()
	{
		return dni;
	}
	
	public void DecirNombre()
	{
		System.out.printf("Mi nombre es %s %s\n", nombre, apellidos);
	}
	
}
