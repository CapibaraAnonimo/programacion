package ejercicio1;

public class Nota {
	private int idNota;
	private String titulo;
	private String cuerpo;
	private boolean urgente;

	public Nota(String titulo, String cuerpo, boolean urgente, int idNota) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.urgente = urgente;
		this.idNota = idNota;
	}

	public int getIdNota() {
		return idNota;
	}

	public void setIdNota(int idNota) {
		this.idNota = idNota;
	}

	@Override
	public String toString() {
		return "Nota [id=" + idNota + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", urgente=" + urgente + "]";
	}

}
