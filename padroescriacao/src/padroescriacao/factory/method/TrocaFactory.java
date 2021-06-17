package padroescriacao.factory.method;

import padroescriacao.factory.model.IMain;
import padroescriacao.factory.model.Troca;

public class TrocaFactory implements IMainFactory {

    @Override
    public IMain obter() {
        return new Troca();
    }
}
