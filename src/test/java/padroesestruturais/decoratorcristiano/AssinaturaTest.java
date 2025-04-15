package padroesestruturais.decoratorcristiano;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssinaturaTest {

    @Test
    void deveRetornarPrecoPlanoBasico() {
        Assinatura assinatura = new PlanoBasico(100.0f);
        assertEquals(100.0f, assinatura.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComEsportes() {
        Assinatura assinatura = new Esportes(new PlanoBasico(100.0f));
        assertEquals(110.0f, assinatura.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComFilmes() {
        Assinatura assinatura = new Filmes(new PlanoBasico(100.0f));
        assertEquals(115.0f, assinatura.getPreco());
    }

    @Test
    void deveRetornarPrecoPlanoComCanaisAoVivo() {
        Assinatura assinatura = new CanaisAoVivo(new PlanoBasico(100.0f));
        assertEquals(120.0f, assinatura.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPlanoComEsportesMaisFilmes() {
        Assinatura assinatura = new Esportes(new Filmes(new PlanoBasico(100.0f)));
        assertEquals(126.5f, assinatura.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPlanoComEsportesMaisCanaisAoVivo() {
        Assinatura assinatura = new Esportes(new CanaisAoVivo(new PlanoBasico(100.0f)));
        assertEquals(132.0f, assinatura.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPlanoComFilmesMaisCanaisAoVivo() {
        Assinatura assinatura = new Filmes(new CanaisAoVivo(new PlanoBasico(100.0f)));
        assertEquals(138.0f, assinatura.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoPlanoCompleto() {
        Assinatura assinatura = new Esportes(new Filmes(new CanaisAoVivo(new PlanoBasico(100.0f))));
        assertEquals(151.8f, assinatura.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarRecursosPlanoBasico() {
        Assinatura assinatura = new PlanoBasico();
        assertEquals("Plano Básico", assinatura.getRecursos());
    }

    @Test
    void deveRetornarRecursosComEsportes() {
        Assinatura assinatura = new Esportes(new PlanoBasico());
        assertEquals("Plano Básico/Esportes", assinatura.getRecursos());
    }

    @Test
    void deveRetornarRecursosComFilmes() {
        Assinatura assinatura = new Filmes(new PlanoBasico());
        assertEquals("Plano Básico/Filmes", assinatura.getRecursos());
    }

    @Test
    void deveRetornarRecursosComCanaisAoVivo() {
        Assinatura assinatura = new CanaisAoVivo(new PlanoBasico());
        assertEquals("Plano Básico/Canais Ao Vivo", assinatura.getRecursos());
    }

    @Test
    void deveRetornarRecursosComFilmesMaisEsportes() {
        Assinatura assinatura = new Filmes(new Esportes(new PlanoBasico()));
        assertEquals("Plano Básico/Esportes/Filmes", assinatura.getRecursos());
    }

    @Test
    void deveRetornarRecursosComFilmesMaisCanaisAoVivo() {
        Assinatura assinatura = new Filmes(new CanaisAoVivo(new PlanoBasico()));
        assertEquals("Plano Básico/Canais Ao Vivo/Filmes", assinatura.getRecursos());
    }

    @Test
    void deveRetornarRecursosComEsportesMaisCanaisAoVivo() {
        Assinatura assinatura = new Esportes(new CanaisAoVivo(new PlanoBasico()));
        assertEquals("Plano Básico/Canais Ao Vivo/Esportes", assinatura.getRecursos());
    }

    @Test
    void deveRetornarRecursosPlanoCompleto() {
        Assinatura assinatura = new Esportes(new Filmes(new CanaisAoVivo(new PlanoBasico())));
        assertEquals("Plano Básico/Canais Ao Vivo/Filmes/Esportes", assinatura.getRecursos());
    }
}