package ejercicio2;

public class Documento {
	protected String empresa;
	
	
	public Documento(String empresa) {
		super();
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Empresa: " + empresa;
	}

}
