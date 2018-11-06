package edu.udc.psw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriarArqTexto {
	private FileWriter objEscrita;
	
	public void openFile() {
		try {
			objEscrita = new FileWriter("d:\\politicos.txt");
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void adicionaRegistros() {
		Politico politico = new Politico();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf( 
		         "Para terminar, digite <ctrl> d no UNIX/Linux/Mac OS X\n" +
		         "ou <ctrl> z no Windows.\n\n" );
		
		System.out.println("Informe os dados do Politico "
				+ "(numero, nome, partido):");
		
		while (sc.hasNext()) { // Laço é encerrado ao ler EOF (fim do arquivo)
			politico.setNumero(sc.nextInt());
			politico.setNome(sc.next());
			politico.setPartido(sc.next());
			
			if(politico.getNumero() > 0) {
				try {
					objEscrita.append(
							String.format("%5s %5d %s\n",
									politico.getPartido(),
									politico.getNumero(),
									politico.getNome())
							);
				} catch (IOException e) {
					e.printStackTrace();
					System.exit(0);
				}
			} else {
				System.out.println("O numero deve ser maior que 0.");
			}
		}
	}
	
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
	}

}
