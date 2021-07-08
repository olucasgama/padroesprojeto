package padroescomportamentais.chainofresponsability;

import java.util.ArrayList;

public abstract class Militar {

    protected ArrayList hierarquiaFolga = new ArrayList();
    private Militar militarSuperior;

    public Militar getMilitarSuperior() {
        return militarSuperior;
    }

    public void setMilitarSuperior(Militar militarSuperior) {
        this.militarSuperior = militarSuperior;
    }

    public abstract String getPatente();

    public String assinarFolga(Folga folga) {
        if (hierarquiaFolga.contains(folga.getTipoFolga())) {
            return getPatente();
        }
        else {
            if (militarSuperior != null) {
                return militarSuperior.assinarFolga(folga);
            }
            else
            {
                return "Sem folga";
            }
        }
    }
}
