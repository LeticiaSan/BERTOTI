import java.util.ArrayList;
import java.util.List;

public class ModeloTarefa {
	private List<ObservadorTarefa> observadores = new ArrayList<>();
    private List<String> tarefas = new ArrayList<>();

    public void adicionarObservador(ObservadorTarefa observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorTarefa observador) {
        observadores.remove(observador);
    }

    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
        notificarObservadores();
    }

    public void concluirTarefa(String tarefa) {
        tarefas.remove(tarefa);
        notificarObservadores();
    }

    public void removerTarefa(String tarefa) {
        tarefas.remove(tarefa);
        notificarObservadores();
    }

    private void notificarObservadores() {
        String[] arrayTarefas = tarefas.toArray(new String[0]);
        for (ObservadorTarefa observador : observadores) {
            observador.atualizarListaTarefas(arrayTarefas);
        }
    }
}
