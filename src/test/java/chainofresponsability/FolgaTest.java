package chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentais.chainofresponsability.*;
import static org.junit.jupiter.api.Assertions.*;

public class FolgaTest {

    MilitarSubtenente subtenente;
    MilitarPrimeiroTenente primeiroTenente;
    MilitarCoronel coronel;
    MilitarMarechal marechal;

    @BeforeEach
    void setUp() {
        coronel = new MilitarCoronel(marechal);
        primeiroTenente = new MilitarPrimeiroTenente(coronel);
        subtenente = new MilitarSubtenente(primeiroTenente);
        marechal = new MilitarMarechal(null);
    }

    @Test
    void devePedirFolgaGraduadoSubtenente() {
        assertEquals("Subtenente", subtenente.assinarFolga(new Folga(FolgaGraduado.getFolgaGraduado())));
    }

    @Test
    void devePedirFolgaSubalternoPrimeiroTenente() {
        assertEquals("Primeiro Tenente", subtenente.assinarFolga(new Folga(FolgaSubalterno.getFolgaSubalterno())));
    }

    @Test
    void devePedirFolgaSuperiorCoronel() {
        assertEquals("Coronel", subtenente.assinarFolga(new Folga(FolgaSuperior.getFolgaSuperior())));
    }

    @Test
    void devePedirFolgaGeneralMarechal() {
        assertEquals("Sem folga", subtenente.assinarFolga(new Folga(FolgaGeneral.getFolgaGeneral())));
    }

}
