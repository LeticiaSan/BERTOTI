
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criando os objetos observáveis e observadores
        PrevisaoTempo previsaoTempo = new PrevisaoTempo();
        DisplayCondicoesAtuais display = new DisplayCondicoesAtuais();

        // Registrando o observador
        previsaoTempo.adicionarObservador(display);

        // Simulando atualização nas condições climáticas
        previsaoTempo.setMedicoes(25.5, 70.2, 1013.2);
	}

}
