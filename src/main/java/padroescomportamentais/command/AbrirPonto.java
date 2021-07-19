package padroescomportamentais.command;

public class AbrirPonto implements Ponto {

    private Colaborador colaborador;

    public AbrirPonto(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public void executar() {
        this.colaborador.abrirPonto();
    }

    public void cancelar() {
        this.colaborador.fecharPonto();
    }
}
