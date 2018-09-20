/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaodp2;

import adapter.classes.Chocolate;
import adapter.classes.ChocolateAdapter;
import iterator.classes.Produto;
import iterator.classes.ProdutosFloricultura;
import iterator.classes.Relatorio;
import iterator.interfaces.Iterator;

/**
 *
 * @author denis
 */
public class AvaliacaoDP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Relatorio relatorio = new Relatorio();
        //Composite
        System.out.println("\nPadrao de Composite\n");
        System.out.println("----------------------------");
        relatorio.imprimeSetoresFloricultura();
        System.out.println("----------------------------");

        //Iterator
        System.out.println("\nPadrao de Iterator\n");
        String descricao = "PRODUTOS FLORICULTURA";
        System.out.println("-------Produtos Vendidos-----");
        ProdutosFloricultura pf = new ProdutosFloricultura();
        pf.addProduto("Rosas Vermelhas", "Buques", 2.50);
        pf.addProduto("Rosas Brancas", "Buques", 3.50);
        pf.addProduto("Cestas Oval", "Cestas", 23.50);
        pf.addProduto("Cestas Quadrada", "Cestas", 20.00);
        pf.addProduto("Vasos Oval", "Vasos", 2018.50);
        pf.addProduto("Vasos Quadrado", "Vasos", 1899.50);
        pf.addProduto("Rosas Vermelhas", "Mudas", 0.50);
        pf.addProduto("Rosas Brancas", "Mudas", 0.50);

        relatorio.imprimeProdutos(pf.createIterator(), descricao);
        
        
        //Observer
        System.out.println("\nPadrao Observer\n");
        
        //Adapter
        System.out.println("\nPadrao de Adapter\n");
        Produto flor = new Produto("Rosas Brancas", .50, "Buques");
        Produto chocolate = new Chocolate("Chocolate Amargo", 5.0, "Doces");
        ChocolateAdapter chocolateProduto = new ChocolateAdapter( (Chocolate) chocolate);
        
        //teste1
        flor.analisar();
        chocolateProduto.analisar();
        
        
    }

}
