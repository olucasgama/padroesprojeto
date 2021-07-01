package padroescomportamentais.state.main;

public interface ProdutoEstado {
    
    String getEstado();
    
    String vendido(Produto produto);
    
    String enviado(Produto produto);
    
    String entregue(Produto produto);
    
    String trocado(Produto produto);
    
    String devolvido(Produto produto);
    
}
