package padroescomportamentais.chainofresponsability;

public class MilitarMarechal extends Militar {

    public MilitarMarechal(Militar militarSuperior) {
        hierarquiaFolga.add(FolgaGeneral.getFolgaGeneral());
        setMilitarSuperior(militarSuperior);
    }

    public String getPatente(){ return "Marechal"; }
}
