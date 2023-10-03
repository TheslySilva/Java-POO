package exercicio03;

public class Notas {
	private String nome;
	private double nota;
	private double mediaAluno;
	
	//Metodos
	//construtor
	public Notas(String nome, double nota) {
		this.nome=nome;
		this.nota=nota;
		this.mediaAluno=0;
	}
	
	//
	//metodos set e get
	//
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	//
	private void setNota(double nota) {
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}
	
	//
	private void setMedia(double media) {
		this.mediaAluno = media;
	}
	
	public double getMedia() {
		return mediaAluno;
	}
	
	//
	//
	//Saidas
	//
	public void gerarMedia(){
		
		this.mediaAluno= this.nota/4;
	}
	private double reprovado(){
		double reprovado=6-mediaAluno;
		return reprovado;
	}
	private String estadoAluno(){
		String estado="";
		if (mediaAluno<6){
			estado="\nMEDIA FINAL = "+mediaAluno+"\nESTADO= REPROVADO!\n"+"\nFALTOU "+reprovado()+" PONTOS";
		}else{
			estado="\nMEDIA FINAL = "+mediaAluno+"\nESTADO = APROVADO!";
		}
			
		return estado;
	}
	
	public void statusAtual(){
		gerarMedia();
		System.out.println(estadoAluno());
	}
}