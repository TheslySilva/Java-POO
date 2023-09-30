package estudopoo;

public class Caneta{

//Atributos da Classe

public String marca;
public String cor;
public float ponta;
public int carga;
private boolean tampada;

//Metedos da Classe

public void status(){

System.out.println("Marca = " + this.marca);
System.out.println("Cor = "+ this.cor);
System.out.println("Ponta = " + this.ponta);
System.out.println("Carga = "+this.carga);
System.out.println("Tampada = "+this.tampada);

}
public void Tampar(){
this.tampada = true;
}

public void Destampar(){
this.tampada = false;
}
}