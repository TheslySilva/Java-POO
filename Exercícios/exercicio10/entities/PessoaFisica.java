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
	private double impostoGerado(){
		double resultado;
		
		if (getRendaAnual()>20000){
			
			resultado=( getRendaAnual()*25.00/100.00)-(gastosComSaude*50.00/100.00);
			
		}else{
			resultado= (getRendaAnual()*15.00/100.00)-(gastosComSaude*50.00/100.00);
			
		}
		
		return resultado;
	}
	
	@Override
	public String imposto(){
		return getNome()+": $ "+String.format("%.2f",impostoGerado());
	}
}