package ejecicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Barco {
	private int id;
	private String nombre;
	private int cargaMax;
	private List<Coche> listaCoches;

	public Barco(int id, String nombre, int cargaMax, List<Coche> listaCosches) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cargaMax = cargaMax;
		this.listaCoches = listaCosches;
	}

	public List<Coche> getListaCosches() {
		return listaCoches;
	}

	public void setListaCosches(List<Coche> listaCosches) {
		this.listaCoches = listaCosches;
	}

	public List<Coche> buscarMaxprecio() {
		int maximo = 0;
		Coche cocheActual;
		Iterator<Coche> it = listaCoches.iterator();
		List<Coche> listaAux = new ArrayList<Coche>();
		while (it.hasNext()) {
			cocheActual = it.next();

			if (cocheActual.getPrecio() > maximo) {
				maximo = cocheActual.getPrecio();
				listaAux.removeAll(listaAux);
				listaAux.add(cocheActual);

			} else if (cocheActual.getPrecio() == maximo)
				listaAux.add(cocheActual);
		}
		return listaAux;
	}

	public Coche buscarMatricula(String matricula) {
		Iterator<Coche> it = listaCoches.iterator();
		Coche cocheActual = null;
		Boolean encontrado = false;

		while (it.hasNext() && !encontrado) {
			cocheActual = it.next();
			if (cocheActual.getMatricula().equalsIgnoreCase(matricula)) {
				encontrado = true;
			}
		}

		if (!encontrado)
			cocheActual = null;

		return cocheActual;
	}

	public List<Coche> buscarMarca(String marca) {
		List<Coche> lista = new ArrayList<Coche>();

		for (Coche coche : listaCoches) {
			if (coche.getMarca().equalsIgnoreCase(marca))
				lista.add(coche);
		}

		return lista;
	}

	public Boolean modificarColor(String matricula, String color) {
		Coche coche = buscarMatricula(matricula);

		if (coche != null) {
			coche.setColor(color);
			return true;
		} else
			return false;
	}
	
	public int gananciasMarca(String marca) {
		int ganancias = 0;
		
		for(Coche coche : buscarMarca(marca)) {
			ganancias = ganancias + coche.getPrecio();
		}
		return ganancias;
	}
	
	public void ImprimirLista() {
		Iterator it = listaCoches.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
