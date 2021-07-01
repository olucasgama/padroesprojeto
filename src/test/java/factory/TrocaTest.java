package factory;

import padroescriacao.factory.method.TrocaFactory;
import padroescriacao.factory.model.IMain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
