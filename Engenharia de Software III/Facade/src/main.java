
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaReservasFacade facade = new SistemaReservasFacade();
        facade.buscarOpcoesViagem("São Paulo", "Rio de Janeiro", "Copacabana");
        facade.realizarReserva("Voo123", 2, "Hotel XYZ", 1, "Carro ABC");
	}

}
