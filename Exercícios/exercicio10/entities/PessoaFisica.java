package entities;

import entities.Pessoa;

public class PessoaFisica extends Pessoa {
	
	private double gastosComSaude;
	//
	//Construtor
	//
	public PessoaFisica(String nome, double rendaAnual,double gastosComSaude){
		super(nome,rendaAnual);
		this.gastosComSaude=gastosComSaude;
	}
	//
	//Gets
	//
	public double getGastosComSaude(){
		return this.gastosComSaude;
	}
	//
	//
	@Override
	public String impostoPago(){
		return getNome()+": $ "+String.format("%.2f",taxaPaga());
	}
	public Double taxaPaga(){
		double resultado;
		
		if (getRendaAnual()>20000){
			
			resultado=( getRendaAnual()*25.00/100.00)-(gastosComSaude*50.00/100.00);
			
		}else{
			resultado= (getRendaAnual()*15.00/100.00)-(gastosComSaude*50.00/100.00);
			
		}
		
		return resultado;
	}
}