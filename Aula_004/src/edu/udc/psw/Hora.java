package edu.udc.psw;

public class Hora {
	private byte hora;
	private byte minuto;
	
	private byte validaHora(byte hora) {
		if(hora > 23)
			return 0;
		return hora;
	}
	public Hora(byte hora, byte minuto) { // Construtor sobrecarregado
		
		this.hora = validaHora(hora);
		this.minuto = minuto;
	}
	// Polimorfismo
	public Hora() { // Construtor sobrecarregado
		hora = 0;
		minuto = 0;
	}
	public void setHora(byte hora) {
		this.hora = validaHora(hora);
	}
	public byte getHora() {
		return hora;
	}
	public byte incrementaHora() {
		hora++;
		return hora;
	}
	public byte incrementaMinuto() {
		minuto++;
		return minuto;
	}
	public void zerar() {
		hora = 0;
		minuto = 0;
	}
	public String toString() {
		return String.format("%02d:%02d", hora, minuto);
	}
}
