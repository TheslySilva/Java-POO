package exercicio01;

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
		return "\nArea = " + getArea() +
		" \nPerimetro = " + getPerimetro() +
		" \nDiagonal = " + getDiagonal();
	}
}