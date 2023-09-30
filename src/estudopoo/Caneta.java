package estudopoo;

public class Caneta{

//Atributos da Classe

String marca;
String cor;
float ponta;
int carga;
boolean tampada;

//Metedos da Classe

public void status(){

System.out.println("Marca = " + this.marca);
System.out.println("Cor = "+ this.cor);
System.out.println("Ponta = " + this.ponta);
System.out.println("Carga = "+this.carga);

}
public void Tampar(){
this.tampada = true;
}

public void Destampar(){
this.tampada = false;
}
}