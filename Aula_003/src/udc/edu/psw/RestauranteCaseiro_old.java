package udc.edu.psw;

public class RestauranteCaseiro_old {
	private int totalMesas;
	private float precoPrato;
	private float precoBebida;
	private float totalVendasDia;
	private int mesasOcupadas;
	
	private int qtdClientePorMesa[]; //clientes por mesa
	private int qtdBebidas[]; //bebidas servidas por mesa
	
	public RestauranteCaseiro_old(int mesas) {
		totalMesas = mesas;
		
		qtdClientePorMesa = new int[totalMesas];
		qtdBebidas = new int[totalMesas];
	}
	
	public void custoBebida(float precoCusto) {
		precoBebida = precoCusto * 1.4F;
	}
	
	public void custoPrato(float precoCusto) {
		precoPrato = precoCusto * 1.25F;
	}
	
	// Adiciona uma bebida na mesa
	public int adicionaBebida(int mesa) {
		qtdBebidas[mesa]++;
		return qtdBebidas[mesa];
	}
	
	// Adiciona um cliente na mesa
	public int adicionaCliente(int mesa) {
		if(qtdClientePorMesa[mesa] == 0)
			mesasOcupadas++;
		
		qtdClientePorMesa[mesa]++;
		return qtdClientePorMesa[mesa];
	}
	
	// Calcula o valor da conta de uma determinada mesa
	public float calculaConta(int mesa) {
		float total = qtdBebidas[mesa] * precoBebida;
		total += qtdClientePorMesa[mesa] * precoPrato;
		return total;
	}
	
	public float calculaContaPorCliente(int mesa) {
		return calculaConta(mesa) / qtdClientePorMesa[mesa];
	}
	
	// Fechar a conta de uma mesa
	public float fecharMesa(int mesa) {
		float valor = calculaConta(mesa);
		qtdBebidas[mesa] = 0;
		qtdClientePorMesa[mesa] = 0;
		totalVendasDia += valor;
		mesasOcupadas--;
		return valor;
	}
}
