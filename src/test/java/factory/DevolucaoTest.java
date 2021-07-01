package factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import padroescriacao.factory.method.DevolucaoFactory;
import padroescriacao.factory.model.IMain;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DevolucaoTest {

    @Test
    public void executaDevolucao() {
        IMain obter = new DevolucaoFactory().obter();
        assertEquals("Devolucao Efetuada", obter.executar());
    }

    @Test
    public void cancelaDevolucao() {
        IMain obter = new DevolucaoFactory().obter();
        assertEquals("Devolucao Cancelada", obter.cancelar());
    }
}
