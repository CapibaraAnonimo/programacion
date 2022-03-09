package ejercicio4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Agenda {
	private Map<Contacto, Integer> agenda;

	public Agenda(Map<Contacto, Integer> agenda) {
		super();
		this.agenda = agenda;
	}

	public Map<Contacto, Integer> getAgenda() {
		return agenda;
	}

	public void setAgenda(Map<Contacto, Integer> agenda) {
		this.agenda = agenda;
	}

	public void agregarContacto(Contacto contacto, int numero) {
		agenda.put(contacto, (Integer) numero);
	}

	public boolean eliminarContacto(String nombre) {
		boolean eliminado = false;
		Contacto clave = buscarContacto(nombre);
		if (clave != null) {
			agenda.remove(clave);
			eliminado = true;
		}
		return eliminado;
	}

	public Contacto buscarContacto(String nombre) {
		Contacto clave = null;
		boolean salir = false;
		Iterator<Contacto> it = agenda.keySet().iterator();

		while (it.hasNext() && !salir) {
			clave = it.next();
			if (clave.getNombre() == nombre) {
				salir = true;
			}
		}
		if (salir == false)
			clave = null;
		return clave;
	}

	public void imprimirEliminado(boolean eliminado) {
		if (eliminado)
			System.out.println("Se ha eliminado con éxito");
		else
			System.out.println("No existe el contacto");
	}
	
	public String mostrarAgenda() {
		String lista = new String("");
		boolean salir = false;
		Iterator<Contacto> it = agenda.keySet().iterator();
		
		while(it.hasNext() && !salir) {
			lista.concat(it.next().toString().concat("\n"));
		}
		return lista;
	}
	
	public Integer buscarNumero(String nombre) {
		Integer numero = 0;
		Contacto contacto = buscarContacto(nombre);
		
		if (contacto != null)
			numero = agenda.get(contacto);
		return numero;
	}

}
