package state;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import padroescomportamentais.state.main.Produto;
import padroescomportamentais.state.main.ProdutoEstadoVendido;
import padroescomportamentais.state.main.ProdutoEstadoDevolvido;
import padroescomportamentais.state.main.ProdutoEstadoEntregue;
import padroescomportamentais.state.main.ProdutoEstadoEnviado;
import padroescomportamentais.state.main.ProdutoEstadoTrocado;

public class ProdutoTest {

    Produto produto;

    @BeforeEach
    public void setUp() {
        produto = new Produto();
    }

    //ProdutoEstadoVendido
    @Test
    public void naoDeveVenderProdutoVendido() {
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        assertEquals("Venda nao realizada", produto.vender());
    }

    @Test
    public void deveTrocarProdutoVendido() {
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        assertEquals("Troca realizada", produto.trocar());
    }

    @Test
    public void deveDevolverProdutoVendido() {
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        assertEquals("Devolucao realizada", produto.devolver());
    }

    @Test
    public void deveEnviarProdutoVendido() {
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        assertEquals("Produto enviado", produto.enviar());
    }

    @Test
    public void deveEntregueProdutoVendido() {
        produto.setEstado(ProdutoEstadoVendido.getInstance());
        assertEquals("Produto entregue", produto.entregar());
    }

    //ProdutoEstadoDevolvido
    @Test
    public void naoDeveVenderProdutoDevolvido() {
        produto.setEstado(ProdutoEstadoDevolvido.getInstance());
        assertEquals("Venda nao realizada", produto.vender());
    }

    @Test
    public void naoDeveTrocarProdutoDevolvido() {
        produto.setEstado(ProdutoEstadoDevolvido.getInstance());
        assertEquals("Troca nao realizada", produto.trocar());
    }

    @Test
    public void naoDeveDevolverProdutoDevolvido() {
        produto.setEstado(ProdutoEstadoDevolvido.getInstance());
        assertEquals("Devolucao nao realizada", produto.devolver());
    }

    @Test
    public void naoDeveEnviarProdutoDevolvido() {
        produto.setEstado(ProdutoEstadoDevolvido.getInstance());
        assertEquals("Envio nao realizado", produto.enviar());
    }

    @Test
    public void naoDeveEntregarProdutoDevolvido() {
        produto.setEstado(ProdutoEstadoDevolvido.getInstance());
        assertEquals("Entrega nao realizada", produto.entregar());
    }

    //ProdutoEstadoEntregue
    @Test
    public void naoDeveVenderProdutoEntregue() {
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        assertEquals("Venda nao realizada", produto.vender());
    }

    @Test
    public void deveTrocarProdutoEntregue() {
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        assertEquals("Troca realizada", produto.trocar());
    }

    @Test
    public void deveDevolverProdutoEntregue() {
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        assertEquals("Devolucao realizada", produto.devolver());
    }

    @Test
    public void naoDeveEnviarProdutoEntregue() {
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        assertEquals("Envio nao realizado", produto.enviar());
    }

    @Test
    public void naoDeveEntregarProdutoEntregue() {
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        assertEquals("Entrega nao realizada", produto.entregar());
    }

    //ProdutoEstadoEnviado
    @Test
    public void naoDeveVenderProdutoEnviado() {
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        assertEquals("Venda nao realizada", produto.vender());
    }

    @Test
    public void naoDeveTrocarProdutoEnviado() {
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        assertEquals("Troca nao realizada", produto.trocar());
    }

    @Test
    public void naoDeveDevolverProdutoEnviado() {
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        assertEquals("Devolucao nao realizada", produto.devolver());
    }

    @Test
    public void naoDeveEnviarProdutoEnviado() {
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        assertEquals("Envio nao realizado", produto.enviar());
    }

    @Test
    public void deveEntregarProdutoEnviado() {
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        assertEquals("Produto entregue", produto.entregar());
    }

    //ProdutoEstadoTrocado
    @Test
    public void naoDeveVenderProdutoTrocado() {
        produto.setEstado(ProdutoEstadoTrocado.getInstance());
        assertEquals("Venda nao realizada", produto.vender());
    }

    @Test
    public void naoDeveTrocarProdutoTrocado() {
        produto.setEstado(ProdutoEstadoTrocado.getInstance());
        assertEquals("Troca nao realizada", produto.trocar());
    }

    @Test
    public void naoDeveDevolverProdutoTrocado() {
        produto.setEstado(ProdutoEstadoTrocado.getInstance());
        assertEquals("Devolucao nao realizada", produto.devolver());
    }

    @Test
    public void naoDeveEnviarProdutoTrocado() {
        produto.setEstado(ProdutoEstadoTrocado.getInstance());
        assertEquals("Envio nao realizada", produto.enviar());
    }

    @Test
    public void naoDeveEntregarProdutoTrocado() {
        produto.setEstado(ProdutoEstadoTrocado.getInstance());
        assertEquals("Entrega nao realizada", produto.entregar());
    }
}
