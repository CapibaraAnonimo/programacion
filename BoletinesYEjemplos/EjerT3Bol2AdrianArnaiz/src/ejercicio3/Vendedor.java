package ejercicio3;

public class Vendedor {
	private Movil lista[];
	private int ventas;
	
	public Vendedor(Movil lista[]) {
		this.lista = lista;
	}
	
	public void movilesRestantes() {
		for(int i = 0; i < lista.length; i++)
		{
			if(!lista[i].isVendido())
				System.out.println((i+1) + ")\n" + lista[i]);
		}
	}

	public double precioDescuento(int movil, int descuento) {
		return lista[movil-1].getPrecioUnitario() * (1-(descuento/100));
	}
	
	public void vender(int movil) {
		if(!lista[movil].isVendido()) {
			lista[movil].setVendido(true);
			ventas++;
		}
		else
			System.out.println("No está disponible ese movil");
	}

}
