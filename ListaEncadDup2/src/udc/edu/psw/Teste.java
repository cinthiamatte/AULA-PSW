package udc.edu.psw;

public class Teste {

	public static void main(String[] args) {
		ListaEncad lista = new ListaEncad();
		
		lista.inserir(new Integer(5), 1); //utiliza Integer por estar trabalhando com objeto
		lista.inserir(new Integer(8), 2);
		lista.inserir(new Integer(3), 3);
		lista.inserir(new Integer(110), 4);
		lista.inserir(new Integer(4), 5);

		mostrarLista(lista);

	}
	
	public static void mostrarLista(ListaEncad lista) {
		int numElem = lista.getTamanho();
		
		System.out.println("Lista com "+ numElem + "nós.");
		for(int i = 1; i <= numElem; i++) {
			System.out.println(i + " -> " + lista.pesquisar(i));
		}
		System.out.println("Fim da lista");
	} // utilizado para manipular somente esses elementos, por isso não é utilizada na classe 
	// ListaEncadeada, pois esta encapsulada 

}