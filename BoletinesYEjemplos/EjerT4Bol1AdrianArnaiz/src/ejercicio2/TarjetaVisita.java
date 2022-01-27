package ejercicio2;

public class TarjetaVisita extends Documento {
	protected String nombre;

	public TarjetaVisita(String empresa, String nombre) {
		super(empresa);
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nNombre: " + nombre;
	}

}
