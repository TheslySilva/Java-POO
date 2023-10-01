package exercicio01;
import exercicio01.Retangulo;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Retangulo re= new Retangulo();
		
		System.out.println("Digite os valores do Retangulo :");
		System.out.print("\nBase : ");
		re.setBase(sc.nextDouble());
		System.out.print("Altura : ");
		re.setAltura(sc.nextDouble());
		
		System.out.println(re.toString());
		
	}
}