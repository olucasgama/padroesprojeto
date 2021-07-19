package padroescomportamentais.command;

public class Colaborador {

    private int id;
    private String nome;
    private String situacao;

    public Colaborador(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getSituacao() { return situacao; }

    public void abrirPonto() { this.situacao = "Ponto aberto"; }

    public void fecharPonto() { this.situacao = "Ponto fechado"; }

    public void removerPonto() { this.situacao = "Ponto removido"; }
}
