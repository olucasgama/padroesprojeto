package padroescomportamentais.chainofresponsability;

public class FolgaGeneral implements TipoFolga {

    private static FolgaGeneral folgaGeneral = new FolgaGeneral();

    private FolgaGeneral() {};

    public static FolgaGeneral getFolgaGeneral() {
        return folgaGeneral;
    }
}
