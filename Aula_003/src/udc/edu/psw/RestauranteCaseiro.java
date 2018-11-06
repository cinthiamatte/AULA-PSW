package udc.edu.psw;

public class RestauranteCaseiro {
	private int totalMesas;
	private float precoPrato;
	private float precoBebida;
	private float totalVendasDia;
	private int mesasOcupadas;
	
	private MesaDeRestaurante mesas[];
	
	public RestauranteCaseiro(int qtdMesas) {
		totalMesas = qtdMesas;
		
		mesas = new MesaDeRestaurante[totalMesas];
		
		for(int i = 0; i < qtdMesas; i++)
			mesas[i] = new MesaDeRestaurante(4);
	}
	
	public void custoBebida(float precoCusto) {
		precoBebida = precoCusto * 1.4F;
	}
	
	public void custoPrato(float precoCusto) {
		precoPrato = precoCusto * 1.25F;
	}
	
	// Adiciona uma bebida na mesa
	public void adicionaBebida(int mesa) {
		mesas[mesa].adicionaBebida();
	}
	
	// Adiciona um cliente na mesa
	public void adicionaCliente(int mesa) {
		if(!mesas[mesa].estaOcupada())
			mesasOcupadas++;
		
		mesas[mesa].adicionaCliente();
		return;
	}
	
	// Calcula o valor da conta de uma determinada mesa
	public float calculaConta(int mesa) {
		return mesas[mesa].calculaConta(precoBebida, precoPrato);
	}
	
	public float calculaContaPorCliente(int mesa) {
		return mesas[mesa].calculaContaPorCliente(precoBebida, precoPrato);
	}
	
	// Fechar a conta de uma mesa
	public float fecharMesa(int mesa) {
		float valor = mesas[mesa].calculaConta(precoBebida, precoPrato);
		mesas[mesa].fecharMesa();
		totalVendasDia += valor;
		mesasOcupadas--;
		return valor;
	}
}
