package exercicio11.programa;

import java.util.Scanner;
import exercicio11.models.entities.ContaBancaria;
import exercicio11.models.exceptions.SaqueException;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			//Dadoa do Titular
			System.out.println("Entre com os dados da conta:");
			
			System.out.print("\nNumero da conta: ");
			int numero = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			
			System.out.print("Saldo inicial: ");
			double saldo = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			double limiteDeSaque = sc.nextDouble();
			
			ContaBancaria pessoa1 = new ContaBancaria(numero, titular, saldo, limiteDeSaque);
			
			//Saques
			System.out.print("\nEntre com o valor do saque: ");
			double saque = sc.nextDouble();
			
			pessoa1.saque(saque);
			
			System.out.println(pessoa1.informacoes());
			
		} catch (SaqueException e) {
			
			System.out.println("\nErro ao realizar saque: " + e.getMessage());
		}
	}
}