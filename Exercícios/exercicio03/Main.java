package exercicio03;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int nota = 0;
		
		System.out.print("Nome: ");
		nome = nota + sc.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		nota = nota + sc.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		nota = nota + sc.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		nota = nota + sc.nextInt();
		
		System.out.print("Digite a quarta nota: ");
		nota = nota + sc.nextInt();
		
		Notas aluno1 = new Notas(nome, nota);
		
		aluno1.statusAtual();
		
	}
}