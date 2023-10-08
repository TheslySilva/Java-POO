package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int conta;
		String nome;
		double saldo;
		char verificacao;
		
		System.out.println("Digite os dados");
		System.out.print("Conta : ");
		conta= sc.nextInt();
		System.out.print("Nome : ");
		nome= sc.nextLine();
		
		System.out.println("Vai ter deposito inicial? [S | N] : ");
		verificacao=sc.next();
		
		if (verificacao.equals('S')) 
		
		System.out.print("Entre com o deposito inicial : ");
		saldo= sc.nextDouble();
		
		Banco b1= new Banco(conta,nome,saldo);
		
	}else{
		
	Banco b1= new Banco(conta,nome,)
	
	}
	System.out.println("Dados da conta :\n"+b1.toString());
	
	System.out.print("Entre com o valor do deposito : ");
	b1.deposito(sc.nextDouble);
	
}