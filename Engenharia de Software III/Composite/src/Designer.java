//Folha
public class Designer implements Empregado{
	private String nome;

    public Designer(String name) {
        this.nome = name;
    }

    public void exibirInfo() {
        System.out.println(nome + " - Designer");
    }
}
