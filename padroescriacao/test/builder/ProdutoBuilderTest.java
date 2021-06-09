package builder;

import static junit.framework.TestCase.*;
import org.junit.Test;
import padroescriacao.builder.main.Produto;
import padroescriacao.builder.main.ProdutoBuilder;

public class ProdutoBuilderTest {

    @Test
    public void erroRetornoSemID() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setCodigoBarra(123456)
                    .setDescricao("Este e um produto.")
                    .setMarca("Marca Chinesa")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("ID Invalido", e.getMessage());

        }
    }

    @Test
    public void erroRetornoSemCodBarra() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setId(13)
                    .setDescricao("Este e um produto.")
                    .setMarca("Marca Chinesa")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo de Barra Invalido", e.getMessage());

        }
    }

    @Test
    public void semRetornoErro() {
        ProdutoBuilder produtoBuilder = new ProdutoBuilder();
        Produto produto = produtoBuilder
                .setId(13)
                .setCodigoBarra(123456)
                .setDescricao("Este e um produto.")
                .setMarca("Marca Chinesa")
                .build();
        assertNotNull(produto);
    }

}
