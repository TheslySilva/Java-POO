package exercicio09.programa;

import exercicio09.entities.ProdutoImportado;
import exercicio09.entities.ProdutoUsado;
import exercicio09.entities.Produto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.List;


public class Main {
	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc= new Scanner(System.in);
		
		List<Produto> lista= new ArrayList<>();
		
		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++){
			System.out.println("\nEntre com os dados do #"+(i+1)+" produto:\n");
			System.out.print("Comum, Usado ou Importado (C | U | I)? ");
			char estado= sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("\nNome: ");
			String nome= sc.nextLine();
			
			System.out.print("Preço: ");
			double preco= sc.nextDouble();
			
			if (estado == 'C'){
				
				lista.add(new Produto(nome,preco));
				
			}else if(estado =='U'){
				
				System.out.print("Data de fabricação: ");
				Date data= sdf.parse(sc.next());
				
				lista.add(new ProdutoUsado(nome,preco,data));
					
			}else if(estado == 'I'){
				
				System.out.print("Taxa Alfandegaria: ");
				Double taxaAlfandegaria= sc.nextDouble();
				
				lista.add(new ProdutoImportado(nome,preco,taxaAlfandegaria));
				
			}
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\nTabela de preços:\n");
		
		for (Produto produtos: lista){
			System.out.println(produtos.informacao());
		}
	}
}