import org.example.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test {
    @org.junit.jupiter.api.Test
    void deveRetornarPrecoArma() {
        Arma arma = new ArmaAirsoft(2900.0f);

        assertEquals(2900.0f, arma.getPreco());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarNomeArma() {
        Arma arma = new ArmaAirsoft();

        assertEquals("Sniper 'M24'", arma.getPeca());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarPrecoArmaComMira() {
        Arma arma = new Mira(new ArmaAirsoft(2900.0f));

        assertEquals(3418.0f, arma.getPreco());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarNomeArmaComMira() {
        Arma arma = new Mira(new ArmaAirsoft());

        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60'", arma.getPeca());
    }
    @org.junit.jupiter.api.Test
    void deveRetornarPrecoArmaComMiraComCarregador() {
        Arma arma = new CarregadorExtendido(new Mira(new ArmaAirsoft(2900.0f)));

        assertEquals(3578.0f, arma.getPreco());
    }

    @org.junit.jupiter.api.Test
    void deveRetornarNomeArmaComMiraComCarregador() {
        Arma arma = new CarregadorExtendido(new Mira(new ArmaAirsoft()));

        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60' + Carregador '32 rounds'", arma.getPeca());
    }
    @org.junit.jupiter.api.Test
    void deveRetornarPrecoArmaComMiraComCarregadorComSilenciador() {
        Arma arma = new Silenciador(new CarregadorExtendido(new Mira(new ArmaAirsoft(2900.0f))));

        assertEquals(3744.0f, arma.getPreco());
    }
    @org.junit.jupiter.api.Test
    void deveRetornarNomeArmaComMiraComCarregadorComSilenciador() {
        Arma arma = new Silenciador(new CarregadorExtendido(new Mira(new ArmaAirsoft())));

        assertEquals("Sniper 'M24' + Mira telescopica '6x24x60' + Carregador '32 rounds' + Supressor Funcional", arma.getPeca());
    }
}
