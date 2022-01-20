package ejercicio4;

public class Gimnasio {
	private Cliente clientes[];

	public Gimnasio(Cliente[] clientes) {
		super();
		this.clientes = clientes;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}
	
	public double calcularImc(int cliente) {
		return clientes[cliente-1].imc();
	}

}
sss