package exercicio09.entities;

import java.util.Date;
import exercicio09.entities.Produto;
import java.text.SimpleDateFormat;

public class ProdutoUsado extends Produto{
	
	private Date dataDeFabricacao;
	//
	//Construtor
	//
	public ProdutoUsado(String nome, Double valor, Date dataDeFabricacao){
		super(nome,valor);
		this.dataDeFabricacao=dataDeFabricacao;
	}
	//
	public Date getDataDeFabricacao(){
		return this.dataDeFabricacao;
	}
	//
	@Override
	public String informacao(){
		
		StringBuilder sb= new StringBuilder();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		sb.append("\n"+getNome());
		sb.append(" (Usado)");
		sb.append(String.format(" $%.2f",getValor()));
		sb.append(" (Data de Fabricação: ");
		sb.append(sdf.format(dataDeFabricacao));
		sb.append(")");
		
		return sb.toString();
	}
}