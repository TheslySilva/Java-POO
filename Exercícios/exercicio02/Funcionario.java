package exercicio02;

public class Funcionario {
	//Atributos
	private String nome;
	private double salario;
	private double imposto;
	
	//Metodos
	//Construtor
	public Funcionario(){
		this.nome="";
		this.salario=0;
		this.imposto=0;
	}
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
	public void gerarAumento(double aumento){
		
		double porcentagem=(getSalario()* aumento)/100;
		double resultado=porcentagem+pagarImposto();
		
		this.salario=resultado;	
	}
	//Status
	public void statusAtual(){
		System.out.println("\nNome : "+getNome());
		System.out.println("Salario atual : R$ "+getSalario());
		System.out.println("Taxa paga : R$ "+getImposto());
	}
	public String impostoPago(){
		return "\nFuncionario : "+getNome()+", R$ "+pagarImposto();
	}
	public String statusAumento(){
		return "\nUpdated : "+getNome()+", R$ "+this.salario;
	}
	
}