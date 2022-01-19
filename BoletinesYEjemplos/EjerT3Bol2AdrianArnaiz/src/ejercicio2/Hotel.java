package ejercicio2;

public class Hotel {
	Habitacion habitaciones[];
	
	
	public Hotel(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}


	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}


	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	public boolean comprobarLimpia(int num) {
		return habitaciones[num-1].isHecha();
	}
	
	public void imprimirLimpia(int num) {
		if(habitaciones[num-1].isHecha())
			System.out.println("La habitación está hecha");
		else
			System.out.println("La habitacion no está hecha");
	}
	
	public double calcularPrecio(int num) {
		return habitaciones[num-1].getPrecioBase()*habitaciones[num-1].getDias();
	}
	
}
