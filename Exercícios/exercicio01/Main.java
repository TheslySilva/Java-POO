package exercicio01;

import exercicio01.Retangulo;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo r1 = new Retangulo();
		
		System.out.println("Digite os valores : ");
		r1.createRetangulo(sc.nextDouble(),sc.nextDouble());
		
		System.out.println(r1.toString());
	}
}