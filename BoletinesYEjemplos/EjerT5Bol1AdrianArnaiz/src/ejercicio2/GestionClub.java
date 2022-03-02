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

	public int buscarId(int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id)
				return i;
		}
		return -1;
	}

	/**
	 * Metodo que busca un ususario dado su id
	 * 
	 * @param id id que se quiere buscar
	 * @return la posicion dentro del ArrayList del usuario que se quiere buscar o
	 *         un número negativo si no existe
	 */
	public Socio buscarSocio(int id) {
		int index = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id)
				index = i;
		}

		if (index >= 0)
			return lista.get(index);
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

	public boolean modificarNombre(int id, String nombre) {
		boolean exito = false;
		Socio cambio;
		cambio = buscarSocio(id);
		if (cambio != null) {
			cambio.setNombre(nombre);
			exito = true;
		}
		return exito;
	}

	public boolean comprobarCoincidenciaId(int id) {
		boolean existe = false;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id)
				existe = true;
		}
		return existe;
	}
	
	public void eliminarSocio(int id) {
		lista.remove(buscarSocio(id));
	}

}
