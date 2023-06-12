public class ControladorTarefa {
	private static ControladorTarefa instancia;
    private ModeloTarefa modelo;

    private ControladorTarefa() {
        modelo = new ModeloTarefa();
    }

    public static ControladorTarefa getInstancia() {
        if (instancia == null) {
            instancia = new ControladorTarefa();
        }
        return instancia;
    }

    public void adicionarTarefa(String tarefa) {
        modelo.adicionarTarefa(tarefa);
    }

    public void concluirTarefa(String tarefa) {
        modelo.concluirTarefa(tarefa);
    }

    public void removerTarefa(String tarefa) {
        modelo.removerTarefa(tarefa);
    }

    public void adicionarObservador(ObservadorTarefa observador) {
        modelo.adicionarObservador(observador);
    }

    public void removerObservador(ObservadorTarefa observador) {
        modelo.removerObservador(observador);
    }
}
