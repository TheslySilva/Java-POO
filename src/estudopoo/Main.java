package estudopoo;

public class Main{
public static void main(String[] args) {

//Criando um Objeto apartir de uma Classe

Caneta c1 = new Caneta();

//Atribuindo valores a ele

c1.marca = "Bic";
c1.cor = "Preta";
c1.ponta = 0.7;
c1.carga = 100;

//Metodos presente no Objeto
c1.Tampar();

//Visualizar o Status do metodo
c1.status();

}
}