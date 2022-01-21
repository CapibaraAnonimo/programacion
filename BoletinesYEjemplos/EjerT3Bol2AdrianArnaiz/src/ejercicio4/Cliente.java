package ejercicio4;

public class Cliente {
	private int id;
	private String dni;
	private String nombre;
	private String apellidos;
	private boolean activo;
	private double pesoKg;
	private double alturaCm;
	
	public Cliente(int id, String dni, String nombre, String apellidos, boolean activo, double pesoKg, double alturaCm) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.activo = activo;
		this.pesoKg = pesoKg;
		this.alturaCm = alturaCm;
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public double getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(double pesoKg) {
		this.pesoKg = pesoKg;
	}

	public double getAlturaCm() {
		return alturaCm;
	}

	public void setAlturaCm(double alturaCm) {
		this.alturaCm = alturaCm;
	}
	
	public double imc() {
		return pesoKg/Math.pow((alturaCm/100), 2);
	}
	
	@Override
	public String toString() {
		return "id: " + id + "\nNombre: " + nombre + "\nApellidos: " + apellidos;
	}

}
