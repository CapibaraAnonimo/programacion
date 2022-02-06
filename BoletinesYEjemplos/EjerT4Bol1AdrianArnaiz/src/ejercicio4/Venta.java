package ejercicio4;

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

	@Override
	public String toString() {
		String aux = new String("\t\tSupermercado\n-------------------------------------\nCtd\tProducto\tPrecio\tTotal");
		double total = 0;
		for (int i = 0; i < ticket.length; i++) {
			total = total + ticket[i].getProducto().getPrecioUnitario() * ticket[i].getCantidad();
			aux = aux + "\n" + ticket[i];
		}
		aux = aux + "\n-------------------------------------\n\tTotal IVA INCLUIDO:\t" + total;
		return aux;
	}

}
