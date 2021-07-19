package padroescomportamentais.strategy;

public class Colaborador {

    private double valor;

    public double getValor() { return valor; }

    public void calculaDesenvovedor (double valor1) {
        CalculaImposto calcula = new CalculaImposto(valor1);
        this.valor = calcula.calcularImposto(new ImpostoDesenvolvedor());
    }

    public void calculaGerente (double valor1) {
        CalculaImposto calcula = new CalculaImposto(valor1);
        this.valor = calcula.calcularImposto(new ImpostoGerente());
    }

    public void calculaDiretor (double valor1) {
        CalculaImposto calcula = new CalculaImposto(valor1);
        this.valor = calcula.calcularImposto(new ImpostoDiretor());
    }
}
