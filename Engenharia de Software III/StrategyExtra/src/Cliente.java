
public class Cliente {
	private Cobranca cobranca;

	public void setCobranca(Cobranca pCobranca) {
		this.cobranca = pCobranca;
	}
	
	public void fazerCobranca() {
		this.cobranca.cobrar();
	}
	 
}
