package padroescomportamentais.chainofresponsability;

public class FolgaGraduado implements TipoFolga {

    private static FolgaGraduado folgaGraduado = new FolgaGraduado();

    private FolgaGraduado() {};

    public static FolgaGraduado getFolgaGraduado() {
        return folgaGraduado;
    }
}
