package exercicio08.entities;

import exercicio08.entities.Produtos;

public class ItemPedido {
	
	private Integer quantidade;
	private Double preco;
	//
	public Produtos produtos;
	//
	public void ItemPedido(int quantidade,double preco){
		
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
		
		return produtos.getNome()+" , $ "
		+String.format("%.2f%n",preco)
		+" , Quantidade : "+ quantidade
		+", Valor total :  $"+String.format("%.2f%n",somaTotal()) ;
	}
}