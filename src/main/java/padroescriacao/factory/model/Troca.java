package padroescriacao.factory.model;

public class Troca implements IMain {

    @Override
    public String executar() {
        return "Troca Efetuada";
    }

    @Override
    public String cancelar() {
        return "Troca Cancelada";
    }

}
