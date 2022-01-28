package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Motocicleta m = new Motocicleta(15, 150, 1);
		Coche c = new Coche(20, 200, 2);
		Furgoneta f = new Furgoneta(17, 170, 3);
		
		System.out.printf("%s%.2f\n", m, m.calcularImpuesto());
		System.out.printf("%s%.2f\n", c, c.calcularImpuesto());
		System.out.printf("%s%.2f\n", f, f.calcularImpuesto());

	}

}
