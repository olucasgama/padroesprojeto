package padroescomportamentais.state.main;

public class ProdutoEstadoDevolvido implements ProdutoEstado {
    
    private ProdutoEstadoDevolvido() {};
    private static ProdutoEstadoDevolvido instance = new ProdutoEstadoDevolvido();
    
    public static ProdutoEstadoDevolvido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Devolvido";
    }

    @Override
    public String vendido(Produto produto) {
        return "Venda nao realizada";
    }

    @Override
    public String trocado(Produto produto) {
        return "Troca nao realizada";
    }

    @Override
    public String devolvido(Produto produto) {
        return "Devolucao nao realizada";
    }

    @Override
    public String enviado(Produto produto) {
        return "Envio nao realizado";
    }

    @Override
    public String entregue(Produto produto) {
        return "Entrega nao realizada";
    }
    
}
