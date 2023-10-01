package exercicio

public class Retangulo{
	private double altura;
	private double base;
	
	//Entrar valores
	public void setAltura(double altura){
		this.altura=altura;
	}
	public void setBase(double base){
		this.base=base;
	}
	//Sair valores
	public double getArea(){
		double area= this.base*this.altura;
		return area;
	}
	public double getPerimetro(){
		double perimetro= 2*(this.base+this.altura);
		return perimetro;
	}
	public double getDiagonal(){
		double diagobal= Math.sqrt(Math.pow(this.base,2)+Math.pow(this.altura,2));
		return diagonal;
	}
}