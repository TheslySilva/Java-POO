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
	private void setSalario(double salario){
		this.salario=salario;
	}
	//
	public void gerarAumento(double aumento){
		double resultado= this.salario*aumento/100.0;
		 setSalario(resultado+this.salario);
	}
	//toString
	public String toString(){
		return "Id = "+this.id+"\nNome = "+ this.nome+"\nSalario = "+ this.salario;
	}
}