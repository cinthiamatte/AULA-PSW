package udc.edu.psw;

public class MesaDeRestaurante {
	private int qtdClientes; //clientes na mesa
	private int qtdBebidas; //bebidas servidas na mesa
	private int limiteClientes; // número máximo de clientes na mesa

	public MesaDeRestaurante(int limite) {
		limiteClientes = limite;
	}
	
	// Adiciona uma bebida
	public void adicionaBebida() {
		qtdBebidas++;
	}

	// Adiciona um cliente na mesa
	public void adicionaCliente() {
		if(qtdClientes < limiteClientes)
			qtdClientes++;
	}
	
	// Verifica se a mesa está ocupada
	public boolean estaOcupada() {
		if(qtdClientes > 0)
			return true;
		return false;
	}

	// Calcula o valor da conta de uma determinada mesa
	public float calculaConta(float precoBebida, float precoPrato) {
		float total = qtdBebidas * precoBebida;
		total += qtdClientes * precoPrato;
		return total;
	}

	public float calculaContaPorCliente(float precoBebida, float precoPrato) {
		return calculaConta(precoBebida, precoPrato) / qtdClientes;
	}
	
	public void fecharMesa() {
		qtdBebidas = 0;
		qtdClientes = 0;
	}

}
