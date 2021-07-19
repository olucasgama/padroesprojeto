package padroescomportamentais.strategy;

public class ImpostoDiretor implements Imposto {

    public double calcularImposto(double valor) {
        return valor * 0.80;
    }
}
