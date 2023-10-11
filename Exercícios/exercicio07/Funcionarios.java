package exercicio07;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	//Construtor
	public Funcionario(int id, String nome, double salario){
		
		this.id=id;
		this.nome=nome;
		this.salario=salario;
	}
	//Get e Set
	//
	public int getId(){
		return this.id;
	}
	//
	public String getNome(){
		return this.nome;
	}
	//
	public double getSalario(){
		return this.salario;
	}
	private setSalario(double salario){
		this.salario=salario;
	}
	//toString
	public String toString(){
		return "Id = "+this.id+", Nome = "+ this.nome+" , Salario = "+ this.Salario;
	}
}