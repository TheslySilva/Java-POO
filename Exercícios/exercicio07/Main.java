package exercicio07;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n,i;
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		n=sc.nextInt();
		
		for (i=0;i<n ;i++ ) {
			System.out.println("Funcionario #"+(i+1)+":");
			
		}
	}
}