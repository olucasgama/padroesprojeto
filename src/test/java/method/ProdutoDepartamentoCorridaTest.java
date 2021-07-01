package method;

import org.junit.jupiter.api.Test;
import padroescomportamentais.method.ProdutoDepartamentoCorrida;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoDepartamentoCorridaTest {

    @Test
    void deveRetornarVendido() {
        ProdutoDepartamentoCorrida produto = new ProdutoDepartamentoCorrida("Adidas", true);
        assertEquals("Vendido", produto.verificarVenda());
    }

    @Test
    void deveRetornarDisponivel() {
        ProdutoDepartamentoCorrida produto = new ProdutoDepartamentoCorrida("Adidas", false);
        assertEquals("Disponivel", produto.verificarVenda());
    }

    @Test
    void deveRetornarToString() {
        ProdutoDepartamentoCorrida produto = new ProdutoDepartamentoCorrida("Adidas", false);
        assertEquals("Produto{nome='Adidas', vendido=Disponivel}", produto.toString());
    }


}
