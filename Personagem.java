package poo;

public class Personagem extends Pocao {
	private String nome;
	private int maxHP;
	private int HPAtual;
	
	
	public void personagem(String nome,String maxHP){
		
	}
	public void equiparArma( Arma a){
		if(usaApenasUmaMao()==true){
			
		}
	}
	public void addPocao(Pocao p){
		Pocao+=p;
	}
	public void recuperarVida(){
		
	}
	public void sofrerDano(int dano){
		HPAtual=HPAtual-dano;
		if(HPAtual==0){
			System.out.println("O personagem faleceu");
		}
	}
	public String status(){
		return getNome()+getHPATual()+getHPMax();
		
	}
	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMaxHP() {
		return maxHP;
	}


	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}


	public int getHPAtual() {
		return HPAtual;
	}


	public void setHPAtual(int hPAtual) {
		HPAtual = hPAtual;
	}
}
