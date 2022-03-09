package ejercicio4;

import java.util.Map;

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
		if(clave != null) {
			agenda.remove(clave);
			eliminado = true;
		}
		return eliminado;
	}
	
	public Contacto buscarContacto(String nombre) {
		Contacto clave = null;
		return clave;
	}
	
	public void imprimirEliminado(boolean eliminado) {
		if(eliminado)
			System.out.println("Se ha eliminado con éxito");
		else
			System.out.println("No existe el contacto");
	}

}
