package padroescomportamentais.command;

public class FecharPonto implements Ponto {

    private Colaborador colaborador;

    public FecharPonto(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public void executar() {
        this.colaborador.fecharPonto();
    }

    public void cancelar() {
        this.colaborador.removerPonto();
    }
}
