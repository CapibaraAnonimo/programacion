package ejercicio;

public class Feria {
	int anyo;
	Visitante visitantes[];

	public Feria(int anyo, Visitante[] visitantes) {
		super();
		this.anyo = anyo;
		this.visitantes = visitantes;
	}

	public double calcularPrecioEntradaUnVisitante(int id) {
		for (int i = 0; i < visitantes.length; i++) {
			if (visitantes[i].getId() == id)
				return visitantes[i].calcularPrecioEntrada();
		}
		return 0;
	}

	public double calcularTotalReacudado() {
		double total = 0;
		for (int i = 0; i < visitantes.length; i++) {
			total = total + visitantes[i].calcularPrecioEntrada();
		}
		return total;
	}

	public double calcularTotalRecaudadoFamiliares() {
		double total = 0;
		for (int i = 0; i < visitantes.length; i++) {
			if (visitantes[i] instanceof Familiar) {
				total = total + visitantes[i].calcularPrecioEntrada();
			}
		}
		return total;
	}

	public String mostrarListado() {
		String lista = new String("");
		for (int i = 0; i < visitantes.length; i++) {
			lista = lista + visitantes[i] + "\n";
		}
		return lista;
	}

	public boolean comprobarId(int id) {
		boolean real = false;
		for (int i = 0; i < visitantes.length; i++) {
			if (visitantes[i].getId() == id) {
				real = true;
				i = visitantes.length;
			}
		}
		return real;
	}

}
