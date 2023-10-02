package exercicio02;

public class Funcionario {
	//Atributos
	private String nome;
	private double salario;
	private double imposto;
	
	//Metodos
	
	//Construtor
	public Funcionario(String nome,double salario,double imposto){
		
		this.nome=nome;
		this.salario=salario;
		this.imposto=imposto;
	}
	//Metodos set e get
	private String getNome(){
		return this.nome;
	}
	//
	private double getSalario(){
		return this.salario;
	}
	//
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