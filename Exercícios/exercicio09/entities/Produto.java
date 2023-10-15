package exercicio09.entities;

public class Produto {
	
	private String nome;
	private Double valor;
	//
	//Construtor
	//
	public Produto(String nome,Double valor){
		this.nome=nome;
		this.valor=valor;
	}
	//
	//Get e Set
	//
	public String getNome(){
		
		return this.nome;
	}
	//
	public Double getValor(){
		
		return this.valor;
	}
	//
	public void setValor(Double valor){
		this.valor=valor;
	}
	//
	public String informacao(){
		
		StringBuilder sb= new StringBuilder();
		
		sb.append("\n"+nome);
		sb.append(String.format(" $%.2f ",valor));
		
		return sb.toString();
	}
}