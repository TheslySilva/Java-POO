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
		this.saldo = 0.0;
		this.status = false;
	}
	
	//numConta
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	//Tipo
	public void  setTipo(String t){
		
		this.tipo=t;
	}
	public String getTipo(){
		
		return tipo;
	}
	//Dono
	public void setDono(String d) {
		this.dono = d;
	}
	
	public String getDono() {
		return dono;
	}
	
	//Saldo
	public void setSaldo(double s){
		
		this.saldo=s;
	}
	public double getSaldo(){
		
		return saldo;
	}
	
	//Status
	public void setStatus(boolean s){
		this.status=s;
	}
	public boolean getStatus(){
		return status;
	}
	
	//Metodos
	public void abrirConta(String t) {
		
		setTipo(t);
		setStatus(true);
		
		if(t.equals("CC")){
			
			setSaldo(50.0);
		}else if(tipo.equals("CP")){
			
			setSaldo(150.0);
		}
	}
	
	public void fecharConta() {
		
		if(saldo>0){
			
			System.out.println("Conta com dinheiro!");
		}else if(saldo<0){
			
			System.out.println("Conta em debito");
		}else{
			setStatus(false);
		}
		
	}
	
	public void depositar(double v) {
		
		if(status==true){
			
		setSaldo(getSaldo()+v);
 	}else{
			System.out.println("Impossivel depositar!");
		}
	}
	
	public void sacar(double s) {
		if (status=true){
		if(saldo>0){
			this.saldo=saldo-s;
		}else{
				System.out.println("Saldo insulficiente!");
			}
		}else{
			System.out.println("Impossivel sacar!");
		}
	}
	
	public void pagarMensal() {
		
		double pagar=0;
		
		if(getTipo().equals("CC")){
			
			pagar=15;
		}else if(getTipo().equals("CP")){
			
			pagar=20;
		}
		if(status== true){
			this.saldo= saldo-pagar;
		}else{
			System.out.println("Impossivel pagar!");
		}
	}
}