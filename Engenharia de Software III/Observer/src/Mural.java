import java.util.ArrayList;
import java.util.List;
class Mural {
	 private static Mural instancia;
	    private List<String> mensagens;
	    private NotificacaoAlunos notificacaoAlunos;

	    private Mural() {
	        this.mensagens = new ArrayList<>();
	        this.notificacaoAlunos = NotificacaoAlunos.getInstance();
	    }

	    public static Mural getInstance() {
	        if (instancia == null) {
	            instancia = new Mural();
	        }
	        return instancia;
	    }

	    public void adicionarMensagem(String mensagem) {
	        mensagens.add(mensagem);
	        notificarAlunos();
	    }

	    private void notificarAlunos() {
	        notificacaoAlunos.notificar();
	    }

	    public List<String> getMensagens() {
	        return mensagens;
	    }
	}
