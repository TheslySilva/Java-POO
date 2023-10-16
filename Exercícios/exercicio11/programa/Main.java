package exercicio11.programa;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//Dadoa do Titular
		
		System.out.println("Entre com os dados da conta:");
		
		System.out.print("\nNumero da conta: ");
		int numero= sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Titular: ");
		String titular=sc.nextLine();
		
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		double limiteDeSaque= sc.nextDouble;
		
		ContaBancaria pessoa1 = new ContaBancaria(numero,titular,saldo,limiteDeSaque);
		
		//Saques e Depositos
		
		System.out.print("\nEntre com o valor do saque: ");
		p1.saque(sc.nextDouble());
		
		System.out.println();
	}
}