package factory;

import static junit.framework.TestCase.*;
import org.junit.Test;
import padroescriacao.factory.method.DevolucaoFactory;
import padroescriacao.factory.model.IMain;

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
