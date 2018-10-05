package udc.edu.psw;

public class ListaEncad {
	private NoLista inicio;
	private NoLista fim;
	private int tamanho = 0;
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void inserirHead(Object dados){
		
		NoLista novo = new NoLista(dados);
		
		if(isEmpty()) {
			
			inicio = novo;
			fim = novo;
		}
		else {
			inicio.setAnterior(novo);
			novo.setProximo(inicio);
			inicio = novo;
		}
		
		tamanho++;
		
	}//inserir no inicio
	
	public void inserirMeio(Object dados) {
		
		NoLista novo = new NoLista(dados);
		NoLista aux = inicio;
		int cont = 1;
		
		if(isEmpty()) {
			
			inicio = novo;
			fim = novo;
		}
		else {
			while(cont < tamanho) {
				aux = aux.getProximo();
				cont++;
			}
			
			novo.setAnterior(aux.getAnterior()); 
			novo.setProximo(aux);
			aux.setAnteriorProx(novo);
			aux.setAnterior(novo);
		}
		tamanho++;
			
	}
		
	public void inserirTail(Object dados) {
		
		NoLista novo = new NoLista(dados);
		
		if(isEmpty()) {
			
			inicio = novo;
			fim = novo;
		}
		else {
			novo.setAnterior(fim);
			fim.setProximo(novo);
			novo = fim;
		}
		
		tamanho++;
		
	}//inserir no fim

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
