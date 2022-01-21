package ejercicio5;

public class Electrodomestico {
	private double precioBase;
	private String color;
	private char consumo;
	private int pesoKg;
	
	public Electrodomestico() {
		super();
		this.precioBase = 100;
		this.color = "Blanco";
		this.consumo = 'F';
		this.pesoKg = 5;
	}
	
	public Electrodomestico(double precioBase, int pesoKg) {
		super();
		this.precioBase = precioBase;
		this.color = "Blanco";
		this.consumo = 'F';
		this.pesoKg = pesoKg;
	}
	
	public Electrodomestico(double precioBase, String color, char consumo, int pesoKg) {
		super();
		this.precioBase = precioBase;
		if(comprobarColor(color))
			this.color = color;
		else
			this.color = "Blanco";
		if(comprobarConsumoEnergetico(consumo))
			this.consumo = consumo;
		else
			this.consumo = 'F';
		this.pesoKg = pesoKg;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public int getPesoKg() {
		return pesoKg;
	}

	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public boolean comprobarConsumoEnergetico(char letra)
	{
		if((letra >= 65 && letra <= 70) || (letra >= 97 && letra <= 102))
			return true;
		else 
			return false;
	}
	
	public boolean comprobarColor(String color)
	{
		if(color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris" 
				|| color == "BLANCO" || color == "NEGRO" || color == "ROJO" || color == "AZUL" || color == "GRIS"
				|| color == "Blanco" || color == "Negro" || color == "Rojo" || color == "Azul" || color == "Gris")
			return true;
		else
			return false;
	}
	
	public double precioFinal() {
		if(consumo == 65 || consumo == 97)
			return precioBase+100;
		else if(consumo == 66 || consumo == 98)
			return precioBase+80;
		else if(consumo == 67 || consumo == 99)
			return precioBase+60;
		else if(consumo == 68 || consumo == 100)
			return precioBase+50;
		else if(consumo == 69 || consumo == 101)
			return precioBase+30;
		else 
			return precioBase+10;
	}

}
