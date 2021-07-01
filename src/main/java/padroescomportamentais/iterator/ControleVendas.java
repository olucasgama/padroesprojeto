package padroescomportamentais.iterator;

import java.util.Iterator;

public class ControleVendas {

    public static Integer contarProdutosVendidosDepartamento(Departamento departamento) {
        int quantidade = 0;
        for (Produto produto : departamento) {
            if (produto.isVendido()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarProdutosDepartamento(Departamento departamento) {
        int quantidade = 0;
        for (Iterator a = departamento.iterator(); a.hasNext();) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
