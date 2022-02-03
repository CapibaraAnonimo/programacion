package ejemploPolimorfismo;

public class PruebaPolimorfismo {
	public static void main(String[] args) {
		// Prueba con objetos "sueltos"
		// Figura f1=new Figura (); No se puede crear porque Figura es abstracta
		Cuadrado cu1 = new Cuadrado("Primer cuadrado", "Rojo", 1.0);
		Circulo ci1 = new Circulo("Primer Círculo", "Azul", 1.0);
		System.out.println(cu1);
		System.out.println(ci1);
		System.out.println("*********Área y perímetro**********");
		System.out.println("Área del primer cuadrado: " + cu1.calcularArea());
		System.out.printf("Perímetro del primer círculo: %.2f", ci1.calcularArea());
		// Prueba con polimorfismo
		System.out.println("\n\n\n***********************************************");
		Figura f1 = new Cuadrado("Segundo cuadrado", "verde", 2.0);
		Figura f2 = new Circulo("Segundo círculo", "Amarillo", 2.0);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("*********Áreas**********");
		System.out.println("Usan el método de cada clase concreta porque está sobrescrito");
		System.out.println("Área del segundo cuadrado: " + f1.calcularArea());
		System.out.printf("Perímetro del segundo círculo: %.2f", f2.calcularArea());
		System.out.println(
				"\nPero ahora no pueden usar los métodos que solo están en cuadrado y círculo porque son figuras\n\n");
		// System.out.println(f1.mostrarLados ()); Error de compilación
		// System.out.println(f2.contarRadianes ());Error de compilación
		System.out.println("*******************************************************");
		System.out.println("*******Vamos ahora con el array de objetos**********\n\n");
		// Prueba con array de objetos
		Figura lista[] = new Figura[4];
		// Cargamos el array con objetos cuadrado y círculo indistintamente
		// No podemos hacerlo con figuras porque la clase Figura es abstracta, si no lo
		// fuera sí se podría hacer
		lista[0] = new Cuadrado("Un mísero cuadrado", "negro", 2.0);
		lista[1] = new Circulo("Un mísero círculo", "blanco", 2.0);
		lista[2] = new Circulo("Un círculo grisáceo", "gris", 2.0);
		lista[3] = new Cuadrado("Un cuadrado desnudo", "transparente", 2.0);
		// Una prueba simple de lo que hay en el array es llamar al toString.
		// Dependiendo de //lo que haya guardado en el
		// array se llamará a uno u otro toString
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		// Llamamos a los métodos de la clase OperacionesFiguras para calcular las áreas
		// individualmente y la suma de todas las áreas
		// Creamos un objeto de la clase, aunque debería estar creado arriba, se pone
		// aquí para no liar
		OperacionesFiguras of = new OperacionesFiguras();
		for (int i = 0; i < lista.length; i++) {
			System.out.printf("El área del " + (i + 1) + " es: %.2f \n", of.calcularElAreaDeUnaFigura(lista[i]));
		}
		System.out.printf("La suma de todas las áreas es: %.2f", of.sumarAreas(lista));
		// Dejo para vosotros el probar con el método calcularPerímetro
	}
}
