package edu.udc.psw;

public class TesteLerArqTexto {

	public static void main(String[] args) {
		LerArqTexto arq = new LerArqTexto();
		
		arq.openFile();
		arq.lerArquivo();
		arq.closeFile();
	}

}
