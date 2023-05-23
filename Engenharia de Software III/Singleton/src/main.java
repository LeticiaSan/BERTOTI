
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GerenciadorConfiguracoes configuracoes = GerenciadorConfiguracoes.getInstance();
        System.out.println("Configurações iniciais:");
        System.out.println("Servidor: " + configuracoes.getServidorBancoDados());
        System.out.println("Usuário: " + configuracoes.getUsuarioBancoDados());
        System.out.println("Senha: " + configuracoes.getSenhaBancoDados());

        // Alterando as configurações
        configuracoes.setConfiguracoesBancoDados("localhost:3306", "admin", "senha123");

        // Obtendo novamente a instância
        GerenciadorConfiguracoes configuracoesAtualizadas = GerenciadorConfiguracoes.getInstance();
        System.out.println("\n Configurações atualizadas:");
        System.out.println("Servidor: " + configuracoesAtualizadas.getServidorBancoDados());
        System.out.println("Usuário: " + configuracoesAtualizadas.getUsuarioBancoDados());
        System.out.println("Senha: " + configuracoesAtualizadas.getSenhaBancoDados());
	}

}
