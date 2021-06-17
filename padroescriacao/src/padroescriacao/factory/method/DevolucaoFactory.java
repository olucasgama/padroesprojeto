package padroescriacao.factory.method;

import padroescriacao.factory.model.Devolucao;
import padroescriacao.factory.model.IMain;

public class DevolucaoFactory implements IMainFactory {

    @Override
    public IMain obter() {
        return new Devolucao();
    }
}
