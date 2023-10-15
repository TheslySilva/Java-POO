package exercicio09.entities;

import exercicio09.entities.Produto;

public class ProdutoImportado extends Produto {
	
	private Double taxaAlfandegaria;
	//
	//Construtor
	//
	public ProdutoImportado(String nome, Double valor,Double taxaAlfandegaria){
		super(nome,valor);
		this.taxaAlfandegaria= taxaAlfandegaria;
	}
	//
	public void taxaAplicada(){
		
		Double taxaAplicada= getValor() + taxaAlfandegaria;
		setValor(taxaAplicada);
		
	}
	//Informacoes
	@Override
	public String informacao(){
		StringBuilder sb=new StringBuilder();
		
		taxaAplicada();
		
		sb.append(getNome());
		sb.append(String.format(" $%.2f",getValor()));
		sb.append(" (Taxa Alfandegaria: $");
		sb.append(String.format("%.2f)",taxaAlfandegaria));
		
		return sb.toString();
	}
	
}