package udc.edu.psw.nova;

public class TesteLista {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		mostrarLista(lista);
		lista.inserir(new Integer(5), 1); //utiliza Integer por estar trabalhando com objeto
		mostrarLista(lista);
		lista.inserir(new Integer(8), 2);
		mostrarLista(lista);
		lista.inserir(new Integer(3), 3);
		mostrarLista(lista);
		lista.inserir(new Integer(15), 4);
		mostrarLista(lista);
		lista.inserir(new Integer(4), 5);
		mostrarLista(lista);

	}
	
	public static void mostrarLista(ListaEncadeada lista) {
		int numElem = lista.getTamanho();
		
		System.out.println("Lista com "+ numElem + " nós.");
		for(int i = 1; i <= numElem; i++) {
			System.out.println(i + " -> " + lista.pesquisar(i));
		}
		System.out.println("Fim da lista");
	} // utilizado para manipular somente esses elementos, por isso não é utilizada na classe 
	// ListaEncadeada, pois esta encapsulada 

}