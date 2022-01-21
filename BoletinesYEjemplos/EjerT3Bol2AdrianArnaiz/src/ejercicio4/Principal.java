package ejercicio4;

public class Principal {

	public static void main(String[] args) {
		Cliente clientes[] = new Cliente[]{new Cliente(1, "DNI1", "nombre1", "apellido1", true, 76, 178),
				new Cliente(2, "DNI2", "nombre2", "apellido2", true, 89, 170),
				new Cliente(3, "DNI3", "nombre3", "apellido3", true, 104, 194),
				new Cliente(4, "DNI4", "nombre4", "apellido4", false, 76, 178),
				new Cliente(5, "DNI5", "nombre5", "apellido5", true, 76, 178),
				new Cliente(6, "DNI6", "nombre6", "apellido6", true, 76, 178),
				new Cliente(7, "DNI7", "nombre7", "apellido7", false, 76, 178),
				new Cliente(8, "DNI8", "nombre8", "apellido8", true, 76, 178),
				new Cliente(9, "DNI9", "nombre9", "apellido9", true, 76, 178),
				new Cliente(10, "DNI10", "nombre10", "apellido10", true, 76, 178),
				new Cliente(11, "DNI11", "nombre11", "apellido11", true, 76, 178)};
		Gimnasio gimnasio = new Gimnasio(clientes);
		
		gimnasio.darDeBaja(2);
		System.out.println(gimnasio.calcularImc(3));

	}

}
