package ejercicio09;

public class Ticket {
	private double precio = 2.4;
	private String contra = new String("Bosco-2");
	
	public Ticket() {
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getContra() {
		return contra;
	}
	
	public void setContra(String contra) {
		this.contra = contra;
	}

}
