package exercicio06;

import exercicio06.Quartos;
import java.lang.reflect.Constructor;

public class Quartos {
	private String nome;
	private String email;
	//Constructor
	public Quartos(String nome,String email){
		this.nome=nome;
		this.email=email;
	}
	//Set and Get
	//
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	//
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	//
	public String toString(){
		return   this.nome+"- "+this.email;
	}
}