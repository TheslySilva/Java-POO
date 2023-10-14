package exercicio08.entities;

public class Produtos {
	
	private String nome;
	private double preco;
	
	//
	public void Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//
	public String getNome() {
		return this.nome;
	}
	
	//
	public double getPreco() {
		return this.preco;
	}
}