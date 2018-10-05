package udc.edu.psw;

public class NoLista {
	
	private NoLista proximo;
	private NoLista anterior;
	private Object dados;
	
	public NoLista(Object dados) {
		
		this.setDados(dados);
		setProximo(null);
		setAnterior(null);
	} //metodo construtor

	public NoLista getProximo() {
		return proximo;
	}

	public void setProximo(NoLista proximo) {
		this.proximo = proximo;
	}

	public NoLista getAnterior() {
		return anterior;
	}

	public void setAnterior(NoLista anterior) {
		this.anterior = anterior;
	}

	public Object getDados() {
		return dados;
	}

	public void setDados(Object dados) {
		this.dados = dados;
	}

	public void setAnteriorProx(Object setProximo) {
		// TODO Auto-generated method stub
		
	}
}
