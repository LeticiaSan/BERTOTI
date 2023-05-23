//Folha
public class Desenvolvedor implements Empregado{
	private String nome;

    public Desenvolvedor(String nome) {
        this.nome = nome;
    }

    public void exibirInfo() {
        System.out.println(nome +" - Desenvolvedor");
    }
}
