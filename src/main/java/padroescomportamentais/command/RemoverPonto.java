package padroescomportamentais.command;

public class RemoverPonto implements Ponto {

    private Colaborador colaborador;

    public RemoverPonto (Empresa empresa) {
        this.colaborador = colaborador;
    }

    public void executar() {
        this.colaborador.removerPonto();
    }

    public void cancelar() {
        this.colaborador.abrirPonto();
    }
}
