package exercicio02;

import java.io.ObjectInputFilter.Status;

public class Funcionario {
	//Atributos
	private String nome;
	private double salario;
	private double imposto;
	private double aumento;
	
	//Metodos
	
	//Metodos set e get
	public void setNome(String nome){
		this.nome= nome;
	}
	private String getNome(){
		return this.nome;
	}
	//
	public void setSalario(double salario){
		this.salario=salario;
	}
	private double getSalario(){
		return this.salario;
	}
	//
	public void setAumento(double aumento){
		this.aumento=aumento;
	}
	private double getAumento(){
		return this.aumento;
	}
	//
	public void setImposto(double imposto){
		
		this.imposto=imposto;
	}
	public double getImposto(){
		
		return this.imposto;
	}
	
	//Metodos de resultados	
	public double pagarImposto(){
		double imposto= getSalario()-getImposto();
		return imposto;
	}
	public double  gerarAumento(){
		
		double porcentagem=(getSalario()* getAumento())/100;
		double aumento=porcentagem+pagarImposto();
		
		this.salario=aumento;
		
		 return aumento;
	}
	//Status
	public void status(){
		System.out.println("\nNome : "+getNome());
		System.out.println("Salario atual : R$ "+getSalario());
		System.out.println("Taxa paga : R$ "+getImposto());
	}
	public String impostoPago(){
		return "\nFuncionario : "+getNome()+", R$ "+pagarImposto();
	}
	public String statusAumento(){
		return "\nUpdated : "+getNome()+", R$ "+gerarAumento();
	}
	
}