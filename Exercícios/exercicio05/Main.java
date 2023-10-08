package exercicio05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int conta;
		String nome;
		double saldo;
		char verificacao;
		Banco b1;
		
		System.out.println("DIGITE OS DADOS : \n");
		
		System.out.print("Conta : ");
		conta = sc.nextInt();
		
		nome=sc.nextLine();
		
		System.out.print("Nome : ");
		nome = sc.nextLine();
		
		System.out.print("Vai ter deposito inicial? [S | N] : ");
		verificacao = sc.next().charAt(0);
		
		if (verificacao == 'S') {
			System.out.print("Entre com o deposito inicial : ");
			saldo = sc.nextDouble();
			 b1 = new Banco(conta, nome, saldo);
		} else {
			b1 = new Banco(conta, nome);
		}
		
		System.out.println("\nDados da conta :\n" + b1.toString());
		
		System.out.print("\nEntre com o valor do deposito : ");
		b1.deposito(sc.nextDouble());
		
		System.out.print("\nValor a ser sacado : ");
		b1.saque(sc.nextDouble());
		
	}
}