package padroescriacao.prototype.main;

public class Venda implements Cloneable {

    private int id;
    private Produto produto;

    public Venda(int id, Produto produto) {
        this.id = id;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public Venda clone() throws CloneNotSupportedException {
        Venda vendaClone = (Venda) super.clone();
        vendaClone.produto = (Produto) vendaClone.produto.clone();
        return vendaClone;
    }
    
    @Override
    public String toString() {
        return "Venda{" + "ID = " + id
                + ", Produto = " + produto + '}';
    }
}
