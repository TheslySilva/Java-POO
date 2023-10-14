package exercicio08.entities;

import java.util.Date;

import exercicio08.entities.Cliente;
import java.text.SimpleDateFormat;

public class Cliente {
	
	public static  final SimpleDateFormat formatarData= new SimpleDateFormat("dd/MM/yyyy");
	//
	private String nome;
	private String email;
	private Date aniversario;
	//
	public  Cliente(String nome, String email, Date aniversario) {
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}
	
	//
	public String getNome() {
		return this.nome;
	}
	
	//
	public String getEmail() {
		return this.email;
	}
	
	//
	public Date getAniversario() {
		return this.aniversario;
	}
	//
	public String toString(){
		
		return "nome "+nome+", ("
		+formatarData.format(aniversario)+") - "+email;
	}
}