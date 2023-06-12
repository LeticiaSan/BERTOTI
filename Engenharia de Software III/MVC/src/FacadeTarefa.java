public class FacadeTarefa {
	private ControladorTarefa controlador;

    public FacadeTarefa() {
        controlador = ControladorTarefa.getInstancia();
    }

    public void adicionarTarefa(String tarefa) {
        controlador.adicionarTarefa(tarefa);
    }

    public void concluirTarefa(String tarefa) {
        controlador.concluirTarefa(tarefa);
    }

    public void removerTarefa(String tarefa) {
        controlador.removerTarefa(tarefa);
    }

    public void adicionarObservador(ObservadorTarefa observador) {
        controlador.adicionarObservador(observador);
    }

    public void removerObservador(ObservadorTarefa observador) {
        controlador.removerObservador(observador);
    }
}
