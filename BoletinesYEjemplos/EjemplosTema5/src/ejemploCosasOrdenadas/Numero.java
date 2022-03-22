package ejemploCosasOrdenadas;

import java.util.Objects;

public class Numero {
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
		if(obj.getNumero() == numero)
			return true;
		else
			return false;
	}
	
	

}
