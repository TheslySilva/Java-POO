package exercicio02;

import exercicio02.Funcionario;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Funcionario f1= new Funcionario();
		
		System.out.println("Digite os dados do Funcionario:");
		
		System.out.print("Nome : ");
		f1.setNome(sc.nextLine());
		
		System.out.print("Salario bruto : ");
		f1.setSalario(sc.nextInt());
		
		System.out.print("Imposto : ");
		f1.setImposto(sc.nextInt());
		
		System.out.println(f1.impostoPago());
		
		System.out.print("\nPorcentagem de seu aumento :");
		f1.setAumento(sc.nextDouble());
		
		System.out.println(f1.statusAumento());
		
		f1.status();
		
		
	}
}