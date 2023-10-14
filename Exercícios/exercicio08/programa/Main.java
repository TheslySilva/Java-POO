package exercicio08.programa;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import  java.util.Date;
import java.util.Locale;
import java.text.ParseException;

import exercicio08.enums.StatusDoPedido;
import exercicio08.entities.Estoque;
import exercicio08.entities.Cliente;
import exercicio08.entities.Produtos;
import exercicio08.entities.ItemPedido;

public class Main {
	
	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		
		Scanner sc= new Scanner(System.in);
		SimpleDateFormat formatarData= new SimpleDateFormat("dd/MM/yyyy");
		
		//Dados do cliente
		
		System.out.println("Entre com os dados do cliente : ");
		
		System.out.print("\nNome : ");
		String nome= sc.nextLine();
		//
		System.out.print("Email : ");
		String email= sc.nextLine();
		//
		System.out.print("Data de nascimento (DD/MM/YYYY) : ");
		Date aniversario= formatarData.parse(sc.next());
		
		Cliente cliente = new Cliente(nome,email,aniversario);
		

		//Dados do estoque
		
		System.out.println("\nEntre com os dados do estoque :");
		System.out.print("\nEstado : ");
		StatusDoPedido status = StatusDoPedido.valueOf(sc.next());
		
		Estoque estoque = new Estoque(new Date(), status,cliente);
		//Adicionando items ao pedido
		
		System.out.print("Quantos itens para este pedido? ");
		int n= sc.nextInt();
		
		for(int i = 0; i<n; i++){
			
			System.out.println("\nEntre com os dados do #"+(i+1)+" produto :");
			
			System.out.print("\nNome do produto : ");
			sc.nextLine();//limpar quebra de linha
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço do produto : ");
			double preco= sc.nextDouble();
			
			Produtos produto= new Produtos(nomeProduto,preco);
			
			System.out.print("Quantidade : ");
			int quantidade= sc.nextInt();
			
			
			
			ItemPedido itemPedido= new ItemPedido(quantidade,preco,produto);
			
			estoque.addItem(itemPedido);
			
		}
		System.out.println("\nResumo do pedido:\n");
		System.out.print(estoque);
	}
}