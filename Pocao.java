package poo;

public abstract class Pocao implements IUsavel{
	private int HPRestaurado;
	private String nomee;
	
	public int usar(int HPRestaurado){		
		return this.getHPRestaurado();
	}

	
	
	public int getHPRestaurado() {
		return HPRestaurado;
	}

	public void setHPRestaurado(int hPRestaurado) {
		HPRestaurado = hPRestaurado;
	}
}
