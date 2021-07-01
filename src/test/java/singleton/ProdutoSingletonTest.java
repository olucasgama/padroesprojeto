package singleton;

import padroescriacao.singleton.main.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoSingletonTest {
    
    @Test
    public void retornaDescricaoProduto(){
        Produto.getInstance().setDescricao("Esta e a descricao");
        assertEquals("Esta e a descricao", Produto.getInstance().getDescricao());
    }
    
    @Test
    public void retornaCodBarraProduto(){
        Produto.getInstance().setCodigoBarra(123456);
        assertEquals(123456, Produto.getInstance().getCodigoBarra());
    }
}
