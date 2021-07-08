package padroescomportamentais.chainofresponsability;

public class MilitarCoronel extends Militar {

    public MilitarCoronel(Militar militarSuperior) {
        hierarquiaFolga.add(FolgaSuperior.getFolgaSuperior());
        setMilitarSuperior(militarSuperior);
    }

    public String getPatente(){ return "Coronel"; }
}
