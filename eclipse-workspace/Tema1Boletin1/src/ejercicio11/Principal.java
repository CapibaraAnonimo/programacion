package ejercicio11;

public class Principal {

	public static void main(String[] args) 
	{
		double caudal = 8;  //litros por segundo
		double horas = 24;
		double litrosXHoras = 0;
		double litrosFin = 0;
		double volumen = 0;
		short conversionHora = 3600;
		short conversionLitro = 1000;
		
		litrosXHoras = caudal * conversionHora;
		litrosFin = litrosXHoras * horas;
		volumen = litrosFin/conversionLitro;
		
		System.out.printf("El volumen de agua que se saca despues de %.2f horas es de %.2f m2", horas, volumen);

	}

}
