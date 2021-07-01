package padroescomportamentais.state.main;

public class ProdutoEstadoEntregue implements ProdutoEstado {
    
    private ProdutoEstadoEntregue() { };
    private static ProdutoEstadoEntregue instance = new ProdutoEstadoEntregue();

    public static ProdutoEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }

    @Override
    public String vendido(Produto produto) {
        return "Venda nao realizada";
    }

    @Override
    public String enviado(Produto produto) {
        return "Envio nao realizado";
    }

    @Override
    public String entregue(Produto produto) {
        return "Entrega nao realizada";
    }

    @Override
    public String trocado(Produto produto) {
        produto.setEstado(ProdutoEstadoTrocado.getInstance());
        return "Troca realizada";
    }

    @Override
    public String devolvido(Produto produto) {
        produto.setEstado(ProdutoEstadoDevolvido.getInstance());
        return "Devolucao realizada";
    }    
}
