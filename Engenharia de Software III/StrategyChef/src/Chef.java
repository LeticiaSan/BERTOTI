
public class Chef {
	private Culinaria culinaria;
	
	public void setCulinaria(Culinaria pCulinaria) {
		this.culinaria = pCulinaria;
	}
	
	public void cozinhar() {
		this.culinaria.cozinhar();
	}
}
