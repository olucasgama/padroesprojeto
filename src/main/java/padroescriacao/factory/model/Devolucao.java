package padroescriacao.factory.model;

public class Devolucao implements IMain {

    @Override
    public String executar() {
        return "Devolucao Efetuada";
    }

    @Override
    public String cancelar() {
        return "Devolucao Cancelada";
    }

}
