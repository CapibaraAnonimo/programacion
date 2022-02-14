package ejercicio5;

public class Principal {

	public static void main(String[] args) {
		Empleado e[] = new Empleado[]{new Empleado("Nombre1", 400, 500, 1),
				new EmpleadoAComision("Nombre2", 400, 750, 2, 15),
				new EmpleadoFijo("Nombre3", 400, 505, 3)};
		Oficina o = new Oficina(e);
		
		System.out.println(o.calcularSueldo(2, 15));
		System.out.println(o.CalcularTotal(15));
		
	}

}
