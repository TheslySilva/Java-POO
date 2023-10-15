package entities;

public class PessoaFisica extends Pessoa {
	
	private double gastosComSaude;
	//
	//Construtor
	//
	public PessoaFisica(String nome, double rendaAnual,double gastosComSaude){
		
		super(nome,rendaAnual)
		this.gastosComSaude=gastosComSaude;
	}
	//
	//Gets
	//
	public double getGastosComSaude(){
		return this.gastosComSaude;
	}
	//
	@Override
	public double imposto(){
		double resultado;
		double porcentagem;
		
		if (getRendaAnual()>20000){
			porcentagem= getRendaAnual()*25.00/100.00;
			resultado = getRendaAnual+porcentagem;
		}else{
			porcentagem= getRendaAnual()*15.00/100.00;
			resultado= getRendaAnual()+porcentagem;
		}
		
		return resultado;
	}
}