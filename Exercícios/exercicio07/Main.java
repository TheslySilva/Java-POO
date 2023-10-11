package exercicio07;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import exercicio07.Funcionario;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFuncionario = new ArrayList<>();
		
		int n;
		int x;
		int i;
		int idEncontrado = -1;
		
		System.out.print("Quantos funcion\u00e1rios ser\u00e3o cadastrados? ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			
			System.out.println("\nFuncionario #" + (i + 1) + ":");
			
			System.out.print("\nID : ");
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Nome : ");
			String nome = sc.nextLine();
			
			System.out.print("Salario : ");
			double salario = sc.nextDouble();
			
			addFuncionario(listaFuncionario, new Funcionario(id, nome, salario));
		}
		
		System.out.print("\nInforme o ID do funcion\u00e1rio que ter\u00e1 aumento salarial: ");
		x = sc.nextInt();
		
		for (Funcionario pegarID : listaFuncionario) {
			if (pegarID.getId() == x) {
				
				idEncontrado = 0;
				
				System.out.print("Entre com a porcentagem : ");
				double aumento = sc.nextDouble();
				pegarID.gerarAumento(aumento);
				break;
			}
		}
		if (idEncontrado == -1) {
			System.out.println("ID nao encontrado!");
		}
		
		System.out.println("\nDADOS DOS FUNCIONARIOS");
		
		for (Funcionario pegarFuncionarios : listaFuncionario) {
			System.out.println();
			System.out.println(pegarFuncionarios.toString());
		}
	}
	
	private static void addFuncionario(List<Funcionario> listaFuncionario, Funcionario novoFuncionario) {
		for (Funcionario verificar : listaFuncionario) {
			if (verificar.getId() == novoFuncionario.getId()) {
				System.out.println("ID repetido!");
				return;
			}
		}
		listaFuncionario.add(novoFuncionario);
	}
}