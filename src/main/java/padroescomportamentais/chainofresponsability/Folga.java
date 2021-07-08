package padroescomportamentais.chainofresponsability;

public class Folga {

    private TipoFolga tipoFolga;

    public Folga(TipoFolga tipoFolga){
        this.tipoFolga = tipoFolga;
    }

    public TipoFolga getTipoFolga() {
        return tipoFolga;
    }

    public void setTipoFolga(TipoFolga tipoFolga) {
        this.tipoFolga = tipoFolga;
    }
}
