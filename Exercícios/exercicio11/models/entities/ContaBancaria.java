package exercicio11.models.entities;

import exercicio11.models.exceptions.SaqueException;

public class ContaBancaria {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteDeSaque;
	
	//Construtor
	public ContaBancaria(Integer numero, String titular, Double saldo, Double limiteDeSaque) {
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}
	
	//Gets e Sets
	public Integer getNumero() {
		return this.numero;
	}
	
	public String gettitular() {
		return this.titular;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public Double getLimiteDeSaque() {
		return this.limiteDeSaque;
	}
	
	//Metodos personalizados
	public void deposito(Double valor) {
		
	}
	
	public void saque(Double valor) throws SaqueException {
		
		if (saldo < valor) {
			
			throw new SaqueException ("Saldo insulficiente!");
			
		} else if (valor > limiteDeSaque) {
			
			throw new SaqueException("Limite de saque insulficiente!");
			
		} 
			this.saldo -= valor;	
		
	}
	public String informacoes(){
		return "\nSaldo atualizado: "+String.format("$%.2f",saldo);
	}
}