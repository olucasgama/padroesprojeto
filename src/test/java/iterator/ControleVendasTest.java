package iterator;

import org.junit.jupiter.api.Test;
import padroescomportamentais.iterator.ControleVendas;
import padroescomportamentais.iterator.Departamento;
import padroescomportamentais.iterator.Produto;

import static org.junit.jupiter.api.Assertions.*;

public class ControleVendasTest {

    @Test
    public void deveContarProdutosVendidosDepartamento() {
        Departamento departamento = new Departamento(
                new Produto("Adidas", true),
                new Produto("Fila", true),
                new Produto("Nike", true),
                new Produto("Umbro", false),
                new Produto("New Balace", false)
        );
        assertEquals(3, ControleVendas.contarProdutosVendidosDepartamento(departamento));
    }

    @Test
    public void deveContarProdutosDepartamento() {
        Departamento departamento = new Departamento(
                new Produto("Adidas", true),
                new Produto("Fila", true),
                new Produto("Nike", true),
                new Produto("Umbro", false),
                new Produto("New Balace", false)
        );
        assertEquals(5, ControleVendas.contarProdutosDepartamento(departamento));
    }
    
}
