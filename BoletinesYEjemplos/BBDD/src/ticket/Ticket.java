package ticket;

public class Ticket {

	public static void main(String[] args) {
		int reservas = 12873;
		
		for(int i = 0; i < reservas; i++) {
			System.out.printf("insert into ticket (reserva, precio_total) values (%d, %d);\n", i+1, 0);
		}

	}

}
