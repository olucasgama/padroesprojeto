package padroescomportamentais.chainofresponsability;

public class MilitarSubtenente extends Militar {

    public MilitarSubtenente(Militar militarSuperior) {
        hierarquiaFolga.add(FolgaGraduado.getFolgaGraduado());
        setMilitarSuperior(militarSuperior);
    }

    public String getPatente(){ return "Subtenente"; }

}
