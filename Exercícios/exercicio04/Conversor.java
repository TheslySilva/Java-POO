package exercicio04;

public class Conversor {
	
	public static double converter(double valor,double quantidade) {
		double conversao= (valor*6.0)/100.0;
		return  (valor+conversao)*quantidade;
	}
	
}