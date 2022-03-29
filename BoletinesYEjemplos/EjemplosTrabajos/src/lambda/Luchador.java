package lambda;

public class Luchador implements Comparable<Luchador> {
	private String nombre;
	private double puntosVelocidad;
	private double puntosHP;
	private double puntosATK;
	private double puntosDEF;
	private double damage;

	public Luchador(String nombre, double puntosVelocidad, double puntosHP, double puntosATK, double puntosDEF,
			double damage) {
		super();
		this.nombre = nombre;
		this.puntosVelocidad = puntosVelocidad;
		this.puntosHP = puntosHP;
		this.puntosATK = puntosATK;
		this.puntosDEF = puntosDEF;
		this.damage = damage;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPuntosVelocidad() {
		return puntosVelocidad;
	}

	public void setPuntosVelocidad(double puntosVelocidad) {
		this.puntosVelocidad = puntosVelocidad;
	}

	public double getPuntosHP() {
		return puntosHP;
	}

	public void setPuntosHP(double puntosHP) {
		this.puntosHP = puntosHP;
	}

	public double getPuntosATK() {
		return puntosATK;
	}

	public void setPuntosATK(double puntosATK) {
		this.puntosATK = puntosATK;
	}

	public double getPuntosDEF() {
		return puntosDEF;
	}

	public void setPuntosDEF(double puntosDEF) {
		this.puntosDEF = puntosDEF;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	@Override
	public int compareTo(Luchador o) {
		return (nombre.compareTo(o.getNombre()));
	}

}
