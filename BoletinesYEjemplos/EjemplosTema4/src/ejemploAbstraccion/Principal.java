package ejemploAbstraccion;

public class Principal {

	public static void main(String[] args) {
		Figura cuadrado = new Cuadrado(1, 2, 2);
		
		System.out.println(cuadrado.calcularArea());

	}
}

