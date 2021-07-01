package padroescomportamentais.iterator;

public class Produto {

    private String nome;
    private boolean vendido;

    public Produto(String nome, boolean vendido) {
        this.nome = nome;
        this.vendido = vendido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

}
