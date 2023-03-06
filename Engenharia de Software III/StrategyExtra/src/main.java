public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		
		cliente.setCobranca(new planoAvancado());
		
		cliente.fazerCobranca();
	}

}
