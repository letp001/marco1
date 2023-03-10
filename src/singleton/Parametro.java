package singleton;

public class Parametro {

    private Parametro() {};
    private static Parametro instance = new Parametro();
    public static Parametro getInstance() {
        return instance;
    }

    private String nomeAgencia;
    private String usuarioLogado;

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}

