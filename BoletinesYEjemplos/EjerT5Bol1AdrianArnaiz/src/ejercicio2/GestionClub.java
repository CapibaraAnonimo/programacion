package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class GestionClub {
	private List<Socio> lista = new ArrayList<Socio>();

	public GestionClub(List<Socio> lista) {
		super();
		this.lista = lista;
	}
	
	public void anyadirSocio(Socio s) {
		lista.add(s);
	}
	
	/**
	 * Metodo que busca un ususario dado su id
	 * @param id id que se quiere buscar
	 * @return la posicion dentro del ArrayList del usuario que se quiere buscar o un número negativo si no existe
	 */
	public int buscarId(int id) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id)
				return i;
		}
		return -1;
	}
	
	public Socio buscarSocio(int id) {
		int index = buscarId(id);
		if(index >= 0)
			return lista.get(1);
		else
			return null;
	}
	
	public String mostarSocios() {
		String usuarios = new String("");
		for (Socio socio : lista) {
			usuarios = usuarios + "\n" + socio;
		}
		return usuarios;
	}

}
