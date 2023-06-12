public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisualizacaoTarefa visualizacao = new VisualizacaoTarefa();
        FacadeTarefa facade = new FacadeTarefa();
        facade.adicionarObservador(visualizacao);

        facade.adicionarTarefa("Comprar leite");
        facade.adicionarTarefa("Ir à Lavanderia");
        facade.adicionarTarefa("Organizar os Livros");
        facade.adicionarTarefa("Pagar contas");
        facade.adicionarTarefa("Lavar a Louça");
        
        facade.concluirTarefa("Pagar contas");
        facade.removerTarefa("Lavar a Louça");

        visualizacao.setVisible(true);
	}
}
