package udc.edu.psw;

public class Principal {

	public static void main(String[] args) {
	
		CriarArquivo arq = new CriarArquivo();
		
		arq.openFile();
		arq.addRegistro();
		arq.closeFile();
	}

}
