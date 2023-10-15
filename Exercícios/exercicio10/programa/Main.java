package programa;

import entities.Pessoa;
import entities.PessoaJuridica;
import entities.PessoaFisica;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		List <Pessoa>lista= new ArrayList<>();
		
		System.out.print("Insira o número de contribuintes");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++){
			
			System.out.println("\nDados do #"+(i+1)" contribuinte:\n");
			System.out.print("Individual ou Empresa (I | E)? ");
			char estado=sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome= sc.nextLine();
			
			System.out.print("Renda Anual: ");
			double rendaAnual= sc.nextDouble();
			
			if (estado=='I') {
			
			System.out.print("Gastos com Saude: ");
			double gastosComSaude= sc.nextInt();
			
			lista.add(new PessoaFisica(nome,rendaAnual,gastosComSaude));
			}else if(estado=='E'){
				System.out.print("Quantidade de Funcionarios: ");
				int funcionarios= sc.nextInt();
				
				lista.add(new PessoaJuridica(nome,rendaAnual,funcionarios));
			}
		}
		
		System.out.println("\nIMPOSTOS PAGOS:");
		for(Pessoa pessoas: lista){
			System.out.println(lista.imposto());
		}
	}
}