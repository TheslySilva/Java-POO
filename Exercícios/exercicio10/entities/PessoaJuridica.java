package entities;

public class PessoaJuridica extends Pessoa {
	private Integer funcionarios;
	//
	//Construtor
	//
	public PessoaJuridica(String nome,Double rendaAnual,int funcionarios){
		super(nome,rendaAnual);
		this.funcionarios=funcionarios;
	}
	//
	//
	@Override
	public String impostoPago(){
		
		return getNome()+": $ "+String.format("%.2f",taxaPaga());
	}
	
	public Double taxaPaga(){
		
		double resultado;
		
		if (funcionarios>10){
			
			resultado=getRendaAnual()*14.00/100.00;
			
		}else{
			
			resultado = getRendaAnual()*16.00/100.00;
			
		}
		
		return resultado;
	}
}