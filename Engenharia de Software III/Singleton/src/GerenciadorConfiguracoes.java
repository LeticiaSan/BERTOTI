//Singleton
public class GerenciadorConfiguracoes {
    private static GerenciadorConfiguracoes instancia;
    private String servidorBancoDados;
    private String usuarioBancoDados;
    private String senhaBancoDados;

    private GerenciadorConfiguracoes() {
        // Configurações padrão
        servidorBancoDados = "localhost";
        usuarioBancoDados = "root";
        senhaBancoDados = "123456";
    }

    public static GerenciadorConfiguracoes getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorConfiguracoes();
        }
        return instancia;
    }

    public void setConfiguracoesBancoDados(String servidor, String usuario, String senha) {
        this.servidorBancoDados = servidor;
        this.usuarioBancoDados = usuario;
        this.senhaBancoDados = senha;
    }

    public String getServidorBancoDados() {
        return servidorBancoDados;
    }

    public String getUsuarioBancoDados() {
        return usuarioBancoDados;
    }

    public String getSenhaBancoDados() {
        return senhaBancoDados;
    }
}

