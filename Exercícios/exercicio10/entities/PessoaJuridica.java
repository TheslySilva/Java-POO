package entities;

public class PessoaJuridica extends Pessoa {
	private Integer funcionarios;
	
	
	public PessoaJuridica(String nome,Double rendaAnual,int funcionarios){
		super(nome,rendaAnual);
		this.funcionarios=funcionarios;
	}
	
	
	@Override
	public Double imposto(){
		
		double resultado;
		double porcentagem;
		
		if (funcionarios>10){
			
			porcentagem=getRendaAnual()*14.00/100.00;
			resultado= getRendaAnual()+porcentagem;
			
		}else{
			
			porcentagem = getRendaAnual()*16.00/100.00;
			resultado=getRendaAnual()+porcentagem;
		}
		
		return resultado;
	}
}