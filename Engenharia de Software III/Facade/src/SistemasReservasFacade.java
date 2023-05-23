// Facade
class SistemaReservasFacade {
    private CompanhiaAerea companhiaAerea;
    private Hotel hotel;
    private AluguelCarro aluguelCarro;

    public SistemaReservasFacade() {
        this.companhiaAerea = new CompanhiaAerea();
        this.hotel = new Hotel();
        this.aluguelCarro = new AluguelCarro();
    }

    public void buscarOpcoesViagem(String origem, String destino, String local) {
        companhiaAerea.buscarVoos(origem, destino);
        hotel.buscarHoteis(local);
        aluguelCarro.buscarCarros(local);
    }

    public void realizarReserva(String voo, int assentos, String hotel, int quartos, String carro) {
        companhiaAerea.reservarVoo(voo, assentos);
        this.hotel.reservarHotel(hotel, quartos);
        aluguelCarro.reservarCarro(carro);
        System.out.println("Reserva concluída com sucesso!");
    }
}
