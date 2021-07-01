package padroescomportamentais.state.main;

public class Produto {

    private String nome;
    private ProdutoEstado estado;

    public Produto() {
        //this.estado = ProdutoEstadoVendido.getInstance();
    }

    public String vender() {
        return estado.vendido(this);
    }

    public String trocar() {
        return estado.trocado(this);
    }

    public String devolver() {
        return estado.devolvido(this);
    }

    public String enviar() {
        return estado.enviado(this);
    }

    public String entregar() {
        return estado.entregue(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public void setEstado(ProdutoEstado estado) {
        this.estado = estado;
    }

    public ProdutoEstado getEstado() {
        return estado;
    }
}
