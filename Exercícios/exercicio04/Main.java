package exercicio04;

import java.util.Scanner;
import util.Conversor;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quanto esta o valor de um dollar? ");
		double custo= sc.nextDouble();
		System.out.print("Quantos dolares voce vai comprar? ");
		double dollars= sc.nextDouble();
		
		double resultado = Conversor.converter(custo,dollars);
		
		System.out.printf("Valor que sera pago em reais = %.2f",resultado);
	}
}