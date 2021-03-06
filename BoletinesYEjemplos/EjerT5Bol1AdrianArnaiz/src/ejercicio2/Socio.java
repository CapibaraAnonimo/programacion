package ejercicio2;

public class Socio {
	private int id;
	private String dni;
	private String nombre;
	private String apellidos;

	public Socio(int id, String dni, String nombre, String apellidos) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

}
