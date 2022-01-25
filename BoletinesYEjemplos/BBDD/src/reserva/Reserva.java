package reserva;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class Reserva {

	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2016, 1, 1);
		DayOfWeek diaSemana = fecha.getDayOfWeek();
		int diaS = diaSemana.getValue();

		Month mesEnum = fecha.getMonth();
		int mes = mesEnum.getValue();

		int mesas = 0, clientes = 0;
		int maxMesa = 15, minMesa = 5, maxCliente = 3000, minCliente = 0;
		Random ran = new Random(System.nanoTime());

		for (int i = 0; i < 1300; i++) {
			mesas = ran.nextInt(maxMesa - minMesa + 1) + minMesa;

			diaSemana = fecha.getDayOfWeek();
			diaS = diaSemana.getValue();

			mesEnum = fecha.getMonth();
			mes = mesEnum.getValue();

			for (int j = 0; j < mesas; j++) {
				clientes = ran.nextInt(maxCliente - minCliente + 1) + minCliente;
				System.out.printf("insert into reserva (mesa, fecha, cliente) values (%d, '%d-%02d-%02d', %d);\n", (j + 1),
						fecha.getYear(), mes, fecha.getDayOfMonth(), clientes);
			}
			if (diaS == 1)
				fecha = fecha.plusDays(1);
			else if (diaS == 2)
				fecha = fecha.plusDays(1);
			else if (diaS == 3)
				fecha = fecha.plusDays(1);
			else if (diaS == 4)
				fecha = fecha.plusDays(1);
			else if (diaS == 5)
				fecha = fecha.plusDays(3);
			else if (diaS == 6)
				fecha = fecha.plusDays(2);
			else if (diaS == 7)
				fecha = fecha.plusDays(1);
		}

	}

}
