/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaodp2;

import Observer.Motorista;
import Observer.Observador;
import observer.Observer.Veiculo;
import adapter.classes.Chocolate;
import adapter.classes.ChocolateAdapter;
import adapter.interfaces.Analisar;
import iterator.classes.Produto;
import iterator.classes.ProdutosFloricultura;
import iterator.classes.Relatorio;

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
         Veiculo gol = new Veiculo();
        
        Observador motorista = new Motorista("Jusicrelson", gol);
        gol.receberSaida("Pato Branco - Bairro Alvorada.");
        gol.receberSaida("Francisco Beltrão - Centro.");

        Observador mmotorista2 = new Motorista("Maria", gol);
        Observador mmotorista3 = new Motorista("Jonisvaldo", gol);
        gol.receberSaida("Francisco Beltrão - Vila Nova.");   
           
             
        
        //Adapter
        System.out.println("\nPadrao de Adapter\n");
        Analisar flor = new Produto("Rosas Brancas", .50, "Buques");
        Analisar chocolateProduto = new ChocolateAdapter( new Chocolate("Chocolate Amargo", 5.0, "Doces"));
        
        //teste1
        flor.analisar();
        chocolateProduto.analisar();
        
        
    }

}
