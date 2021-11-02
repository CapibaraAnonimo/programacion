package calculadoraDePorcentajes;

public class Principal {

	public static void main(String[] args) {
		double pobOcu = 196071.7;
		double pobPar = 3543.8;
		double pobIna = 16417.6;
		
		double tasaAct = (pobOcu + pobPar)/(pobOcu + pobPar + pobIna);
		double tasaPar = pobPar/(pobOcu + pobPar);
		double tasaEmp = pobOcu/(pobOcu + pobPar + pobIna);
		
		System.out.println("La tasa de población activa en tanto por uno es: " + tasaAct + 
				". La tasa de población activa en tanto por cietno es: " + (tasaAct*100) +
				"\nLa tasa de paro en tanto por uno es: " + tasaPar +
				". La tasa de paro en tanto por cietno es: " + (tasaPar*100) +
				"\nLa tasa de empleo en tanto por uno es: " + tasaEmp +
				". La tasa de empleo en tanto por cietno es: " + (tasaEmp*100));

	}

}
