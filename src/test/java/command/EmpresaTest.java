package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentais.command.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpresaTest {

    Empresa empresa;
    Colaborador colaborador;

    @BeforeEach
    void setUp() {
        empresa = new Empresa();
        colaborador = new Colaborador(1, "Giovanna");
    }

    @Test
    void deveAbrirPonto(){
        Ponto aberturaPonto = new AbrirPonto(colaborador);
        empresa.abrirPonto(aberturaPonto);

        assertEquals("Ponto aberto", colaborador.getSituacao());
    }

    @Test
    void deveFecharPonto(){
        Ponto fechamentoPonto = new FecharPonto(colaborador);
        empresa.fecharPonto(fechamentoPonto);

        assertEquals("Ponto fechado", colaborador.getSituacao());
    }

    @Test
    void deveRemoverUltimoPonto() {
        Ponto aberturaPonto = new AbrirPonto(colaborador);
        Ponto fechamentoPonto = new FecharPonto(colaborador);

        empresa.abrirPonto(aberturaPonto);
        empresa.fecharPonto(fechamentoPonto);
        empresa.removerUltimoPonto();

        assertEquals("Ponto removido", colaborador.getSituacao());
    }
}
