package exercicio06;

import java.util.Scanner;
import exercicio06.Quartos;



public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n,i;
		
		
		System.out.print("Quantos quartos serão alugados? ");
		n=sc.nextInt();
		
		Quartos[] rooms= new Quartos[10];
		
		for (i=0;i<n;i++){
			sc.nextLine();
			System.out.println("\nAluguel #"+(i+1));
			
			System.out.print("\nNome : ");
			String nome= sc.nextLine();
			
			System.out.print("Email : ");
			String email= sc.next();
			
			System.out.print("Quarto : ");
			int local=sc.nextInt();
			
			rooms[local]=new Quartos(nome,email);
			
		}
		System.out.println("\nQuartos ocupados :\n");
		
		for (i=0;i<10; i++){
			if (rooms[i]!= null){
				System.out.println(i+" : "+rooms[i].toString());
			}
		}
		
		sc.close();
	}
}