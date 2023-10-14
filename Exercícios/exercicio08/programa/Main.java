package exercicio08.programa;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat formatarData= new SimpleDateFormat();
		
		//Dados do cliente
		
		System.out.println("Entre com os dados do cliente : ");
		System.out.print("\nNome : ");
		String nome= sc.nextLine();
		//
		sc.nextLine();//limpar quebra de linha
		//
		System.out.print("Email : ");
		String email= sc.nextLine();
		//
		System.out.print("Data de nascimento (DD/MM/YYYY) : ");
		Date aniversario= formatarData.parse(sc.next());
		
		Cliente cliente = new cliente(nome,email,aniversario);
		
		//Dados do estoque
		
		System.out.println("Entre com os dados do estoque :");
		System.out.print("Estado : ");
		StatusDoProduto status = StatusDoProduto.valueOf(sc.next());
		
		//Adicionando items ao pedido
		
		System.out.print("Quantos itens para este pedido?");
		int n= sc.nextInt():
		
		for(int i = 0; i<n; i++){
			
			System.out.println("Entre com os dados do #"+(i+1)+" produto :");
			
			System.out.print("\nNome do produto : ");
			sc.nextLine();//limpar quebra de linha
			String nome = sc.nextLine();
			
			System.out.print("Preço do produto : ");
			double preco= sc.nextDouble();
			
			System.out.print("Quantidade : ");
			int quantidade= sc.nextInt();
			
			Produto produto= new Produto(nome,preco,quantidade)
			
		}
	}
}