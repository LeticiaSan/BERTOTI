
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//O método getInstance é estático, o que significa que você pode chamá-lo sem 
		//criar uma instância da classe. Ele retorna a única instância da classe.
		Mural mural = Mural.getInstance();

	        mural.adicionarMensagem("Aviso importante para os alunos de Engenharia!");
	        mural.adicionarMensagem("Evento cancelado para os alunos de Administração!");

	        mural.adicionarMensagem("Aula extra para os alunos de Ciência da Computação!");

	        mural.adicionarMensagem("Alteração no horário de atendimento para os alunos de Engenharia!");     
        
	}

}
