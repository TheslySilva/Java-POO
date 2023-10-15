package entities;

public abstract class Pessoa {
	private String nome;
	private Double rendaAnual;
	
	//
	//Construtor
	//
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}
	//
	//Gets
	//
	public String getNome() {
		return nome;
	}
	
	public double getRendaAnual() {
		return rendaAnual;
	}
	//
	//Metedos Abstrato
	//
	public abstract  String impostoPago();
	public abstract Double taxaPaga();
	
}