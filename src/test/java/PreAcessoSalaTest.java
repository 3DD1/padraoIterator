import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreAcessoSalaTest {

    @Test
    void deveRetornarQuantidadeJogadoresNaSala(){
        SalaDeJogo sala = new SalaDeJogo(
                new Jogador("XeronildoXD2014", true),
                new Jogador("xXBalaXx", false),
                new Jogador("JoaninhaS2", false),
                new Jogador("PedroS10", true),
                new Jogador("XXRobsonYY", true),
                new Jogador("KL78221", true)
        );
        assertEquals(4, PreAcessoSala.mostrarQuantidadeDeJogadores(sala));
    }
    @Test
    void deveContarQuantidadeDeJogadores(){
        SalaDeJogo sala = new SalaDeJogo(
                new Jogador("XeronildoXD2014", true),
                new Jogador("xXBalaXx", false),
                new Jogador("JoaninhaS2", false),
                new Jogador("PedroS10", true),
                new Jogador("XXRobsonYY", true),
                new Jogador("KL78221", true)
        );
        assertEquals(6, PreAcessoSala.contarQuantidadeDeJogadores(sala));
    }
}