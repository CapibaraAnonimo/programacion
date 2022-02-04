package ejercicio4;

public class LineaTicket {
	private Producto producto;
	private int cantidad;
	
	
	public LineaTicket(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return cantidad + producto.getNombre() + producto.getPrecioUnitario() + producto.getPrecioUnitario()*cantidad;
	}
	
	
	

}
