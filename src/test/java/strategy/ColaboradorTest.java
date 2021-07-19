package strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentais.strategy.Colaborador;

import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorTest {

    Colaborador colaborador;

    @BeforeEach
    void setUp() {
        colaborador = new Colaborador();
    }

    @Test
    void deveCalcularImpostoDesenvolvedor() {
        colaborador.calculaDesenvovedor(2000);
        assertEquals(1900, colaborador.getValor());
    }

    @Test
    void deveCalcularImpostoGerente() {
        colaborador.calculaGerente(2000);
        assertEquals(1700, colaborador.getValor());
    }

    @Test
    void deveCalcularImpostoDiretor() {
        colaborador.calculaDiretor(2000);
        assertEquals(1600, colaborador.getValor());
    }
}
