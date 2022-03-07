package ejemploCRUDSecretariaAlumnos;

public class Alumno {
	private String dni;
	private String nombre;

	public Alumno(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "********************************\n"
				 + "Dni: " + dni + "\n"
				 + "Nombre: " + nombre+"\n"
				 + "********************************\n";
	}

}
