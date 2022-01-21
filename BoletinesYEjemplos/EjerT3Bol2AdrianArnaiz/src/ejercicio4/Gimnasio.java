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
	
	public double calcularImc(int id) {
		for(int i = 0; i < clientes.length; i++)
		{
			if(clientes[i] != null)
			{
				if(clientes[i].getId() == id)
					return clientes[i].imc();
			}
		}
		System.out.println("No existe el usuario");
		return 0;
	}

	public void mostrarClientes() {
		for(int i = 0; i < clientes.length; i++)
		{
			System.out.printf("Cliente %d:\n%s\n\n", i+1, clientes[i]);
		}
	}
	
	public void darDeBaja(int id) {
		for(int i = 0; i < clientes.length; i++)
		{
			if(clientes[i] != null) {
				if(clientes[i].getId() == id)
					clientes[i] = null;
			}
		}
	}
}