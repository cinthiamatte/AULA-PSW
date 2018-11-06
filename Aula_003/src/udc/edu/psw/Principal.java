package udc.edu.psw;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		RestauranteCaseiro restaurante = new RestauranteCaseiro(25);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o custo da bebida?");
		float f = sc.nextFloat();
		restaurante.custoBebida(f);
		
		System.out.println("Qual é o custo do prato?");
		f = sc.nextFloat();
		restaurante.custoPrato(f);
		
		restaurante.adicionaCliente(1);
		restaurante.adicionaCliente(1);
		restaurante.adicionaCliente(1);
		restaurante.adicionaBebida(1);
		restaurante.adicionaBebida(1);
		restaurante.adicionaBebida(1);
		restaurante.adicionaBebida(1);
		restaurante.adicionaBebida(1);
		
		System.out.printf("Valor da conta da mesa 1 : %.2f", 
				restaurante.calculaConta(1));
		System.out.printf("Valor da conta da mesa 1 por cliente: %.2f", 
				restaurante.calculaContaPorCliente(1));
		
	}

}
