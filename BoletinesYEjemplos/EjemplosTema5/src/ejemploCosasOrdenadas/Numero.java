package ejemploCosasOrdenadas;

import java.util.Objects;

public class Numero implements Comparable<Numero> {
	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	public boolean equals(Numero obj) {
		if (obj.getNumero() == numero)
			return true;
		else
			return false;
	}

	@Override
	public int compareTo(Numero o) {
		int temp;
		temp = numero < o.getNumero() ? -1 : 0;
		temp = numero > o.getNumero() ? 1 : 0;
		return temp;
	}

	@Override
	public String toString() {
		return "Numero [numero=" + numero + "]";
	}

}
