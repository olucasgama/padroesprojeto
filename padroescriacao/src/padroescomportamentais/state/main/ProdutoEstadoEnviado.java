package padroescomportamentais.state.main;

public class ProdutoEstadoEnviado implements ProdutoEstado {

    private ProdutoEstadoEnviado() { };
    private static ProdutoEstadoEnviado instance = new ProdutoEstadoEnviado();

    public static ProdutoEstadoEnviado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Enviado";
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
        produto.setEstado(ProdutoEstadoEntregue.getInstance());
        return "Produto entregue";
    }

    @Override
    public String trocado(Produto produto) {
        return "Troca nao realizada";
    }

    @Override
    public String devolvido(Produto produto) {
        return "Devolucao nao realizada";
    }

}
