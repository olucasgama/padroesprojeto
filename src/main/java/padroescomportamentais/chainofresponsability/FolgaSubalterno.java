package padroescomportamentais.chainofresponsability;

public class FolgaSubalterno implements TipoFolga {

    private static FolgaSubalterno folgaSubalterno = new FolgaSubalterno();

    private FolgaSubalterno() {};

    public static FolgaSubalterno getFolgaSubalterno() {
        return folgaSubalterno;
    }

}
