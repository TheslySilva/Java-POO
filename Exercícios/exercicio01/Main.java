package exercicio01;
import exercicio01.Retangulo;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Retangulo r= new Retangulo();
		Retangulo r2= new Retangulo();
		
		System.out.println("Digite os valores do Retangulo :");
		System.out.print("\nBase : ");
		r1.setBase(sc.nextDouble());
		System.out.print("Altura : ");
		r1.setAltura(sc.nextDouble());
		
		System.out.println(r1.toString());
		
		System.out.println("-----------------------");
		
		System.out.println("Digite os valores do Retangulo :");
		System.out.print("\nBase : ");
		r2.setBase(sc.nextDouble());
		System.out.print("Altura : ");
		r2.setAltura(sc.nextDouble());
		
		System.out.println(r2.toString());
		
	}
}