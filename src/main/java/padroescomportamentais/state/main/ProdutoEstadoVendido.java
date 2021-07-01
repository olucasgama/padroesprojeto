package padroescomportamentais.state.main;

public class ProdutoEstadoVendido implements ProdutoEstado {
    
    private ProdutoEstadoVendido() {};
    private static ProdutoEstadoVendido instance = new ProdutoEstadoVendido();
    
    public static ProdutoEstadoVendido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Vendido";
    }

    @Override
    public String vendido(Produto produto) {
        return "Venda nao realizada";
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

    @Override
    public String enviado(Produto produto) {
        produto.setEstado(ProdutoEstadoEnviado.getInstance());
        return "Produto enviado";
    }

    @Override
    public String entregue(Produto produto) {
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        return "Produto entregue";
    }
    
    
    
}
