// Classe Observador Concreto

public class DisplayCondicoesAtuais implements Observer {
    private double temperatura;
    private double umidade;
    private double pressao;

    public void atualizar(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        mostrar();
    }

    public void mostrar() {
        System.out.println("Condições Atuais: ");
        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Umidade: " + umidade + "%");
        System.out.println("Pressão: " + pressao + " hPa");
        System.out.println();
    }
}
