package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametroTeste {

    @Test
    public void deveRetornarNomeAgencia() {
        Parametro.getInstance().setNomeAgencia("Agencia 1");
        assertEquals("Agencia 1", Parametro.getInstance().getNomeAgencia());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametro.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Parametro.getInstance().getUsuarioLogado());
    }

}
