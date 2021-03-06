package ejercicio5;

public class Tienda {
	private Electrodomestico electrodomesticos[];
	
	public Tienda(Electrodomestico lista[]) {
		this.electrodomesticos = lista;
	}
	
	public void mostrarLista() {
		for(int i = 0; i < electrodomesticos.length; i++) 
		{
			if(electrodomesticos[i] != null) 
				System.out.printf("\n%d.\n%s\n", i+1, electrodomesticos[i]);
		}
	}
	
	public double precioElectrodomestico(int electrodomestico) {
		return electrodomesticos[electrodomestico-1].precioFinal();
	}
	
	public double sumaPrecios() {
		double suma = 0;
		for(int i = 0; i < electrodomesticos.length; i++)
		{
			if(electrodomesticos[i] != null)
				suma = suma + electrodomesticos[i].precioFinal();
		}
		return suma;
	}
	
	public double mediaPrecios() {
		double unidades = 0;
		double suma = 0;
		for(int i = 0; i < electrodomesticos.length; i++)
		{
			if(electrodomesticos[i] != null)
			{
				suma = suma + electrodomesticos[i].precioFinal();
				unidades++;
			}
		}
		return sumaPrecios()/unidades;
	}

}
