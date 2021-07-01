package padroescriacao.builder.main;

public class ProdutoBuilder {
    
    private Produto produto;

    public ProdutoBuilder() { produto = new Produto(); }

    public Produto build() {
        if (produto.getId() == 0){
            throw new IllegalArgumentException("ID Invalido");
        }
        if (produto.getCodigoBarra() == 0) {
            throw new IllegalArgumentException("Codigo de Barra Invalido");
        }
        return produto;
    }

    public ProdutoBuilder setId(int id) {
        produto.setId(id);
        return this;
    }

    public ProdutoBuilder setNome(String nome) {
        produto.setNome(nome);
        return this;
    }

    public ProdutoBuilder setDescricao(String descricao) {
        produto.setDescricao(descricao);
        return this;
    }

    public ProdutoBuilder setEspecificacoes(String especificacoes) {
        produto.setEspecificacoes(especificacoes);
        return this;
    }

    public ProdutoBuilder setMarca(String marca) {
        produto.setMarca(marca);
        return this;
    }

    public ProdutoBuilder setCodigoBarra(int codigoBarra) {
        produto.setCodigoBarra(codigoBarra);
        return this;
    }

    public ProdutoBuilder setQuantidade(int quantidade) {
        produto.setQuantidade(quantidade);
        return this;
    }

    public ProdutoBuilder setPreco(float preco) {
        produto.setPreco(preco);
        return this;
    }
}
