package singleton;

import static junit.framework.TestCase.*;
import org.junit.Test;
import padroescriacao.singleton.main.Produto;

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
