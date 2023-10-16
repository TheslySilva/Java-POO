package exercicio11.models.entities;

public class ContaBancaria {
	private Integer numero;
	private String dono;
	private Double saldo;
	private Double limiteDeSaque;
	
	//
	//Construtor
	//
	public ContaBancaria (Integer numero, String dono, Double saldo, Double limiteDeSaque) {
		
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}
	//
	//Gets e Sets
	//
	public Integer getNumero(){
		return this.numero;
	}
	public String getDono(){
		return this.dono;
	}
}