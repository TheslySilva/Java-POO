package exercicio05;

public class Banco {
	private int conta;
	private String nome;
	private double saldo;
	
	//Construtor
	public Banco(int conta, String nome, double saldo) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public Banco(int conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	//Get e Set
	private void setConta(int conta) {
		this.conta = conta;
	}
	
	private int getConta() {
		return this.conta;
	}
	
	//
	private void setNome(String nomr) {
		this.nome = nome;
	}
	
	private String getNome() {
		return this.nome;
	}
	
	//Deposito e Saque
	public void deposito(double saldo) {
		this.saldo = this.saldo+saldo;
		System.out.println("\nDADOS DA CONTA ATUALIZADOS!\n" + toString());
	}
	
	public void saque(double saldo) {
		this.saldo = this.saldo - saldo;
		this.saldo = this.saldo - 5;
		System.out.println("\nDADOS DA CONTA ATUALIZADOS!\n" + toString());
	}
	
	public String toString() {
		return "\nConta : " + this.conta + "\nProprietario : " + this.nome + "\nSaldo : " + this.saldo;
	}
}