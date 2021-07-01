package method;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import padroescomportamentais.method.ProdutoDepartamentoCasual;

public class ProdutoDepartamentoCasualTest {

    @Test
    void deveRetornarVendido() {
        ProdutoDepartamentoCasual produto = new ProdutoDepartamentoCasual("Cavalera", true);
        assertEquals("Vendido", produto.verificarVenda());
    }

    @Test
    void deveRetornarDisponivel() {
        ProdutoDepartamentoCasual produto = new ProdutoDepartamentoCasual("Cavalera", false);
        assertEquals("Disponivel", produto.verificarVenda());
    }

    @Test
    void deveRetornarToString() {
        ProdutoDepartamentoCasual produto = new ProdutoDepartamentoCasual("Cavalera", true);
        assertEquals("Produto{nome='Cavalera', vendido=Vendido}", produto.toString());
    }

}
