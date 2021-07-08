package padroescomportamentais.chainofresponsability;

public class MilitarPrimeiroTenente extends Militar {

    public MilitarPrimeiroTenente(Militar militarSuperior) {
        hierarquiaFolga.add(FolgaSubalterno.getFolgaSubalterno());
        setMilitarSuperior(militarSuperior);
    }

    public String getPatente(){ return "Primeiro Tenente"; }

}
