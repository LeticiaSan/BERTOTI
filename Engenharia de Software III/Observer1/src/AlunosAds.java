
public class AlunosAds implements Notificacao{
	private int codigoCurso;
	
	public AlunosAds(int codigo) {
        this.setCodigo(codigo);
    }

	public int getCodigo() {
		return codigoCurso;
	}

	public void setCodigo(int codigo) {
		this.codigoCurso = codigo;
	}
	
	public void update(String mensagem) {
		System.out.print("Mensagem para o curso de código: " + this.codigoCurso + "\n Mensagem: " + mensagem);
	}
}
