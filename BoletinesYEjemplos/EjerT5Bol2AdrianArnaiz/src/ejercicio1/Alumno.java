package ejercicio1;

public class Alumno {
	private String nombre;
	private String apellidos;
	private String nombreCurso;
	private double notaMedia;
	private int edad;

	public Alumno(String nombre, String apellidos, String nombreCurso, double notaMedia, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreCurso = nombreCurso;
		this.notaMedia = notaMedia;
		this.edad = edad;
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

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", nombreCurso=" + nombreCurso + ", notaMedia="
				+ notaMedia + ", edad=" + edad + "]\n";
	}

}
