public class Restaurante {
	private Culinaria culinaria;
	
	public void setCulinaria(Culinaria pCulinaria) {
		this.culinaria = pCulinaria;
	}
	
	public void cozinhar() {
		this.culinaria.prepararPedido();
	}

}
