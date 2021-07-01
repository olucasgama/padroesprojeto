package padroescomportamentais.method;

public class ProdutoDepartamentoCorrida extends Produto {

    public ProdutoDepartamentoCorrida(String nome, boolean vendido) {
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
