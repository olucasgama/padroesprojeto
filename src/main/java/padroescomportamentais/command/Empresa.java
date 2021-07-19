package padroescomportamentais.command;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Ponto> pontos = new ArrayList<Ponto>();

    public void abrirPonto(Ponto ponto) {
        this.pontos.add(ponto);
        ponto.executar();
    }

    public void fecharPonto(Ponto ponto) {
        this.pontos.add(ponto);
        ponto.executar();
    }

    public void removerUltimoPonto() {
        if (pontos.size() != 0) {
            Ponto ponto = this.pontos.get(this.pontos.size() -  1);
            ponto.cancelar();
            this.pontos.remove(this.pontos.size() - 1);
        }
    }
}
