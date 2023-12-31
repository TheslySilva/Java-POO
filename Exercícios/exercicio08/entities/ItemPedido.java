package exercicio08.entities;

import exercicio08.entities.Produtos;

public class ItemPedido {
	
	private Integer quantidade;
	private Double preco;
	//
	public Produtos produtos;
	//
	public  ItemPedido(int quantidade,double preco, Produtos produtos){
		
		this.quantidade= quantidade;
		this.preco=preco;
		this.produtos= produtos;
	}
	//
	public Double somaTotal(){
		
		return this.preco*this.quantidade;
	}
	//
	public String toString(){
		
		return "\n"+produtos.getNome()+", $"
		+String.format("%.2f",preco)
		+" ,Quantidade: "+ quantidade
		+",Valor total: $"+String.format("%.2f%n",somaTotal()) ;
	}
}