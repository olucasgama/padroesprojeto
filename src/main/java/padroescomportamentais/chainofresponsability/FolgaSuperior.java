package padroescomportamentais.chainofresponsability;

public class FolgaSuperior implements TipoFolga {

    private static FolgaSuperior folgaSuperior = new FolgaSuperior();

    private FolgaSuperior() {};

    public static FolgaSuperior getFolgaSuperior() {
        return folgaSuperior;
    }
}
