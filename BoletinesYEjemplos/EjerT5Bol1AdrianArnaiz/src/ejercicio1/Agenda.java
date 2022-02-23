package ejercicio1;

import java.util.List;

public class Agenda {
	private int idAgenda;
	private List<Nota> lista;

	public Agenda(int idAgenda, List<Nota> lista) {
		super();
		this.idAgenda = idAgenda;
		this.lista = lista;
	}
	
	public void agregarNota(Nota nota) {
		lista.add(nota);
	}
	
	public void eliminarNota(int posicion) {
		if(!lista.isEmpty() && lista.get(posicion-1) != null)
			lista.remove(posicion-1);
	}
	
	public String mostrarLista() {
		String cadena = new String("");
		int posicion = 1;
		for (Nota nota : lista) {
			cadena = cadena + posicion + "\t" + nota + "\n";
		}
		return cadena;
	}
	
	public Nota buscarNota(int id) {
		for (Nota nota : lista) {
			if(nota.getIdNota() == id)
				return nota;
		}
		return null;
	}
	
	public String darInformacion() {
		String informacion = new String("");
		return informacion + "Número de notas: " + lista.size();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
