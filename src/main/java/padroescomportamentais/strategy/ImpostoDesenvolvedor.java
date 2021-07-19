package padroescomportamentais.strategy;

public class ImpostoDesenvolvedor implements Imposto {

    public double calcularImposto(double valor) {
        return valor * 0.95;
    }
}
