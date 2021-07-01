package padroescomportamentais.state.main;

public class ProdutoEstadoTrocado implements ProdutoEstado {
    
    private ProdutoEstadoTrocado() {};
    private static ProdutoEstadoTrocado instance = new ProdutoEstadoTrocado();
    
    public static ProdutoEstadoTrocado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Trocado";
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
