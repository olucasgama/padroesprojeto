package factory;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
import padroescriacao.factory.method.TrocaFactory;
import padroescriacao.factory.model.IMain;

public class TrocaTest {
    
    @Test
    public void executaTroca() {
        IMain obter = new TrocaFactory().obter();
        assertEquals("Troca Efetuada", obter.executar());
    }

    @Test
    public void cancelaTroca() {
        IMain obter = new TrocaFactory().obter();
        assertEquals("Troca Cancelada", obter.cancelar());
    }
}
