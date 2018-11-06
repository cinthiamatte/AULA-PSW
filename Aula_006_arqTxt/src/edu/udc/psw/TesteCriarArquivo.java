package edu.udc.psw;

public class TesteCriarArquivo {

	public static void main(String[] args) {
		CriarArqTexto arq = new CriarArqTexto();
		
		arq.openFile();
		arq.adicionaRegistros();
		arq.closeFile();
	}

}
