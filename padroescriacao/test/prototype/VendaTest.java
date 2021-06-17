package prototype;

import static junit.framework.TestCase.*;
import org.junit.Test;
import padroescriacao.prototype.main.Produto;
import padroescriacao.prototype.main.Venda;

public class VendaTest {
    
    @Test
    public void testClone() throws CloneNotSupportedException {
        Venda venda = new Venda(1, new Produto(1, "Cimento", "Holcin"));
        
        Venda vendaClone = venda.clone();
        vendaClone.setId(2);
        vendaClone.getProduto().setId(23);
        vendaClone.getProduto().setNome("Tampao");
        vendaClone.getProduto().setMarca("Tigre");
        
        assertEquals("Venda{ID = 1, Produto = Produto{ID = 1, Nome = Cimento, Marca = Holcin}}", venda.toString());
        assertEquals("Venda{ID = 2, Produto = Produto{ID = 23, Nome = Tampao, Marca = Tigre}}", vendaClone.toString());
        
    } 
    
}
