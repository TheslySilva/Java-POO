package exercicio02;

import exercicio02.Funcionario;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite os dados do Funcionario:");
		
		System.out.print("Nome : ");
		String nome=sc.nextLine();
		
		System.out.print("Salario bruto : ");
		double salario=sc.nextInt();
		
		System.out.print("Imposto : ");
		double imposto=sc.nextInt();
		
		Funcionario f1= new Funcionario(nome,salario,imposto);
		System.out.println(f1.impostoPago());
		
		System.out.print("\nPorcentagem de seu aumento :");
		f1. gerarAumento(sc.nextDouble());
		
		
		System.out.println(f1.statusAumento());
		
		f1.statusAtual();
		
		
	}
}