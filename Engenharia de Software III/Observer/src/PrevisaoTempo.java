import java.util.ArrayList;
import java.util.List;
// Classe Observável (Subject)
public class PrevisaoTempo {
    private double temperatura;
    private double umidade;
    private double pressao;
    private List<Observer> observadores;

    public PrevisaoTempo() {
        observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void setMedicoes(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(temperatura, umidade, pressao);
        }
    }
}
