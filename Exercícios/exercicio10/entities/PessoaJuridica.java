package entities;

public class PessoaJuridica extends Pessoa {
	private Integer funcionarios;
	
	
	public PessoaJuridica(String nome,Double rendaAnual,int funcionarios){
		super(nome,rendaAnual);
		this.funcionarios=funcionarios;
	}
	//
	private double impostoGerado(){
		double resultado;
		
		if (funcionarios>10){
			
			resultado=getRendaAnual()*14.00/100.00;
			
		}else{
			
			resultado = getRendaAnual()*16.00/100.00;
			
		}
		
		return resultado;
	}
	
	@Override
	public String imposto(){
		
		return getNome()+": $ "+String.format("%.2f",impostoGerado());
	}
}