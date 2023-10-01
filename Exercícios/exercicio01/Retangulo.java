package exercicio01;

import java.text.DecimalFormat;

public class Retangulo {
	private double altura;
	private double base;
	
	//Entrar valores
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void createRetangulo(double altura, double base) {
		System.out.println("\nCriando um retangulo com base " + base + " e altura " + altura);
		this.setAltura(altura);
		this.setBase(base);
	}
	
	//Sair valores
	private double getArea() {
		double area = this.base * this.altura;
		return area;
	}
	
	private double getPerimetro() {
		double perimetro = 2 * (this.base + this.altura);
		return perimetro;
	}
	
	private double getDiagonal() {
		double diagonal = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
		return diagonal;
	}
	
	//Saida completa
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return "\nArea = " +df.format( getArea()) + " \nPerimetro = " + df.format(getPerimetro()) + " \nDiagonal = " + df.format(getDiagonal());
	}
}