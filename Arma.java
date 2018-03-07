package poo;
import java.util.Random;

public abstract class Arma extends Item {
	private int danoMax;
	private String nome;
	private int durabilidade;
	private int ataque;
	

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public String getNome() {
		return nome;
	}

	public Arma( String n,int dano,int d) {
		setDanoMax(dano);
		setDurabilidade(d);
		setNome(n);
		usaApenasUmaMao();
		
	}
	
	public String getNomee() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}

	public int atacar(){
		Random aleatorio = new Random();
	    	if(durabilidade==0){
	    		this.ataque=0;
	    	}
	    	
		
	}
	
	public boolean usaApenasUmaMao(){
		return false;
		
	}
	
	
	public int getDanoMax() {
		return danoMax;
	}
	
	public void setDanoMax(int danoMax) {
		this.danoMax = danoMax;
	}
	
}
