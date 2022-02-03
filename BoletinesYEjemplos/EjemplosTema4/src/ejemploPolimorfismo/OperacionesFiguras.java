package ejemploPolimorfismo;

public class OperacionesFiguras {
	public Double calcularElAreaDeUnaFigura(Figura f) {
		return f.calcularArea();
	}

	public double sumarAreas(Figura[] listado) {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + calcularElAreaDeUnaFigura(listado[i]);
		}
		return resultado;
	}

}
