package udc.edu.psw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CriarArquivo {
	
	private FileWriter objEscrita;						//object
	
	public void openFile(){
		try { 											//bloco onde pode acontecer um problema
			
			objEscrita = new FileWriter("C:\\Users\\cinth\\Desktop\\Projeto de Software\\politicos.txt");
		} 
		catch (IOException e) {							// descobre onde aconteceu o problema
			
			e.printStackTrace();
			System.exit(0);
		}
	} //abre o arquivo
	
	public void addRegistro() {
		Politico politic = new Politico();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.printf(
				"Para terminar, digite <ctrl>d no UNIX/LINUX/MAC OS X\n" +
				"Ou <ctrl>z no Windows. \n\n");
		
		System.out.println("Informe os dados do Politico\nNumero\nNome\nPartido");
		
		while(scan.hasNext()) {
		// Laço é encerrado ao ler EOF(fim do arquivo) o mesmo é executado tbm enquanto não digitamos as teclas de comando ctrl	
			politic.setNumero(scan.nextInt());
			politic.setNome(scan.next());
			politic.setPartido(scan.next());
			
			if(politic.getNumero()>0) {
				try {
					objEscrita.append( 				//define a entrada de texto no arquivo
							String.format("\n%5d \n%s %5s", 
									politic.getNumero(), politic.getNome(), politic.getPartido())
							);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.exit(0);
				}
			}
			else {
				System.out.println("O numero do partido deve ser maior que 0");
			}
		}
	}// adiciona conteudo
	
	public void closeFile() {
		if(objEscrita != null) {
			try {
				objEscrita.close();
				objEscrita = null;
				
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	} //Fecha o arquivo
}