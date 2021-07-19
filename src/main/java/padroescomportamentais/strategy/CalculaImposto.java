package padroescomportamentais.strategy;

public class CalculaImposto {

    private double valor;
    private double porcentagem;

    public CalculaImposto(double valor) {
        this.valor = valor;
    }

    public double calcularImposto(Imposto imposto) {
        return imposto.calcularImposto(valor);
    }
}
