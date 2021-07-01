package padroescomportamentais.method;

public class ProdutoDepartamentoCasual extends Produto {

    public ProdutoDepartamentoCasual(String nome, boolean vendido) {
        super(nome, vendido);
    }

    public String verificarVenda() {
        if (this.isVendido()){
            return "Vendido";
        } else {
            return "Disponivel";
        }
    }
}
