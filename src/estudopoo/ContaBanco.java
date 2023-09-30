package estudospoo;

import java.lang.reflect.Constructor;
import estudospoo.ContaBanco;

public class ContaBanco {
	
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	//Metodos Especiais
	
	public ContaBanco() {
		this.setSaldo(0.0);
		this.setStatus(false);
	}
	
	//numConta
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	//Tipo
	public void  setTipo(String tipo){
		
		this.tipo=tipo;
	}
	public String getTipo(){
		
		return this.tipo;
	}
	//Dono
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	//Saldo
	public void setSaldo(double saldo){
		
		this.saldo=saldo;
	}
	public double getSaldo(){
		
		return this.saldo;
	}
	
	//Status
	public void setStatus(boolean status){
		this.status=status;
	}
	public boolean getStatus(){
		return this.status;
	}
	
	//Metodos personalizados
	
	//Abrir conta
	public void abrirConta(String tipo) {
		
		this.setTipo(tipo);
		this.setStatus(true);
		
		if(t.equals("CC")){
			
			this.setSaldo(50.0);

		}else if(tipo.equals("CP")){
			
			this.setSaldo(150.0);
		}
			System.out.println("Sucesso!");
	}
	
	//Fechar conta
	public void fecharConta() {
		
		if(saldo>0){
			
			System.out.println("Conta com dinheiro!");
		}else if(saldo<0){
			
			System.out.println("Conta em debito");
		}else{
			this.setStatus(false);
		}
		
	}
	
	//Dositar
	public void depositar(double valor) {
		
		if(status==true){
			
		this.setSaldo(this.getSaldo()+valor);
		System.out.println("Deposito realizado com sucesso!");
 	}else{
			System.out.println("Impossivel depositar!");
		}
	}
	//Sacar
	public void sacar(double saldo) {
		if (this.status=true){
		if(this.saldo>0){
			this.saldo=saldo-saldo;
			System.out.println("Saque realizado com sucesso!");
		}else{
				System.out.println("Saldo insulficiente!");
			}
		}else{
			System.out.println("Impossivel sacar!");
		}
	}
	
	//Pagamento Mensal
	public void pagarMensal() {
		
		double pagar=0;
		
		if(this.getTipo().equals("CC")){
			
			pagar=15;
		}else if(this.getTipo().equals("CP")){
			
			pagar=20;
		}
		if(this.status== true){
			this.saldo= saldo-pagar;
		}else{
			System.out.println("Impossivel pagar!");
		}
	}
}