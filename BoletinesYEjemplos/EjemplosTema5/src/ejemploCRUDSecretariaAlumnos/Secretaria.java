package ejemploCRUDSecretariaAlumnos;

import java.util.ArrayList;
import java.util.List;

public class Secretaria {
	private List<Alumno> listAlumnos;

	public Secretaria(List<Alumno> listAlumnos) {
		super();
		this.listAlumnos = listAlumnos;
	}

	public Secretaria() {
		this.listAlumnos = new ArrayList<Alumno>();
	}

	public List<Alumno> getListAlumnos() {
		return listAlumnos;
	}

	public void setlistAlumnos(List<Alumno> listAlumnos) {
		this.listAlumnos = listAlumnos;
	}

	@Override
	public String toString() {
		return "Secretaría [listAlumno=" + listAlumnos + "]";
	}

	public void agregarAlumn(Alumno alumn) {
		listAlumnos.add(alumn);
	}

	public boolean agregar2(Alumno al) {
		return listAlumnos.add(al);
	}

	public int buscarAlum(String dni) {
		int temp = -1;
		boolean salir = false;

		for (int i = 0; i < listAlumnos.size() && !salir; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				temp = i;
				salir = true;
			}
		}
		return temp;
	}

	public void modificarAlumno(String dni, String nuevoNombre) {
		int index = buscarAlum(dni);

		if (index >= 0)
			listAlumnos.get(index).setNombre(nuevoNombre);
	}

	public Alumno buscarAlum2(String dni) {
		Alumno tem = null;
		boolean salir = false;

		for (int i = 0; i < listAlumnos.size() && !salir; i++) {
			if (listAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				tem = listAlumnos.get(i);
				salir = true;
			}
		}
		return tem;
	}

	public void imprimirLista() {
		for (Alumno alumno : listAlumnos) {
			System.out.println(alumno);
		}
	}

	public void borrarAlumno(String dni) {
		int index = buscarAlum(dni);

		if (index >= 0) {
			listAlumnos.remove(index);
		}
	}

	public void mostrarErrorAgregar(boolean b) {
		if (b)
			System.out.println("Se ha agregado el alumno correctamente");
		else
			System.out.println("Error al insertar");
	}

}
