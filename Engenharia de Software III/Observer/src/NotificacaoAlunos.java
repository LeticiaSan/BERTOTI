import java.util.ArrayList;
import java.util.List;

//Classe Notificação de Alunos (Singleton)
class NotificacaoAlunos {
	private static NotificacaoAlunos instancia;
    private List<Aluno> alunosInscritos;

    private NotificacaoAlunos() {
        alunosInscritos = obterAlunosInscritos();
    }

    public static NotificacaoAlunos getInstance() {
        if (instancia == null) {
            instancia = new NotificacaoAlunos();
        }
        return instancia;
    }

    public void notificar() {
        List<String> mensagens = Mural.getInstance().getMensagens();

        for (Aluno aluno : alunosInscritos) {
            if (mensagens.size() > 0) {
                System.out.println("Notificando aluno " + aluno.getNome() + " do curso " + aluno.getCurso());
                System.out.println("Nova mensagem no mural: " + mensagens.get(mensagens.size() - 1));
                System.out.println();
            }
        }
    }

    private List<Aluno> obterAlunosInscritos() {
        // Lógica para obter a lista de alunos inscritos em cada curso da faculdade
        // Aqui, retornaremos apenas alguns alunos de exemplo
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("João", "Engenharia"));
        alunos.add(new Aluno("Maria", "Ciência da Computação"));
        alunos.add(new Aluno("Carlos", "Administração"));
        return alunos;
    }
}