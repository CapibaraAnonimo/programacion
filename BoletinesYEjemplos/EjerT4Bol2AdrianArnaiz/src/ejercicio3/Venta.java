package ejercicio3;

public class Venta {
	private LineaTicket[] ticket;

	public Venta(LineaTicket[] ticket) {
		super();
		this.ticket = ticket;
	}

	public LineaTicket[] getTicket() {
		return ticket;
	}

	public void setTicket(LineaTicket[] ticket) {
		this.ticket = ticket;
	}

	public String listarProductos() {
		String lista = new String("");
		for (int i = 0; i < ticket.length; i++) {
			lista = lista + "\n" + ticket[i];
			if (ticket[i].getProducto() instanceof Alimentacion) {
				lista = lista + ((Alimentacion) ticket[i].getProducto())
						.avisoCaducidad(((Alimentacion) ticket[i].getProducto()).getDiasCaducidad());
			}
		}
		return lista;
	}

	@Override
	public String toString() {
		String aux = new String(
				"\t\tSupermercado\n-------------------------------------\nCtd\tProducto\tPrecio\tTotal");
		double total = 0;
		for (int i = 0; i < ticket.length; i++) {
			total = total + ticket[i].getProducto().calcularPrecio() * ticket[i].getCantidad();
			aux = aux + "\n" + ticket[i];
			if (ticket[i].getProducto() instanceof Alimentacion) {	//Comprobación para Alimentacion por si tiene descuento
				aux = aux + ((Alimentacion) ticket[i].getProducto())
						.avisoCaducidad(((Alimentacion) ticket[i].getProducto()).getDiasCaducidad());
			}
		}
		aux = aux + "\n-------------------------------------\n\tTotal IVA INCLUIDO:\t" + total;
		return aux;
	}

}
