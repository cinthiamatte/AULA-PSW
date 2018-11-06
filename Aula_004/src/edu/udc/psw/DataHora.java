package edu.udc.psw;

public class DataHora {
	private Data data;
	private Hora hora;
	
	public DataHora() {
		data = new Data();
		hora = new Hora();
	}

	public String toString() {
		return String.format("%s - %s", data, hora);
	}
}
