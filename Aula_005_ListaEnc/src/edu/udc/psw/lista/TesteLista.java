package edu.udc.psw.lista;


public class TesteLista {

	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
				
		lista.inserir(5, 1);
		lista.inserir(8, 2);
		lista.inserir(5, 2);
		//lista.inserir(new Float(3), 2);
		lista.inserir(new Integer(14), 2);
		//lista.inserir(new String("Maria"), 2);
		iterarLista(lista);
		System.out.println("RemoverInicio: " +lista.removerInicio());
		System.out.println("RemoverFim: " +lista.removerFim());
		System.out.println("Remover pos 2: " +lista.remover(2));
		iterarLista(lista);
	}
	
	public static void mostraLista(ListaEncadeada lista) {
		int numElem = lista.getTamanho();
		
		System.out.println("Lista com " + numElem + " nós.");
		for(int i = 1; i <= numElem; i++) {
			System.out.println(i + " -> " + lista.pesquisar(i));
		}
		System.out.println("Fim da lista.");
	}
	
	public static void iterarLista(ListaEncadeada lista) {
		Iterador it = lista.getInicio();
		Object obj;
//		int i = 1;
//		while((obj = it.proximo()) != null)
//			System.out.println(i++ + " -> " + obj);

//		for(int i = 1; (obj = it.proximo()) != null; )
//			System.out.println(i++ + " -> " + obj);
		
		for(int i = 1; 
				(obj = it.proximo()) != null; 
				System.out.println(i++ + " -> " + obj)
			);
		

	}

}
