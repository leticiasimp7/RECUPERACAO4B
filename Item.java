package poo;

public abstract class Item implements Arma{


	protected String nome;
	

	protected String examinar(){
		return "Dano maximo foi:"+ getDanoMax()+" Seu nome:"+getNomee()+"Sua durabilidade:"+getDurabilidade()+usaApenasUmaMao();
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
