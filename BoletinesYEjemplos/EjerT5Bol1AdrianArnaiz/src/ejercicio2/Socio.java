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

	@Override
	public String toString() {
		return "Socio [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

}
