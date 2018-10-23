// capitulo 10 implemente;

package udc.edu.psw;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArqSerial {
	
	private ObjectOutputStream out;
	Politico politico = new Politico();
	
	
	public void Open() {
		try {
			out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\cinth\\Desktop\\Projeto de Software\\serial.txt"));
		}
		catch (IOException e) {							// descobre onde aconteceu o problema
			
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void AddRegistro() throws IOException{
		out.writeObject(politico);
	}
}
